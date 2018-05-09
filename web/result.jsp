<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Results</title>
</head>
<body>
	<h2>
	 	<h2>You have successfully uploaded the file!</h2>
	 	<h2><s:property value="fileUploadFileName"/></h2>
	 	<h2><s:property value="fileUploadContentType"/></h2>
	 	<h2><s:property value="fileUpload"/></h2>
	</h2>
</body>
</html>