<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Swift Courier</title>
</head>
<body>
	<br>
	<br>
	<br>
	<div class="container" style="margin-top: 20px; padding-top: 0px;">
		<div class="col-xs-6 col-xs-offset-3">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="row">

						<img alt="" src="<spring:url value='/images/Swift.jpg'/>"
							class="col-xs-4 col-xs-offset-4">
					</div>
					<div class="row" align="center">
						<h2>Welcome to Swift Courier!!</h2>
					</div>
				</div>
				<div class="panel-body" align="center">

					<form:form action="doLogin" method='POST' class="form form-horizontal">
						
						<div class="form-group">
							<div class="row">
							<label class="control-label col-xs-5">UserName:</label>
							<div class="col-xs-4">
								<input class="form-control"  type='text' name='username' value=''>
							</div>
						</div>
						</div>
						
						<div class="form-group">
						<div class="row">
							<label class="control-label col-xs-5">Password:</label>
							<div class="col-xs-4"><input class="form-control"  type='password' name='password' /></div>
						</div>
						</div>
						<br>
						<div class="row" align="center">
							
							<div class="form-group col-xs-8">
								<input class="btn btn-primary" name="submit" type="submit"
									value="Cancel" />
							</div>
							<div class="form-group col-xs-1">
								<input class="btn btn-primary" name="submit" type="submit"
									value="Login" />
							</div>
							
						</div>
				
				</form:form>
			</div>
		</div>
	</div>
</div>
</body>
</html>