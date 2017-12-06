<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Placeholder Title</h1>
<hr>
<s:form action="login.action" method="post">
<s:textfield label="Username or Email" key="username"></s:textfield>
<s:textfield label="Password" key="password"></s:textfield>
<s:submit value="Login"></s:submit>
</s:form>

</body>
</html>