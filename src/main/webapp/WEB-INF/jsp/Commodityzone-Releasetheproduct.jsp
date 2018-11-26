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
<link href="css/jquery-labelauty.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
<script src="js/jquery.SuperSlide.2.1.1.js" type="text/javascript"></script>
<script src="js/common_js.js" type="text/javascript"></script>
<script src="js/footer.js" type="text/javascript"></script>
<script src="js/jquery-labelauty.js" type="text/javascript"></script>
<title>发布商品</title>
</head>

<body>
<head>
 <div id="header_top">
  <div id="top">
    <div class="Inside_pages">
      <div class="Collection"><a href="#" class="green">请登录</a> <a href="#" class="green">免费注册</a></div>
	<div class="hd_top_manu clearfix">
	  <ul class="clearfix">
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">首页</a></li> 
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"> <a href="#">我的小充</a> </li>
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">消息中心</a></li>
       <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">商品分类</a></li>
        <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">我的购物车<b>(23)</b></a></li>	
	  </ul>
	</div>
    </div>
  </div>
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
		<li>
		    <div class="img"><img src="images/tianma.png"></div>
		    <div class="content"><p class="name"><a href="#">产品名称</a></p><p>颜色分类:紫花8255尺码:XL</p></div>
			<div class="Operations">
			<p class="Price">￥55.00</p>
			<p><a href="#">删除</a></p></div>
		  </li>
		</ul>		
	 <div class="Shopping_style">
	 <div class="p-total">共<b>1</b>件商品　共计<strong>￥ 515.00</strong></div>
	  <a href="Shop_cart.html" title="去购物车结算" id="btn-payforgoods" class="Shopping">去购物车结算</a>
	 </div>	 
   </div>
 </div>
</div>
<!--菜单栏-->
	<div class="Navigation" id="Navigation">
		 <ul class="Navigation_name">
			<li><a href="Home.html">首页</a></li>
            <li><span class="bg_muen"></span><a href="#">半小时生活圈</a></li>
			<li><a href="#">你身边的超市</a></li>
			<li><a href="#">预售专区</a><em class="hot_icon"></em></li>
			<li><a href="products_list.html">商城</a></li>
			
			<li><a href="#">好评商户</a></li>
			<li><a href="#">热销活动</a></li>
			<li><a href="Brands.html">联系我们</a></li>
		 </ul>			 
		</div>
	<script>$("#Navigation").slide({titCell:".Navigation_name li",trigger:"click"});</script>
    </div>
</head>
<!--发布商品样式-->
<div class="Inside_pages clearfix">
 <div class="left_style">
<!--列表-->
  <div class="menu_style">
   <ul class="menu_list">
    <li ><em></em><a href="店铺专区.html">店铺专区</a></li>
    <li class="on"><em></em><a href="商品专区.html">商品专区</a></li>
    <li><em></em><a href="#">订单专区</a></li>
    <li><em></em><a href="#">发货管理</a></li>
    <li><em></em><a href="#">收款账户</a></li>
    <li><em></em><a href="#">我的报表</a></li>
   </ul>
  </div>
</div>
<div class="right_style">
  <!--内容详细-->
   <div class="title_style"><em></em>发布商品</div>
    <div class="content_style">
     <div class="Release_product_style">
     <form>
     <table cellpadding="0" cellspacing="0" width="100%">
      <tr>
       <td class="label">店铺/公司名称：</td><td>江苏业祥股份有限公司</td></tr> 
       <tr><td class="label">编辑商品标题：</td><td><input name="" type="text"  class="addtext"  style=" width:500px;"/></td></tr>
       <tr><td class="label">设置商品分类：</td><td> 
       <span>一级分类：</span><select name="" size="1">
        <option value="1">一级分类</option>
      </select>
       <span>二级分类：</span><select name="" size="1">
        <option value="2">二级分类</option>
      </select>
       <span>三级分类：</span><select name="" size="1">
        <option value="3">三级分类</option>
      </select></td></tr>
       <tr><td class="label">设置商品规格：</td><td>
       <ul class="Spec_style"><li>50ml</li><li>100ml</li><li>200ml</li><li>100g</li><li>1000g</li></ul>
       <div class="add_Spec">
       <a href="#" class="add_Spec_btn"><em class="icon_1"></em>添加规格标签</a><a href="#" class="jx_btn">继续添加</a><a href="#" class="delete_btn">删除</a>
       <!--添加标签隐藏层-->
       <div class="spec_label_style">
        <div class="jx_cz_spec"><a href="#">继续添加</a> <span>最多只能添加5张图片</span></div>
        <div class="tianjia_label">
         <em class="sprite-icon"></em>
        <input name="" type="text"  class="addtext"  style=" width:300px;"/><input name="" type="submit" value="添加"  class="add_submit"/></div>
       </div>
       </div>
       <div class="Spec_label">
       <input name="checkbox" type="checkbox" data-labelauty="6个装"/>
       <input name="checkbox" type="checkbox" data-labelauty="12个装"/>
       <input name="checkbox" type="checkbox" data-labelauty="24个装"/>
       <input name="checkbox" type="checkbox" data-labelauty="红色"/>
       <input name="checkbox" type="checkbox" data-labelauty="白色"/>
       <input name="checkbox" type="checkbox" data-labelauty="6绿色"/>
       </div>
       </td>
       </tr>
       <tr><td class="label">商品销售价格：</td><td><input name="" type="text"  class="addtext" style=" width:200px;"/></td></tr>
       <tr><td class="label">商品促销价格：</td><td><input name="" type="text"  class="addtext" style=" width:200px; float:left" /> <span class="add_integral">
                    	<a id="check_agreement" href="#" class="check_agreement">可抵用积分</a>
                    	<input id="autoLoginCheck" type="hidden">
                    	<input id="agreement_tips" name="" type="text" class="auto_tips"  style=" width:100px; float:left"/>
                        </span></td></tr>
        <tr><td class="label">商品销售类别：</td><td><select name="" size="1">
        <option value="1">一级分类</option>
      </select></td></tr>                
       <tr><td class="label">商品概要介绍：</td><td><textarea name="" cols="" rows="" placeholder="商品的概要介绍。该介绍将出现在商品名称下方。" class="textarea"></textarea></td></tr>
       <tr><td class="label">商品宣传图片：</td><td>
       <table class="Publicize_img_style">
         <tr>
           <td colspan="2"><input type="submit" value="添加"  class="Add_btn"/><input type="submit" value="删除"  class="delete_btn"/></td></tr>
         <tr class="label"><td >上传图片</td><td>是否展示</td></tr>
         <tr>
         <td>
         <div class="file-uploader-wrap"> 
　　　　　　<input type="file" class="file-uploader" name="uploadDataField" id="FileUploader"/> 
　　　　　　<div class="file-uploader-wrap-fake"> 
　　　　　　<input type="text" id="PathDisplayer" class="input-text" disabled /> 
　　　　　　　　<a href="javascript:void(0)" class="link-btn" >选择文件</a> 
　　　　　　</div> 
　　　　</div> 
</td><td><input name="" type="checkbox" value="" /></td></tr>
        </table>
       </td></tr>
       <tr><td class="label">商品详细介绍：</td><td>富文本编辑器</td></tr>
     </table>
     <a href="#" class="Next_btn">提交商品资料</a>
     </form>
     </div>
    </div>
  </div>
</div>
<script type="text/javascript">
$(function(){
	$(':input').labelauty();
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
</body>
</html>
