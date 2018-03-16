<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<%@ include file="script/SessionCheck.jsp" %>
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

<br>
	<div class="row">
			<div class="seven columns"> 									<!-- Tier 1 -->	
					<div class="row">													<!-- Tier 2 -->
						<div class="nine columns">									<!-- Tier 2 -->
							<br>
							<h4>Register New Admin</h4>
						</div>												<!-- Tier 2 -->
					</div>
					
					<form action="registerAdmin.action" method="post">
		<div class="row">
			<div class="three columns">
				<label>Full Name:</label>
			</div>
			<div class="three columns">
			    <input class="u-full-width" type="text" name="firstName" id="firstName" placeholder="First Name" required="required"></input>
			</div>
			<div class="three columns">
			    <input class="u-full-width" type="text" name="lastName" id="lastName" placeholder="Last Name" required="required"></input>
			</div>
			<div class="three columns">
			    <input class="u-full-width" type="text" name="middleName" id="middleName" placeholder="Mother's Maiden Name"></input>
			</div>
		</div>
		<br>
		<div class="row">
		<div class="three columns">
		<label>UserName:</label>
		</div>
			<div class="three columns">
				<input class="u-full-width" type="text" name="userName" id="userName" placeholder="UserName"></input>
			</div>
		</div>
		<br>
		<div class="row">
		<div class="three columns">
		<label>Password:</label>
		</div>
			<div class="three columns">
				<input class="u-full-width" type="password" name="password" id="password" placeholder="Password"></input>
			</div>
		</div>
		
		<br>
			<div class="row"> <!-- 1 Row -->
				<div class="two columns">
					<label>Gender:</label>
				</div>
				<div class="two columns">
					<input type="radio" name ="gender" id="male" value="M" checked="checked"> Male
				</div>
				<div class="two columns">
					<input type="radio" name ="gender" id="female" value="F"> Female
				</div>
			</div> <!-- 1 Row End -->
			
				<br>
		<div class="row">
			<div class="three columns">
			<input class="button-primary u-pull-right" value="Register" type="submit"></input>
			</div>
		</div>
			</form>

</body>
</html>