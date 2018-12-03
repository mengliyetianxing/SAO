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
<link href="css/login.css" rel="stylesheet" type="text/css" />
<link href="css/user_style.css" rel="stylesheet" type="text/css" />
<link href="skins/all.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
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
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("ttime").innerHTML=new Date().toLocaleDateString()+" "+new Date().toLocaleTimeString();
	}
	</script>
<title>我的购物车</title>
</head>
<body>	
  <c:import url="Top.jsp"></c:import>
  <div  class="head1">
  <div  class="head2">
  <div class="head3"> 	
  		<a href=""><img src="images/logo.png"/></a>
  	</div>      
        <div class="head4" >
        	<select class="input3" name="select" >        	
        	<option>宝贝</option>
        	<option>店铺</option>       	        	
        	</select>
          	 <input  type="text" class="input1" >
           <input type="submit" value="搜 索" class="input2" />
        </div>
</div> 
</div>
<!-- 头部模块 -->



<div  class="trunk" ><!--最大的盒子  -->
 <div class="trunk1">
     <div class="trunk_1"><h1>用户中心<h1></div>
     <div class="trunk_2">
     <div  class="trunk_3" >
      <a></a><img src="images/people.png">
      </div>
      	<div class="trunk_4">
      	<div  class="name">
       	<span>${user.username }</span></br>      		
       	<span>访问时间:</span>
       	</div>  
       	<span id="ttime"></span>
       </div>           
     </div>
     <div  class="trunk_5">
     <!--菜单列表图层-->     
          <h3> <a href="#">查看我买过的宝贝</a></h3>
          <h3> <a href="#">查看我的收货地址</a></h3>   
    </div>
 </div> 
 
 <!--右侧样式-->
  <div class="trunk2">
  <div class="trunk2_1"><h1>我的购物车|<h1></div> 
      <div  class="trunk2_2">			
		 <div  class="trunk2_3">		 
		 	<span>商品信息</span>		 	
		 	</div>
		 	<div class="trunk2_4">
		 	
		 	<span>单价</span>
		 	
		 	</div>
     	 <div class="trunk2_5">
			
		 	<span>数量</span>
		 	
		 	</div>
		 <div  class="trunk2_6">    		
     		
		 	<span>金额</span>
		 			
     		</div>
     	<div class="trunk2_7">     		
     		
		 	<span>操作</span>
		 	
     		</div>
     		</div>
         
         <div  class="trunk3"> <!-- 外层大盒子  -->                     
            <div class="trunk3_1">			
		 	<div class="trunk3_2">
		 	
		 	<span>123123123</span>
		 	
		 	</div>     		
			 <div class="trunk3_3">
		 	
		 	<span>123123123</span>
		 	
		 	</div>
     	 <div   class="trunk3_4">
			 
		 	 <span>123123123</span>
		 	
		 	</div>
		 <div  class="trunk3_5">    		
     		
		 	<span>123123123</span>
		 	   		
     		</div>
     	<div  class="trunk3_6">
     		     		
             <a href="#">联系客服</a></br>
             <a href="#">删除</a>           		 	
     		</div>
     		</div>           
           </div>  
           
           
           
           
           
           <div class="tail1" >			
		 <div  class="tail1_1" >
		 	
		 	<span style="margin-left: 20px;"><a>全选</a></span>
		 	
		 	</div>
		 <div  class="tail1_2" >
		 	
		 	<span><a >删除</a></span>
		 	
		 	</div>
     	 <div  class="tail1_3" >
			
		 	 <span><a >分享</a></span>
		 	
		 	</div>
     	<div  class="tail1_4" ></div>
		 <div class="tail1_7">    		
     		
		 	<span>已选商品<span>0</span>件</span>
		 	   		
     		</div>
     	<div  class="tail1_5">
     		
     		
		 	<span> 合计(不含运费):<span>0.00</span>元</span>
		 	
     		</div>
     	<div  class="tail1_6">     			
		 		<button>结算</button>		 	   			
     		</div>
     		</div>
     	  	</div>
          	</div>
	
<!--网站地图-->
	<div class="under">
    <div class="under1">
        <div class="under1_1"><img src="images/fo-logo.jpg"/></div>
        <div class="under1_2"><img src="images/qd.jpg"/>
            <h5>扫描下载APP</h5>
        </div>
       <div class="under2">
    <div class="under2_1">
	 <h3>新手上路</h3>
	 <dd><a >售后流程</a></dd>
     <dd><a >购物流程</a></dd>
     <dd><a >订购方式</a> </dd>
     <dd><a>隐私声明 </a></dd>
     <dd><a>推荐分享说明 </a></dd>
	</div>
	<div class="under2_2">
	 <h3>配送与支付</h3>
	 <dd><a >保险需求测试</a></dd>
     <dd><a >专题及活动</a></dd>
     <dd><a >挑选保险产品</a> </dd>
     <dd><a>常见问题 </a></dd>
	</div>
	<div class="under2_3">
	 <h3>售后保障</h3>
	 <dd><a >保险需求测试</a></dd>
     <dd><a >专题及活动</a></dd>
     <dd><a >挑选保险产品</a> </dd>
     <dd><a >常见问题 </a></dd>
	</div>	
   </div>
    </div>
<div class="under3">      
        <span>开放平台诚征英才联系我们网站地图隐私权政策法律声明知识产权 | © 2003-现在 Taobao.com 版权所有</span></br>

		<span>网络文化经营许可证：浙网文[2016]0268-027号|增值电信业务经营许可证：浙B2-20080224|</span></br>
		<span>信息网络传播视听许可证：1109364号|互联网违法和不良信息举报电话：0571-81683755 blxxjb@alibaba-inc.com</span></br>

 	<span>浙公网安备 33010002000078号 |（浙）网械平台备字[2018]第00004号|出版物网络交易平台服务经营备案证：新出发浙备字第002号|互联网药品信息服务资格证书编号：（浙）-经营性-2018-0010</span>
</div>
</div>
</body>
</html>
