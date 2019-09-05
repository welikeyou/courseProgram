
function login() {
       // window,location.href="userHome.jsp"
         var loginForm = document.getElementById("loginForm");
         loginForm.submit();
         
    错误提示
  $.ajax({
         data : {
             'account' : $("#account").val(),
             'password' : $("#password").val(),
         },
         url : 'LoginServlet.do',//servlet
         type:'post',
         success : function(data) {
             if (data.toString() == 'fail') {
                 alert('登陆失败');
             }
         },
         error : function() {
             alert('请重试！');
         }
     })
    }

function toRegister() {
    var regiserForm = document.getElementById("regiserDiv");
    regiserForm.style.display = "";
}

function toDetail() {
    //将商品id传到detail界面
    var showDetailForm = document.getElementById("showDetailForm");
    showDetailForm.submit();
}

function toAddToCar() {

        alert("请先登陆");
}

function toLogin() {
    //关闭注册弹框
    var regiserForm = document.getElementById("regiserDiv");
    regiserForm.style.display = "none";
}

function register() {
    //验证
    var account = document.getElementById("accountReg").value;
    var name = document.getElementById("name").value;
    var password1 = document.getElementById("password1").value;
    var password2 = document.getElementById("password2").value;
    var registerForm = document.getElementById("registerForm");
    if(!(password1&&password2&&account&&name)){
        alert("不能为空");
    }else{
        if(password1!=password2){
            alert("两次密码不一致");
        }else{
            //提交表单，查询是否重复
            registerForm.submit();
        }

    }
}

function toHomePage() {
    //关闭添加到购物车弹框

}

function addToCar() {
    将商品Id和商品数量传递到AddToCarServlet
    var addToCarForm = document.getElementById("AddToCarForm");
    addToCarForm.submit();
}