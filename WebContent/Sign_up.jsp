<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
			<div class="container" >

				<div class="row">
					<div class="col-md-4 col-md-push-8">
						<!-- Start Sign In Form -->
						
						<form name="formlogin" action="RegisterServlet" method="POST" class="fh5co-form animate-box" data-animate-effect="fadeInRight" onSubmit="return isValid(this);">
							<h2>注册</h2>
							<div class="form-group">
								<label for="username" class="sr-only">用户名</label>
			
								<input type="text" class="form-control" name="username" value="${username }" id="id" placeholder="用户名" autocomplete="off">
							</div>
							<div class="form-group">
								<label for="password" class="sr-only">密码</label>
								<input type="password" class="form-control" name="password" id="password" placeholder="密码" autocomplete="off">
							</div>
							<div class="form-group">
								<label for="confirmpassword" class="sr-only">确认密码</label>
								<input type="password" class="form-control" name="confirmpassword" id="confirmpassword" placeholder="确认密码" autocomplete="off">
							</div>
							
							<font color="red" size="2"> ${msg }</font>  
							<div class="form-group">
								<input type="submit" value="注册" class="btn btn-primary">
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