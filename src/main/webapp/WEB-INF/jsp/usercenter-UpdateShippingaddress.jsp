<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    
   
    %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/common.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/user_style.css" rel="stylesheet" type="text/css" />
<link href="skins/all.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
<script src="js/jquery.SuperSlide.2.1.1.js" type="text/javascript"></script>
<script src="js/common_js.js" type="text/javascript"></script>
<script src="js/footer.js" type="text/javascript"></script>
<script src="layer/layer.js" type="text/javascript"></script>
<script src="js/iCheck.js" type="text/javascript"></script>
<script src="js/custom.js" type="text/javascript"></script>
<title>用户中心-收货地址</title>
</head>
<script type="text/javascript">
	var flag = true;

	
	function youcheck(){
		var rag=/^[\d]{6}$/;
		if(rag.test(document.getElementById("you").value)){
			flag =  true;
		}else{
			document.getElementById("err").innerHTML="邮编必须为6位";
			flag =  false;
		}
	}

	function Tcheck(){
		if(flag){
			return true;
		}else{
			return false;
		}
	}
	
	function con(id){
		if(confirm("确认删除")){
			window.location.href="mmallshipping/del?id="+id;
		}
	}
	

</script>
<body>
<head>
 <div id="header_top">
  <c:import url="Top.jsp"></c:import>
  <div id="header"  class="header page_style">
  <div class="logo"><a href="index.html"><img src="images/logo.png" /></a></div>
  <!--结束图层-->
  <div class="Search">
        <div class="search_list">
            <ul>
                <li class="current"><a href="#">产品</a></li>
                <li><a href="#">信息</a></li>
            </ul>
        </div>
        <div class="clear search_cur">
           <input name="searchName" id="searchName" class="search_box" onkeydown="keyDownSearch()" type="text">
           <input name="" type="submit" value="搜 索"  class="Search_btn"/>
        </div>
        <div class="clear hotword">热门搜索词：香醋&nbsp;&nbsp;&nbsp;茶叶&nbsp;&nbsp;&nbsp;草莓&nbsp;&nbsp;&nbsp;葡萄&nbsp;&nbsp;&nbsp;菜油</div>
</div>
<!--购物车样式-->
 <div class="hd_Shopping_list" id="Shopping_list">
   <div class="s_cart"><a href="#">我的购物车</a> <i class="ci-right">&gt;</i><i class="ci-count" id="shopping-amount">0</i></div>
   <div class="dorpdown-layer">
    <div class="spacer"></div>
	 <!--<div class="prompt"></div><div class="nogoods"><b></b>购物车中还没有商品，赶紧选购吧！</div>-->
	 <ul class="p_s_list">	
	 	<c:forEach items="${user.mmac.prodectid }" var="mmac">
	 		<li>
		    <div class="img"><img src="${mmac.pro.prodectmainimage }"></div>
		    <div class="content"><p class="name"><a href="#">${mmac.pro.prodectname }</a></p><p>${mmac.pro.categoryid.categoryname }</p></div>
			<div class="Operations">
			<p class="Price">${mmac.pro.prodectprice }</p>
			<p><a href="${mmac.pro.prodectid }">删除</a></p></div>
		  </li>
	 	</c:forEach>   
		
		</ul>		
	 <div class="Shopping_style">
	 <div class="p-total">共<c:if test="${empty prodectsize }">0</c:if><c:if test="${not empty prodectsize }"><b>${prodectsize }</b></c:if>件商品　共计<strong>￥<c:if test="${empty money }">0.00</c:if> <c:if test="${not empty money }">${money }</c:if></strong></div>
	  <a href="Shop_cart.html" title="去购物车结算" id="btn-payforgoods" class="Shopping">去购物车结算</a>
	 </div>	 
   </div>
 </div>
</div>
<!--菜单栏-->
	<div class="Navigation" id="Navigation">
		 <ul class="Navigation_name">
			<li><a href="Home.html">首页</a></li>
			<li><a href="#">你身边的超市</a></li>
			<li><a href="#">预售专区</a><em class="hot_icon"></em></li>
			<li><a href="products_list.html">商城</a></li>
			<li><a href="#">半小时生活圈</a></li>
			<li><a href="#">好评商户</a></li>
			<li><a href="#">热销活动</a></li>
			<li><a href="Brands.html">联系我们</a></li>
		 </ul>			 
		</div>
	<script>$("#Navigation").slide({titCell:".Navigation_name li",trigger:"click"});</script>
    </div>
</head>
<!--用户中心样式-->
<div class="user_style clearfix">
 <div class="user_center clearfix">
   <div class="left_style">
     <div class="menu_style">
     <div class="user_title">用户中心</div>
     <div class="user_Head">
     <div class="user_portrait">
      <a href="#" title="修改头像" class="btn_link"></a> <img src="images/people.png">
      <div class="background_img"></div>
      </div>
      <div class="user_name">
       <p><span class="name">${user.username }</span><a href="mmalluser/toresetpwd">[修改密码]</a></p>
       <p>访问时间：<span id="totime"></span></p>
       </div>           
     </div>
     <div class="sideMen">
     <!--菜单列表图层-->
     <dl class="accountSideOption1">
      <dt class="transaction_manage"><em class="icon_1"></em>订单管理</dt>
      <dd>
        <ul>
          <li> <a href="mmallorder/Myorder">我的订单</a></li>
          <li> <a href="mmallshipping/address">收货地址</a></li>
          <li> <a href="#">缺货登记</a></li>
          <li><a href="#">跟踪包裹</a></li>
        </ul>
      </dd>
    </dl>
     <dl class="accountSideOption1">
      <dt class="transaction_manage"><em class="icon_2"></em>会员管理</dt>
        <dd>
      <ul>
        <li> <a href="#"> 用户信息</a></li>
        <li> <a href="用户中心-我的收藏.html"> 我的收藏</a></li>
        <li> <a href="#"> 我的留言</a></li>
        <li> <a href="#">我的标签</a></li>
        <li> <a href="#"> 我的推荐</a></li>
        <li><a href="#"> 我的评论</a></li>
      </ul>
    </dd>
    </dl>
     <dl class="accountSideOption1">
      <dt class="transaction_manage"><em class="icon_3"></em>账户管理</dt>
      <dd>
       <ul>
        <li><a href="用户中心-账户管理.html">账户余额</a></li>
       <li><a href="用户中心-消费记录.html">消费记录</a></li>     
       <li><a href="#">资金管理</a></li>
      </ul>
     </dd>
    </dl>
     <dl class="accountSideOption1">
      <dt class="transaction_manage"><em class="icon_4"></em>分销管理</dt>
      <dd>
        <ul>
          <li> <a href="#">店铺管理</a></li>
          <li> <a href="#">我的盟友</a></li>
          <li> <a href="#">我的佣金</a></li>
          <li> <a href="#">申请提现</a></li>
        </ul>
      </dd>
    </dl>
    </div>
      <script>jQuery(".sideMen").slide({titCell:"dt", targetCell:"dd",trigger:"click",defaultIndex:0,effect:"slideDown",delayTime:300,returnDefault:true});</script>
   </div>
 </div>
 <!--右侧样式属性-->
 <div class="right_style">
 <!--地址管理-->
 
  <div class="user_address_style">
  <form action="mmallshipping/updateaddress" method="post" onsubmit="return Tcheck()">
    <div class="title_style"><em></em>地址管理</div> 
   <div class="add_address">
    <span class="name">修改送货地址</span>
    <table cellpadding="0" cellspacing="0" width="100%">
     <tr><td class="label_name">收&nbsp;货&nbsp;&nbsp;人：</td><td><input name="name" type="text"  class="add_text" style=" width:100px" required="required" value="${shi.receivename }"/><i>*</i></td></tr>
     <tr><td class="label_name">所在地区：</td><td>
                <input type="text" value="${shi.receiveprovince }-${shi.receivecity }-${shi.receivedistrict }" id="addr-show" required="required" name="address">
            
            <!--省份选择-->
            <select id="prov" onchange="showCity(this)">
                <option>=请选择省份=</option>
            </select>

            <!--城市选择-->
            <select id="city" onchange="showCountry(this)">
                <option>=请选择城市=</option>
            </select>

            <!--县区选择-->
            <select id="country" onchange="selecCountry(this)">
                <option>=请选择县区=</option>
            </select>
            <button type="button" class="btn met1" onClick="showAddr()">确定</button>
  <i>*</i></td></tr>
     <tr><td class="label_name">街道地址：</td><td><textarea name="jiedao" cols="" rows="" style=" width:500px; height:100px; margin:5px 0px" required="required">${shi.receiveaddress }</textarea><i>*</i></td></tr>
     <tr><td class="label_name">邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;编：</td><td><input name="youbian" type="text" class="add_text" style=" width:100px" required="required" id="you" onblur="youcheck()" value="${shi.receivezip }"/><i>*</i></td></tr>
     <tr><td class="label_name">手&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;机：</td><td><input name="shouji" type="text" class="add_text" style=" width:200px" value="${shi.receivemobile }" required="required"/>&nbsp;&nbsp;(选填)</td></tr>
     <tr><td class="label_name">固定电话：</td>
     <td><input name="qu" type="text" class="add_text" style="width:60px" placeholder="区号"/>-<input name="zuoji" type="text" class="add_text" style="width:100px" placeholder="电话号码"/>-<input name="fenji" type="text" class="add_text" style="width:60px" placeholder="分机号"/>&nbsp;&nbsp;(选填)</td></tr>
     <tr class="moren_dz" style="color: #999"><td class="label_name"></td><td><label><input name="" type="checkbox" value="" />设置为默认地址</label></td></tr>
     <tr><td colspan="2" class="center"><input type="submit" value="保存"  class="add_dzbtn" /><input name="" type="reset" value="清空"  class="reset_btn"/><span id="err" style="color: red"></span></td></tr>
    </table>
   </div>
   <input name="id" value="${shi.shippingid }" type="hidden">
   </form> 
  </div>
  
  
  
  
 </div>
 </div>
 </div>
 
    <script>
            $(document).ready(function(){
              $('.moren_dz input').iCheck({
                checkboxClass: 'icheckbox_flat-green',
                radioClass: 'iradio_flat-green'
              });
            });
            </script>
 <!--网站地图-->
<div class="fri-link-bg clearfix">
    <div class="fri-link">
        <div class="logo left margin-r20"><img src="images/fo-logo.jpg" width="152" height="81" /></div>
        <div class="left"><img src="images/qd.jpg" width="90"  height="90" />
            <p>扫描下载APP</p>
        </div>
       <div class="">
    <dl>
	 <dt>新手上路</dt>
	 <dd><a href="#">售后流程</a></dd>
     <dd><a href="#">购物流程</a></dd>
     <dd><a href="#">订购方式</a> </dd>
     <dd><a href="#">隐私声明 </a></dd>
     <dd><a href="#">推荐分享说明 </a></dd>
	</dl>
	<dl>
	 <dt>配送与支付</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>
	<dl>
	 <dt>售后保障</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>
	<dl>
	 <dt>支付方式</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>	
    <dl>
	 <dt>帮助中心</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>
     <dl>
	 <dt>帮助中心</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>
	   
   </div>
    </div>
</div>
<!--网站地图END-->
<!--网站页脚-->
<div class="copyright">
    <div class="copyright-bg">
        <div class="hotline">为生活充电在线 <span>招商热线：****-********</span> 客服热线：400-******</div>
        <div class="hotline co-ph">
            <p>版权所有Copyright ©***************</p>
            <p>*ICP备***************号 不良信息举报</p>
            <p>总机电话：****-*********/194/195/196 客服电话：4000****** 传 真：********
                
                E-mail:****@****.gov.cn</p>
        </div>
    </div>
</div>
<script src="js/city.js"></script>
<script src="js/city02.js"></script>
<script src="js/method01.js"></script>
<script type="text/javascript">
window.onload = function(){
	alert(1)
	document.getElementById("totime").innerHTML=new Date().toLocaleDateString()+" "+new Date().toLocaleTimeString();
}
</script>
</body>

</html>