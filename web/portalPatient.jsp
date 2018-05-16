<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Medical Records Portal</title>
<script type="text/javascript" src="javascript/isNumberKey.js"></script>  
<%@ include file="script/SessionCheck2.jsp" %>
<%@ include file="script/head.jsp" %>
</head>
<body>
<div class="topbanner"></div>
<div class = "container">
	<br>
	<div class ="row"> 														<!-- Tier 0 -->
		<div class="seven columns"> 										<!-- Tier 1 -->
			<div class="row">
				<div class="three columns">									<!-- Tier 2 -->
					<br>
					<img src ="images/Blank75x75.png">
				</div>														<!-- Tier 2 -->
				<div class="nine columns">									<!-- Tier 2 -->
					<br>
					<h4>Medical Records Portal</h4>
				</div>														<!-- Tier 2 -->
			</div>
			<br>
			<div class="row">
				<div class="seven columns">
					
				</div>
				<div class="five columns">
					
				</div>
			</div>
		</div> 																<!-- Tier 1 -->		
		<div class="five columns"> 											<!-- Tier 1 -->
			<div class="seven columns"> 									<!-- Tier 2 -->
				<p><br>
				<%= session.getAttribute("username") %><br>
				Patient
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
	</div> 																	<!-- Tier 0 -->
	<hr> <!-- New Main Row -->
	<div class="row">
		<div class="six columns" align ="center">
			<form action="editRecord.action" method="post">
					<input name="editCode" id="editCode" type="hidden" value="B">
					<input class="button" value="Edit Contact Details" type="submit">
			</form>		
		</div>
		<div class="six columns" align ="center">
			<form action="print.jsp" method="post">
					<input name="id" id="id" type="hidden" value="<%= session.getAttribute("patientid") %>">
					<input class="button" value="Email" type="submit">
			</form>	
		</div>
	</div>
	<div class="row">
		<div class="six columns">
		<textarea class="u-full-width dontresize textboxheight" name="patientDetails" placeholder="Basic Patient Information will show up here. Please input the patient ID number on top to see the data."></textarea>
		</div>
		<div class="six columns">
		<textarea class="u-full-width dontresize textboxheight" name="medicalRecords" placeholder="The Medical Data of the Patient will show up here. Please input the patient ID number on top to see the data."></textarea>
		</div>
	</div>
</div>

</body>
</html>