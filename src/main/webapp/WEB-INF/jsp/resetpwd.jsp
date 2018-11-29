<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html >
<html>
<head lang="en">
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link href="css/base.css" rel="stylesheet" type="text/css">
<link href="css/css.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<style>
.tab {
	overflow: hidden;
	margin-top: 20px; margin-bottom:-1px;
}
.tab li {
	display: block;
	float: left;
	width: 100px;padding:10px 20px; cursor:pointer; border:1px solid #ccc; 
}
.tab li.on {
	background: #90B831; color:#FFF;padding:10px 20px;
}
.conlist {padding:30px; border:1px solid #ccc; width:300px;}
.conbox {
	display: none;
}
.msgs1{
     background:blue; 
   }
</style>
<script type="text/javascript">
// var xxx=false;  var aaa=false;
// $(function(){
// 	$(".tab li").each(function(i){
// 		$(this).click(function(){
// 		$(this).addClass("on").siblings().removeClass("on");
// 		$(".conlist .conbox").eq(i).show().siblings().hide();
// 		})
// 	})
// })
/*买家 */
// function yanzhen(){	
// 	var username1=document.getElementById("username1").value;		
// 	var userrole1=document.getElementById("userrole1").value;												
// 	$.post("mmalluser/listusername?username="+username1+"&userrole="+userrole1,function(data){						
// 			if(data=='1'){				
// 			var a=document.getElementById("abc");
// 			a.innerHTML="账号已注册";
// 			a.style.color="red";
// 			xxx=false;
// 		}else{
// 			var a=document.getElementById("abc");
// 			a.innerHTML="账号可用";
// 			a.style.color="green";
// 			xxx=true;
// 		}			
// 	})				
// }
function than(){
	var pwd1=document.getElementById("pwd1").value;	
	var pwd2=document.getElementById("pwd2").value;
	if(pwd1==pwd2){
		var a=document.getElementById("aaa");
		a.innerHTML="";
		aaa=true;	
	}else{		
		var a=document.getElementById("aaa");
		a.innerHTML="二次密码不匹配";
		a.style.color="red";	
		aaa=false;
	}			
}
function denglu(){
	window.location.href="mmalluser/userlogin";
	
}
// function comit(){
	
// 	 if(xxx&aaa){		 
// 		 return true;
// 	 }else{
// 		 alert("账号已注册");
// 		 return false;		 
// 	 }	
// }
/*邮箱验证 */
// function dianji(){
// 	var useremail =document.getElementById("useremail1").value;
// 		if(useremail==""&-1==useremail.indexOf("@")){
// 			alert("邮箱格式不正确")
// 			return;
// 		}
// 	$.post("mmalluser/emailvalidation?useremail="+useremail,function(data){})		
//    	 alert("验证码已经成功发送，请注意查收！");
// 	    var validCode=true;        
//         var time=30;
//         var code=document.getElementById("button1");       
//         if (validCode){
//             validCode=false;
//              code.style.color="black"; 
//             var t=setInterval(function(){         
//             	time--;
//             	code.innerHTML=time+"秒";//这里
//             if (time==0) {
//                 clearInterval(t);        
//             	code.innerHTML="重发";//同上
//                 validCode=true;
//                 code.style.color="gray"; 
//             }
//         },1000)
//         }      	
// }
/* 卖家 */
// function yanzhen2(){	
// 	var username2=document.getElementById("username2").value;	
// 	var userrole2=document.getElementById("userrole2").value;												
// 	$.post("mmalluser/listusername?username="+username2+"&userrole="+userrole2,function(data){						
// 			if(data=='1'){				
// 			var a=document.getElementById("acb");
// 			a.innerHTML="账号已注册";
// 			a.style.color="red";
// 			xxx=false;
// 		}else{
			
// 			var a=document.getElementById("acb");
// 			a.innerHTML="账号可用";
// 			a.style.color="green";
// 			xxx=true;
// 		}			
// 	})				
// }
// function than2(){
// 	var pwd3=document.getElementById("pwd3").value;
// 	var pwd4=document.getElementById("pwd4").value;
// 	if(pwd3==pwd4){
// 		var a=document.getElementById("bbb");
// 		a.innerHTML="";
// 		aaa=true;
			
// 	}else{		
// 		var a=document.getElementById("bbb");
// 		a.innerHTML="二次密码不匹配";
// 		a.style.color="red";
// 		aaa=false;
// 	}			
// }
// function comit2(){
	
// 	 if(xxx&aaa){		 
// 		 return true;
// 	 }else{
// 		 alert("账号已注册");
// 		 return false;		 
// 	 }	
// }
/*邮箱验证 */
// function dianji2(){
// 	var useremail =document.getElementById("useremail2").value;
// 		if(useremail==""&-1==useremail.indexOf("@")){
// 			alert("邮箱格式不正确")
// 			return;
// 		}
// 	$.post("mmalluser/emailvalidation?useremail="+useremai2,function(data){})		
//    	 alert("验证码已经成功发送，请注意查收！");
// 	    var validCode=true;        
//         var time=30;
//         var code=document.getElementById("button2");       
//         if (validCode){
//             validCode=false;
//              code.style.color="black"; 
//             var t=setInterval(function(){         
//             	time--;
//             	code.innerHTML=time+"秒";//这里
//             if (time==0) {
//                 clearInterval(t);        
//             	code.innerHTML="重发";//同上
//                 validCode=true;
//                 code.style.color="gray"; 
//             }
//         },1000)
//         }      	
// }
</script>
</head>
<%-- ${res} --%>
<body class="l-bg">
<div class="login-top">
    <div class="wrapper">
        <div class="fl font30">LOGO</div>
        <div class="fr">您好，欢迎为生活充电在线！</div>
    </div>
</div>
<div class="l_main2" style="height:880px">
    <div class="l_bttitle"> 
        <h2>重置密码</h2>
    </div>
    <div class="loginbox">
       
        <div class="conlist">
				<div class="conbox" style="display: block;">
				
					<form action="mmalluser/resetpwd" method="post">																										
					<p>
						<input type="hidden"   value="1" name="userrole" id="userrole1">			
					</p>
					
					<p>
					<div class="fl res-text" style="width: 150px">输入新密码：</div>
					<div>
						<input type="password" class="loginuser" id="pwd1" name="userpassword">
					</div>
					</p>
					
					<p>
					<div class="fl res-text"  style="width: 150px">确认密码：</div>
					<div>
						<input type="password" id="pwd2" class="loginuser" onblur="than()">
					</div>
						<div><span id="aaa"></span></div>
					</p>
																								
					<p>
						<input type="submit" class="loginbtn" value="重 置" style="width: 200px"> 
					</p>
					<p>
						<span style="color: red;">${mess } </span>
					</p>
					<p>
						<input type="button" onclick="denglu()" class="loginbtn" value="登 陆" style="width: 200px">
						
					</p>
				</form>
				</div>
													
										
				
			</div>
		</div>
	</div>
</body>
</html>
