<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/rental.css">
<script type="text/javascript" src="js/validation.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Form</title>

</head>
<body>
	<center>Rent A Car</center>
	<form method="post" action="rentCar.do">
	<table>
	 <tr>
	 <td> Customer </td>
		<td>
			<select name="customer">
			<c:forEach var="customer" items="${requestScope.customerList}">
				<option value="${customer.id}">
					${customer.id} - ${customer.userName}
				</option>	
			</c:forEach>
			</select>
			</td>
		</tr>
		 <tr>
	 		<td> Car </td>
			<td>
				<select name="car">
				<c:forEach var="car" items="${requestScope.carList}">
					<option value="${car.carId}">
						${car.registrationNo}
					</option>	
				</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>
				Hire Date
			</td>
			<td>
				<input type="text" name="hireDate" />
			</td>
		</tr>
		<tr>
			<td>
				Return Date
			</td>
			<td>
				<input type="text" name="returnDate" />
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="Rent A Car"/>
			</td>
			<td>
				<input type="button" value="Cancel" onClick="goHome(this.form)" /> 
			</td>
		</tr>
		</table>	
	</form>
</body>
</html>