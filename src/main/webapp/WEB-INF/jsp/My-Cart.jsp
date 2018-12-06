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
	<!-- /*$(document).ready(function(){
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
	});	 -->

<script type="text/javascript">

		function del(id){
			if(confirm("确定删除商品吗")){	
		window.location.href="mmallcart/delete?prodectid="+id;
			}
		}

	window.onload = function(){
		var a=document.getElementsByName("xuanzekuang");			
			for(var i=0;i<a.length;i++){					
				a[i].checked=false;					
			}
		var time = new Date().getHours();
		if(time>=8&&time<11){
			document.getElementById("topp").innerHTML="早上好";
		}else if(time>=11&&time<13){
			document.getElementById("topp").innerHTML="中午好";
		}else if(time>=13&&time<19){
			document.getElementById("topp").innerHTML="下午好";
		}else if(time>=19&&time<=24){
			document.getElementById("topp").innerHTML="晚上好";
		}else{
			document.getElementById("topp").innerHTML="晚上好";
		}		
		document.getElementById("ttime").innerHTML=new Date().toLocaleDateString()+" "+new Date().toLocaleTimeString();		
		document.getElementById("inputtwo").setAttribute("disabled", true);
	}
	
	function jian(i){
		var input=parseInt(document.getElementById("inputone"+i).value);
		var money=Number(document.getElementById("money"+i).innerHTML);
		var danjia=parseInt(document.getElementById("prodectprice"+i).innerHTML);			
			if(input>1){
				var statue=document.getElementById("xuanzekuang"+i);
				if(statue.checked){
					document.getElementById("inputone"+i).value=input-1;				
					money=danjia*(input-1);
					document.getElementById("money"+i).innerHTML=money;
					var money=Number(document.getElementById("money"+i).innerHTML);
					var input=parseInt(document.getElementById("inputone"+i).value);
					var jianshu=parseInt(document.getElementById("jianshu").innerHTML);
					document.getElementById("jianshu").innerHTML=jianshu-1;
					var jiesuan=Number(document.getElementById("jiesuan").innerHTML);
					document.getElementById("jiesuan").innerHTML=jiesuan-danjia;
					document.getElementById("inputtwo").disabled=false;
				}else{
						document.getElementById("inputone"+i).value=input-1;				
						money=danjia*(input-1);
						document.getElementById("money"+i).innerHTML=money;
						
				}
			}			
	}
	function jia(i){
		var input=parseInt(document.getElementById("inputone"+i).value);
		var money=Number(document.getElementById("money"+i).innerHTML);
		var danjia=parseInt(document.getElementById("prodectprice"+i).innerHTML);	
			
			if(input<100){
				var statue=document.getElementById("xuanzekuang"+i);
				if(statue.checked){
					var money=Number(document.getElementById("money"+i).innerHTML);
					var input=parseInt(document.getElementById("inputone"+i).value);
					var jianshu=parseInt(document.getElementById("jianshu").innerHTML);
					document.getElementById("jianshu").innerHTML=jianshu+1;
					var jiesuan=Number(document.getElementById("jiesuan").innerHTML);
					document.getElementById("jiesuan").innerHTML=jiesuan+danjia;
					document.getElementById("inputone"+i).value=input+1;				
					money=danjia*(input+1);	
					document.getElementById("money"+i).innerHTML=money;
					document.getElementById("inputtwo").disabled=false;
					}else{
						document.getElementById("inputone"+i).value=input+1;				
						money=danjia*(input+1);	
						document.getElementById("money"+i).innerHTML=money;												

					}
				
			}		
	}	
	function gouxuan(i){
	
			var statue=document.getElementById("xuanzekuang"+i);
		if(statue.checked){
			var money=Number(document.getElementById("money"+i).innerHTML);
			var input=parseInt(document.getElementById("inputone"+i).value);
			var jianshu=parseInt(document.getElementById("jianshu").innerHTML);
			document.getElementById("jianshu").innerHTML=input+jianshu;
			var jiesuan=Number(document.getElementById("jiesuan").innerHTML);
			document.getElementById("jiesuan").innerHTML=money+jiesuan;
			document.getElementById("inputtwo").disabled=false;
		}else{
			var money=Number(document.getElementById("money"+i).innerHTML);
			var input=parseInt(document.getElementById("inputone"+i).value);
			var jianshu=parseInt(document.getElementById("jianshu").innerHTML);
			document.getElementById("jianshu").innerHTML=jianshu-input;
			var jiesuan=Number(document.getElementById("jiesuan").innerHTML);
			document.getElementById("jiesuan").innerHTML=jiesuan-money;
				var b=document.getElementsByName("xuanzekuang");
				var f =true;
					for(var i=0;i<b.length;i++){					
						if(b[i].checked){
							f=false;
						}				
					}
				if(f){										
					document.getElementById("inputtwo").setAttribute("disabled", true);
				}
		}
			
	}
	function quanxuan(){		
		var b=document.getElementsByName("xuanzekuang");
			for(var i=0;i<b.length;i++){					
				b[i].checked=true;				
			}	
		var kk=document.getElementsByName("totalprice");
		var jj=document.getElementsByName("cartquantity");
		var sum1=0;
		var sum2=0;
		for(var i=0;i<kk.length;i++){			
			sum1 +=parseInt(kk[i].innerHTML);			
			sum2 +=parseInt(jj[i].value);		
		}
		
		document.getElementById("jiesuan").innerHTML=sum1;
		document.getElementById("jianshu").innerHTML=sum2;
		document.getElementById("inputtwo").disabled=false;
	}
	 function search(){
		 var  shangpin=document.getElementById("content");
		 var code=document.getElementById("search");		 
		 	code.style.backgroundColor="gray";		 		 		 	 	 	
	 }
		
</script>
<title>我的购物车</title>
</head>
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
        <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="login">我的购物车<b>(23)</b></a></li>	
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
        <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="mmallcart/selcart">我的购物车<b>${user.mmac.cartquantity }</b></a></li>	
	  <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="mmalluser/Introduction">退出登录</a></li>
	  </ul>
	</div>
    
    </c:if>
    
	
    </div>
    
  </div>
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
          	 <input  type="text" class="input1" id="content" >
           <button type="button"  class="input2"  id="search" onclick="search()">搜索</button>
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
 <form action="mmallorder/Myorder" method="post" >
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
     		     		
 			<!-- 商品 -->
 			    
         <div  class="trunk3"> <!-- 外层大盒子  -->  
         	<c:forEach items="${cart}" var="cart" varStatus="cou">                      
            <div class="trunk3_1" name="">           		
		 	<div class="trunk3_2">
		 	<div  style="float:left;width:20px;" ><input name="xuanzekuang" id="xuanzekuang${cou.index}" onclick="gouxuan(${cou.index})" type="checkbox" value="${cart.pro.prodectid }"></div>		 	
		 	<div id="prodectname" name="prodectname">${cart.pro.prodectname}</div>		 	
		 	</div>     		
			 <div class="trunk3_3">			 	
		 		<div style="margin-left:30px;" id="prodectprice${cou.index}" class="prodectprice" name="prodectprice">${cart.pro.prodectprice}</div>		 		 				 						 	
		 	</div>
     	 	<div  class="trunk3_4">
     	 
						<button type="button"  class="button1" onclick="jian(${cou.index})" >-</button>
		 				<input id="inputone${cou.index}" name="cartquantity" type="text" value="${cart.cartquantity}" style="width: 30px;	height:15px;">
		 				<button type="button" class="button2" onclick="jia(${cou.index})" >+</button>			 	 		 	
		 	</div>
		 <div  class="trunk3_5">    		
     		
		 		<div id="money${cou.index}" style="margin-left:20px;" name="totalprice">${cart.totalprice}</div>		 	   		
     		</div>
     	<div  class="trunk3_6">     		     		
             <a href="#">联系客服</a></br>
             <a href="javascript:del(${cart.pro.prodectid})">删除</a>           		 	
     		</div>
     		</div>     		
     		</c:forEach>
     		
     		      		        
           </div>  
                                                                               
           <div class="tail1" >			
		 <div  class="tail1_1" >
		 	
		 	<span style="margin-left: 20px;"><a href="javascript:quanxuan()">全选</a></span>
		 	
		 	</div>
		 <div  class="tail1_2" >
		 	
		 	<span><a >删除</a></span>
		 	
		 	</div>
     	 <div  class="tail1_3" >
			
		 	 <span><a >分享</a></span>
		 	
		 	</div>
     	<div  class="tail1_4" ></div>
		 <div class="tail1_7">    		
     		
		 	<p>已选商品<span id="jianshu">0</span>件</p>
		 	   		
     		</div>
     		<div  class="tail1_5">
     		
     		
		 	<span> 合计(不含运费):<span id="jiesuan">0.00</span>元</span>
		 	
     		</div>
     	<div  class="tail1_6">     			
		 		<input class="inputtwo" id="inputtwo" value="结算" type="submit"
		 			style="margin-left:50px;width: 80px;height: 43px;
									background-color: #90b830" >	 	   			
     		</div>
     		</div>
     	  	</div>
     	  	</form>
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
