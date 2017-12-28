<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Philippine Hospital System</title>
<link rel="stylesheet" type="text/css" href="css/basedesign.css" />
<link rel="stylesheet" type="text/css" href="css/skeleton.css" />
<link rel="stylesheet" type="text/css" href="css/normalize.css" />

<script type="text/javascript" src="javascript/message.js"></script>
</head>
<body>
<div class="topbanner"></div>
<div class="container">
<h1>Philippine Hospital System</h1>

<!-- Unlock this if the below isn't working at all.
<s:form action="login.action" method="post">
<s:textfield label="Username or Email" key="username"></s:textfield>
<s:textfield label="Password" key="password"></s:textfield>
<s:submit value="Login"></s:submit>
</s:form> 
-->

<div class ="row">
	<div class="six columns"> <!-- First Six Columns of the First Row, the Input Block-->
			<form action="login" method="post">
				<div class="row">
			    	<div class="three columns">
			    		<label for="username">Username or Email:</label>
			    	</div>
			    	<div class="nine columns">
			    		<input class="u-full-width" type="text" name="username" id="username" placeholder="Username"></input>
			    	</div>
				</div>
				<div class="row">
					<div class="three columns">
			    		<label for="password">Password:</label>
			    	</div>
			    	<div class="nine columns">
			    		<input class="u-full-width" type="password" name="password" id="password" placeholder="Password"></input>
			    	</div>
				</div>
				<div class="row">
					<br>
			    	<div class="twelve columns">
			    		<input class="button u-pull-right" value="clear" type="reset"></input>
			    		<input class="button-primary u-pull-right" value="login" type="submit"></input>
			    	</div>
				</div>
			</form>
	</div> <!-- End of the First Six Columns of the First Row -->
</div>
</div>
</body>
</html>
