<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix ="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sample data retrieval</title>
</head>
<body>

	<table border = 1px>
	<tr>
	<th>Patient ID: </th>
	<th>First name: </th>
	<th>Middle name: </th>
	<th>Last name: </th>
	<s:iterator value = "patientList">
		<tr>
			<td><s:property value ="id"/></td>
			<td><s:property value ="firstName"/></td>
			<td><s:property value ="middleName"/></td>
			<td><s:property value ="lastName"/></td>
			<td><a href="update?id=<s:property value="id"/>">edit</a></td>
        	<td><a href="delete?id=<s:property value="id"/>">delete</a></td>
		</tr>
	
	</s:iterator>


	</table>

	<a href="register.jsp">Add Patient</a>
</body>
</html>