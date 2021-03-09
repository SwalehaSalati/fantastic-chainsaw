<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/rental.css">
<title>Car Rental Application</title>
</head>
<body>
	<div class="errorClass">${requestScope.msg}</div>
	<center>Car Rental Application</center>
	<a href="carForm.do"> Add a Car</a>
	<br />
	<a href="rentalForm.do"> Rent A Car</a>
	<br />
	<a href="viewRentalForm.do"> View Rental</a>
	<br />
</body>
</html>
