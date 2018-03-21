<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="uploadAction" namespace="/" 
method="POST" enctype="multipart/form-data">
	<s:file name="fileUpload" label="Select a File to upload" size="40" />
	<s:submit value="submit" name="submit" />
	
</s:form>
</body>
</html>