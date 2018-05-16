<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录网上点餐</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/style.css">
	
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.css">
	<script src="https://apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="https://apps.bdimg.com/libs/jquerymobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
</head>
<style>
	#page-header {
	    background-color:black;
	    color:white;
	    text-align:center;
	    padding:3px;
	}
	#page-wrap {
	    line-height:30px;
	    background-color:#eeeeee;
	    height:100%;
	    width:100%;
	    float:left;
	    padding:5px; 
	}
	#page-footer {
	    background-color:black;
	    color:white;
	    clear:both;
	    text-align:center;
	    padding:5px; 
	}
</style>
<body>
	<div id="page-header">
		<h1>网上点餐系统</h1>
	</div>
	<div class="container" >
		<div class="row">
			<div class="col-md-4 col-md-push-8">
				<!-- Start Sign In Form -->
				
				<form name="formlogin" action="LoginServlet" method="POST" class="fh5co-form animate-box" data-animate-effect="fadeInRight" onSubmit="return isValid(this);">
					<h2>登录</h2>
					<div class="form-group">
						<label for="username" class="sr-only">用户名</label>
						<input type="text" class="form-control" name="username" value="${username }" id="id" placeholder="Username" autocomplete="off">
					</div>
					<div class="form-group">
						<label for="password" class="sr-only">密码</label>
						<input type="password" class="form-control" name="password" id="password" placeholder="Password" autocomplete="off">
					</div>
					
					<div class="form-group">
						<label for="remember"><input type="checkbox" id="remember"> 记住我</label>
					</div>
					<div class="form-group">
						<p>没注册？ <a href="Sign_up.jsp">注册</a>
					</div>
					<font color="red" size="3"> ${msg }</font>  
					<!--  <div class="form-group">
						<input type="radio" name="kind" value="admin" checked />
						管理员
						<input type="radio" name="kind" value="student" />
						学生
				   </div>-->
					<div class="form-group">
						<input type="submit" value="登录" class="btn btn-primary">
					</div>  
				</form>
				<!-- END Sign In Form -->


			</div>
		</div>
	<div class="row" style="padding-top: 60px; clear: both;">
	</div>
</div>
</body>
</html>