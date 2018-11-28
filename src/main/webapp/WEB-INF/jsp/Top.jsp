<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
</head>
<script type="text/javascript">
	$(document).ready(function(){
		var time = new Date().getHours();
		if(time>=8&&time<11){
			$("#topp").html("早上好");
		}else if(time>=11&&time<13){
			$("#topp").html("中午好");
		}else if(time>=13&&time<19){
			$("#topp").html("下午好");
		}else if(time>=19&&time<=24){
			$("#topp").html("晚上好");
		}else{
			$("#topp").html("晚上好");
		}
	});
</script>
<body>
	  <div id="top">
	  
    <div class="Inside_pages">
    
    <c:if test="${empty user }">
      <div class="Collection"><a href="login" class="green">请登录</a> <a href="registration" class="green">免费注册</a></div>
   			<div class="hd_top_manu clearfix">
	  <ul class="clearfix">
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href=index>首页</a></li> 
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"> <a href="#">我的小充</a> </li>
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">消息中心</a></li>
       <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">商品分类</a></li>
        <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">我的购物车<b>(23)</b></a></li>	
	  </ul>
	</div>
    </c:if>
    
    <c:if test="${not empty user }">
      <div class="Collection"><p>尊敬的<a href="mmalluser/AcountManage">${user.username }</a>,<span id="topp"></span></p></div>
    		<div class="hd_top_manu clearfix">
	  <ul class="clearfix">
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href=index>首页</a></li> 
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"> <a href="#">我的小充</a> </li>
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">消息中心</a></li>
       <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">商品分类</a></li>
        <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">我的购物车<b>${user.mmac.cartquantity }</b></a></li>	
	  <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="mmalluser/Introduction">退出登录</a></li>
	  </ul>
	</div>
    
    </c:if>
    

    </div>
    
  </div>
</body>
</html>