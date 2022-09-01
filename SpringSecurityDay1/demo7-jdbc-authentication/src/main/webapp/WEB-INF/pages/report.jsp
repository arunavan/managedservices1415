<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
					<form:form action="report.htm" method="post"
						modelAttribute="transaction">
						<div class="form-group">
							<label class="col-xs-8">Choose Source:</label>
							<div class="col-xs-4">

								<form:select path="senderCity">
									<form:option value="select">Select</form:option>
									<form:option value="Chn">Chennai</form:option>
									<form:option value="Mys">Mysore</form:option>
									<form:option value="Bng">Bangalore</form:option>
									<form:option value="Pun">Pune</form:option>
								</form:select>
							</div>
						</div>
						<br>
						<br>
						<br>
						<br>
						<div class="form-group">
							<label class="col-xs-8">Choose Destination:</label>
							<div class="col-xs-4">
								<form:select path="receiverCity">
									<form:option value="select">Select</form:option>
									<form:option value="Chn">Chennai</form:option>
									<form:option value="Mys">Mysore</form:option>
									<form:option value="Bng">Bangalore</form:option>
									<form:option value="Pun">Pune</form:option>
								</form:select>
							</div>
						</div>
						<br>
						<br>
						<div class="row" align="center">
							
							<div class="form-group col-xs-12">
								<input class="btn btn-primary" name="submit" type="submit"
									value="Get Report" />
							</div>

						</div>
					</form:form>


				</div>
			</div>
		</div>
	</div>
</body>
</html>