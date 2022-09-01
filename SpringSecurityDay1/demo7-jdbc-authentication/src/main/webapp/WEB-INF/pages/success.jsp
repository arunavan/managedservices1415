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
		<div class="col-xs-8 col-xs-offset-2">
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

					<br> <br>
					<div class="row" align="center">
						<div class="col-xs-12">
							<h4 style="color: blue">Courier Details</h4>
						</div>

					</div>
					<br>
					<c:choose>
						<c:when test="${!empty transactionsList}">

							<div class="row" style="border: thin solid #C0C0C0; padding: 5px">
								<div class="col-md-1 text-center">
									<h5 style="color: Teal"><strong>Id</strong></h5>
								</div>
								<div class="col-md-3 text-center">
									<div class="col-md-6 text-center">
										<h5 style="color: Teal"><strong>Sender</strong></h5>
									</div>
									<div class="col-md-6 text-center">
										<h5 style="color: Teal"><strong>Receiver</strong></h5>
									</div>
								</div>
								<div class="col-md-2 text-center">
									<h5 style="color: Teal"><strong>Sender Address</strong></h5>
								</div>
								<div class="col-md-2 text-center">
									<h5 style="color: Teal"><strong>Receiver Address</strong></h5>
								</div>
								<div class="col-md-4 text-center">
									<div class="col-md-6 text-center">
										<h5 style="color: Teal"><strong>Status</strong></h5>
									</div>
									<div class="col-md-6 text-center">
										<h5 style="color: Teal"><strong>Courier Date</strong></h5>
									</div>
								</div>
							</div>
							<c:forEach items="${transactionsList}" var="current">
								<div class="row"
									style="border: thin solid #C0C0C0; padding: 5px">
									<div class="col-md-1 text-center">
										<h5 style="color: black">
											<c:out value="${current.id}" />
										</h5>
									</div>
									<div class="col-md-3 text-center">
										<div class="col-md-6 text-center">
											<h5 style="color: black">
												<c:out value="${current.sender}" />
											</h5>
										</div>
										<div class="col-md-6 text-center">
											<h5 style="color: black">
												<c:out value="${current.receiver}" />
											</h5>
										</div>
									</div>
									<div class="col-md-2 text-center">
										<h5 style="color: black">
											<c:out value="${current.senderAddress}" />
										</h5>
									</div>
									<div class="col-md-2 text-center">
										<h5 style="color: black">
											<c:out value="${current.receiverAddress}" />
										</h5>
									</div>
									<div class="col-md-4 text-center">
										<div class="col-md-6 text-center">
											<h5 style="color: black">
												<c:out value="${current.status}" />
											</h5>
										</div>
										<div class="col-md-6 text-center">
											<h5 style="color: black">
												<c:out value="${current.date}" />
											</h5>
										</div>
									</div>
								</div>
							</c:forEach>

						</c:when>
						<c:when test="${empty transactionsList}">
							<div class="row" style="border: thin solid #C0C0C0; padding: 5px">
								<div align="center">
									<h5 style="color: Teal">
										<strong><c:out value="No records found for the given details!!" />
									</strong></h5>
								</div>
							</div>
						</c:when>
					</c:choose>
				</div>


			</div>
		</div>
	</div>
</body>
</html>