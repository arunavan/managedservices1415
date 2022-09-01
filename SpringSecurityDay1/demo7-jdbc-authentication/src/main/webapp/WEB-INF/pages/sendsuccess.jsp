<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Swift Courier</title>
</head>
<body>
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
				<div class="panel-body">
					<div class="row">
						<div class="col-xs-6" align="left">
							<a href="index">Home</a>

						</div>
						<div class="col-xs-6" align="right">
							<a href="logout">Logout</a>

						</div>
					</div>
					<br><br>
					<div class="col-xs-12" align="center">
						<h5 style="color:Teal">
						Thank you for choosing Swift Courier! 
						Your courier will be picked up and delivered within 24 hrs.
						You can use Transaction-Id: <strong>${transaction.id} </strong>to track your parcel.
						</h5>
					</div>
					

				</div>
			</div>
		</div>
	</div>
</body>
</html>