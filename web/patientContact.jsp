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
							<h4>Register Patient's Contact Info</h4>
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
		<form action="registerPatientBackButton.action" method="post">
			<div class="two columns">
			<input class="button-primary u-pull-right" value="Back" type="submit"></input>
			</div>
		</form>
	</div>
	<br>
	<form action="registerContact.action" method="post">
			<div class ="row">
				<div class="six columns">
					<label>Patient: </label>[PatientName] <s:property value = "firstName"/> <s:property value = " middleName"/> <s:property value = "lastName"/>
				</div>
				<div class="six columns">
					<label>ID Number: </label>[PatientNumber] 
				</div>
			</div>
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Contact Number 1: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" onkeypress="return isNumberKey(event)" type="text" name="contactNo1" id="contactNo1" placeholder="e.g. 04799755545" required="required"></input>
				</div>
				<div class="three columns">
					<select id="type1" name="type1" required="required" class="u-full-width">
					 <option selected="selected" disabled="disabled" value="none">Select Type</option>
					 <option value="Cell">Cellphone</option>
					 <option value="Home">Home</option>
					 <option value="Work">Work</option>
					</select>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Contact Number 2: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" onkeypress="return isNumberKey(event)" type="text" name="contactNo2" id="contactNo2" placeholder="e.g. 04799755545"></input>
				</div>
				<div class="three columns">
					<select id="type2" name="type2" class="u-full-width">
					 <option selected="selected" disabled="disabled" value="none">Select Type</option>
					 <option value="Cell">Cellphone</option>
					 <option value="Home">Home</option>
					 <option value="Work">Work</option>
					</select>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Contact Number 3: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" onkeypress="return isNumberKey(event)" type="text" name="contactNo3" id="contactNo3" placeholder="e.g. 04799755545"></input>
				</div>
				<div class="three columns">
					<select id="type3" name="type3" class="u-full-width">
					 <option selected="selected" disabled="disabled" value="none">Select Type</option>
					 <option value="Cell">Cellphone</option>
					 <option value="Home">Home</option>
					 <option value="Work">Work</option>
					</select>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Email: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" type="text" name="email" id="email" placeholder="e.g. email@email.com" required="required"></input>
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