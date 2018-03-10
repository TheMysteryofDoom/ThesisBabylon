<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="script/SessionCheck.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Philippine Hospital System</title>
<link rel="stylesheet" type="text/css" href="css/basedesign.css" />
<link rel="stylesheet" type="text/css" href="css/skeleton2.css" />
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<script type="text/javascript" src="javascript/message.js"></script>

</head>
<body>
<div class="topbanner"></div>
<div class="container">
<div class ="row">
	<div class="one columns">
	</div>
	<div class="five columns"> <!-- First Six Columns of the First Row, the Input Block-->
	<h1>Philippine Hospital System</h1>
			<form action="login" method="post">
				<div class="row">
			    	<div class="three columns">
			    		<label for="username">Username or Email:</label>
			    	</div>
			    	<div class="nine columns">
			    		<input class="u-full-width" type="text" name="username" id="username" placeholder="Username" required="required"></input>
			    	</div>
				</div>
				<div class="row">
					<div class="three columns">
			    		<label for="password">Password:</label>
			    	</div>
			    	<div class="nine columns">
			    		<input class="u-full-width" type="password" name="password" id="password" placeholder="Password" required="required"></input>
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
	<div class="six columns" align="center">
		<br>
		<div class="row">
			<img src="images/babylon2.jpg" height="170px">
		</div>
		<div class="row">
			<form action="about.jsp" method="post">
				<input class="button" value="About" type="submit"></input>
			</form>
		</div>
	</div>
</div>
</div>
</body>
</html>
