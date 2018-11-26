<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    
   
    %>
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
<script src="js/iCheck.js" type="text/javascript"></script>
<script src="js/custom.js" type="text/javascript"></script>
<title>我的提现账单</title>
</head>

<body>
<!--提现账单样式-->
<div class="tx_Bill_style">
 <table cellpadding="0" cellspacing="0"  class="Bill_style">
  <thead><tr class="label_name"><td width="150">创建时间</td><td width="160">交易号</td><td width="160">账号</td><td width="100">金额</td><td width="80">状态</td><td width="170">备注</td><td width="80">操作</td></tr></thead>
  <tbody>
  <tr><td>2016-4-11 12:34:22</td><td>DF4960324300120</td><td>建行 ****3454</td><td>6000</td><td>提现中</td><td></td><td><a  href="#" class="Bill_detailed">详细</a></td></tr>
  <tr><td>2016-4-11 12:34:22</td><td>DF4960324300120</td><td>建行 ****3454</td><td>6000</td><td>已完成</td><td></td><td><a  href="#" class="Bill_detailed">详细</a></td></tr>
  <tr><td>2016-4-11 12:34:22</td><td>DF4960324300120</td><td>建行 ****3454</td><td>6000</td><td>交易失败</td><td>账号非本人账户</td><td><a  href="#" class="Bill_detailed">详细</a></td></tr>
  <tr><td>2016-4-11 12:34:22</td><td>DF4960324300120</td><td>建行 ****3454</td><td>6000</td><td>已完成</td><td></td><td><a  href="#" class="Bill_detailed">详细</a></td></tr>
  <tr><td>2016-4-11 12:34:22</td><td>DF4960324300120</td><td>建行 ****3454</td><td>6000</td><td>已完成</td><td></td><td><a  href="#" class="Bill_detailed">详细</a></td></tr>
  </tbody>   
 </table>
</div>
</body>
</html>
 