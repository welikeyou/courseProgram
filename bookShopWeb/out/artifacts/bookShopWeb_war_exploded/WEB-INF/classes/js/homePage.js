 function login() {
        var loginForm = document.getElementById("loginForm");
        loginForm.submit();

    }

function toRegister() {
    var regiserForm = document.getElementById("regiserDiv");
    regiserForm.style.display = "display";
}

function toDetail() {
    //将商品id传到detail界面
    alert("详情");
    var showDetailForm = document.getElementById("showDetailForm");
    showDetailForm.submit();
}

function toAddToCar() {
    //将goodsId传递给购物弹框
   // 弹出加入购物车弹框
    document.getElementById("goodsIdAdd").value = document.getElementById("goodsId").value;
}

function toLogin() {
    //关闭注册弹框

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