<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register New Patient</title>
<script type="text/javascript" src="javascript/isNumberKey.js"></script>
<%@ include file="script/SessionCheck2.jsp" %>
<%@ include file="script/head.jsp" %>
</head>
<body>
<div class="topbanner"></div>
<div class="container">
	<br>
	<div class="row">
			<div class="seven columns"> 									<!-- Tier 1 -->	
					<div class="row">
						<div class="three columns">									<!-- Tier 2 -->
							<br>
							<img src ="images/Blank75x75.png">
						</div>														<!-- Tier 2 -->
						<div class="nine columns">									<!-- Tier 2 -->
							<br>
							<h4>Register Patient's Address</h4>
						</div>												<!-- Tier 2 -->
					</div>
					<div class="row">
						<br>
							<label>Return to Medical Records Portal:</label>
					</div>
					<div class="row">
						<div class="three columns">
							<form action="portal.jsp" method="post">
								<input class="button u-pull-left" value="Portal" type="submit"></input>
							</form>
						</div>
					</div>
			</div> 																<!-- Tier 1 -->		
		<div class="five columns"> 											<!-- Tier 1 -->
			<div class="seven columns"> 									<!-- Tier 2 -->
				<p><br>
				<%= session.getAttribute("username") %><br>
				[ID No. Goes Here]
				</p>
			</div> 															<!-- Tier 2 -->
			<div class="five columns"> 										<!-- Tier 2 -->
				<div class="row" align="center"> 							<!-- Tier 3 -->
					<img src ="images/BlankProfile.png">
				</div>														<!-- Tier 3 -->
				<div class="row" align="center"> 							<!-- Tier 3 -->
					<form action="logout.action" method="post">
						<input class="button" value="logout" type="submit">
					</form>													<!-- Tier 3 -->
				</div>
			</div> 															<!-- Tier 2 -->
		</div> 																<!-- Tier 1 -->	
	</div> 							
	<hr>
	<div class ="row">
		<form action="returnToContact.action" method="post">
			<div class="two columns">
			<input class="button u-pull-right" value="Back" type="submit"></input>
			</div>
		</form>
	</div>
	<br>
	<form action="registerAddress.action" method="post">
			<div class ="row">
					<div class="six columns">
						<label>Patient: </label>[PatientName]<s:property value = "firstName"/>
					</div>
					<div class="six columns">
						<label>ID Number: </label>[PatientNumber]
					</div>
			</div>
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Street: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" type="text" name="street" id="street" placeholder="e.g. Blue Street" required="required"></input>
				</div>
				<div class="three columns">
					<label>City: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" type="text" name="city" id="city" placeholder="e.g. Manila" required="required"></input>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Country: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" type="text" name="country" id="country" placeholder="e.g. Philippines" required="required"></input>
				</div>
				<div class="three columns">
					<label>Zipcode: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" type="text" onkeypress="return isNumberKey(event)" name="zipcode" id="zipcode" placeholder="e.g. 8867" required="required"></input>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row">
				<div class="two columns">
				<input class="button-primary u-pull-right" value="Next" type="submit"></input>
				</div>
			</div>
	</form>
</div>
</body>
</html>