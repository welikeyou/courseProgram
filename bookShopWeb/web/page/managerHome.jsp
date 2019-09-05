<%--
  Created by IntelliJ IDEA.
  User: LiLan
  Date: 2019/5/3
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table class="hovertable">
    <tr>
        <th>商品名称</th><th>单价</th><th>类型</th> <th>库存</th><th>图片</th><th>描述</th><th>操作</th>
    </tr>
    <tr contenteditable="true" onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
        <td >假如给我三天光明</td><td>39元</td><td>经典文学</td><td>1780</td><td>img/threeLight.jpg</td><td>海伦接受了生命的挑战，用爱心去拥抱世界，以惊人的毅力面对困境，终于在黑暗中找到了人生的光明面，最后又把慈爱的双手伸向全世界。</td><td><input type="button" value="修改" onclick="change()"> <input type="button" value="删除" onclick="toDelete ()"></td>
    </tr>
    <!--<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">-->
    <!--<td>飘</td><td>45元</td><td>经典文学</td><td>1380</td><td>img/theWind.jpg</td><td>经典的一本书籍</td><td><input type="button" value="修改" onclick="change()"> <input type="button" value="删除"></td>-->
    <!--</tr>-->
    <tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
        <td>五年高考三年模拟</td><td>250元</td><td>教辅资料</td><td>3780</td><td>img/五年高考三年模拟.jpg</td><td>高考必备</td><td><input type="button" value="修改"> <input type="button" value="删除"></td>
    </tr>
    <tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
        <td>三体</td><td>32元</td><td>网络文学</td><td>689</td><td>img/三体.jpg</td><td>科幻巨著</td><td><input type="button" value="修改"> <input type="button" value="删除"></td>
    </tr>
    <tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
        <td>知识清单</td><td>39.8元</td><td>教辅资料</td><td>3459</td><td>img/知识清单.jpg</td><td>化学教辅资料</td><td><input type="button" value="修改"> <input type="button" value="删除"></td>
    </tr>
    <tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
        <td>倍速学习法</td><td>29.44元</td><td>教辅资料</td><td>3459</td><td>img/倍速学习法.jpg</td><td>小学课程资料</td><td><input type="button" value="修改"> <input type="button" value="删除"></td>
    </tr>
    <tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
        <td>斗破苍穹</td><td>29.44元</td><td>网络文学</td><td>3459</td><td>img/斗破苍穹.jpg</td><td>玄幻</td><td><input type="button" value="修改"> <input type="button" value="删除"></td>
    </tr>
    <tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
        <td>阿衰</td><td>8元</td><td></td><td>3459</td><td>img/阿衰.jpg</td><td>爆笑经典</td><td><input type="button" value="修改"> <input type="button" value="删除"></td>
    </tr>
</table>
<input type="button" value="添加" class="addGoods">
<div class="addGoodsBg" id="addGoodsBg" style="display: none">
    <div class="addGoodsDiv" id="addGoodsDiv" >
        <span>名称</span><input type="text"><br/>
        <span>单价</span><input type="text"><br/>
        <span>类型</span><input type="text"><br/>
        <span>库存</span><input type="text"><br/>
        <span>图片</span><input type="text"><br/>
        <span>描述</span><input type="text"><br/>
        <input type="button" value="确定" class="addBtn" id="sureBtn" onclick="sure()"> <input type="button" value="取消" class="addBtn" id="cancelBtn" onclick="cancle()">
    </div>
</div>

</body>

<script>
    function change() {
    var addGoodsBg = document.getElementById("addGoodsBg");
    addGoodsBg.style.display="display";
    }
    function cancel() {
        var addGoodsBg = document.getElementById("addGoodsBg");
        addGoodsBg.style.display="none";
    }
</script>
</html>
