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
	<center>Add Car</center>
	<form method="post" action="addCar.do" 
			onsubmit="return validateCarForm(this);">
	<table>
	 <tr>
	 <td> Category </td>
		<td>
			<select name="category">
			<c:forEach var="category" items="${requestScope.categoryList}">
				<option value="${category.categoryId}">
					${category.name} - ${category.description}
				</option>	
			</c:forEach>
			</select>
			</td>
		</tr>
		<tr>
			<td>
				Registration No
			</td>
			<td>
				<input type="text" name="registrationNo" />
			</td>
		</tr>
		<tr>
			<td>
				Mileage
			</td>
			<td>
				<input type="text" name="mileage" />
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="Add A Car"/>
			</td>
			<td>
				<input type="button" value="Cancel" onClick="goHome(this.form)" /> 
			</td>
		</tr>
		</table>	
	</form>
</body>
</html>