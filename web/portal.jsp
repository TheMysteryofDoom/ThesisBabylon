<%@page import="model.PatientBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
<%@ page import="java.sql.ResultSet" %>
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
					<form action="loadRecord.action" method="post">
					<label for="patiendid">View Medical Records:</label>
						<input type="text" onkeypress="return isNumberKey(event)" name="patientid" id="patientid" placeholder="Input Patient ID">
					<br>
					<br>
					<input class="button" value="Submit" type="submit">
					</form>
				</div>
				<div class="five columns">
					<label>Or Register New Patient:</label>
					<form action="register.jsp" method="post">
					<input class="button u-pull-left" value="Register" type="submit"><br><br>
					<%= session.getAttribute("didRegister") %>
					</form>
				</div>
			</div>
		</div> 																<!-- Tier 1 -->		
		<div class="five columns"> 											<!-- Tier 1 -->
			<div class="seven columns"> 									<!-- Tier 2 -->
				<p><br>
				<%= session.getAttribute("username") %><br>
				[Med Liscence No. Goes Here]
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
		<div class="four columns">
			<form action="editRecord.action" method="post">
					<input class="button u-pull-right" value="Edit Biography" type="submit">
			</form>		
		</div>
		<div class="four columns" align="center">
			<form action="medicalStatus.jsp" method="post">
					<% 
					String disabled = "";
					if (session.getAttribute("patientid")==null){
						disabled="disabled='disabled'";
						}else{
						disabled = "";
						}
					%>
					
					<input name="id" id="id" type="hidden" value="<%= session.getAttribute("patientid") %>">
					<input class="button" <%= disabled %> value="Update Medical Status" type="submit">
			</form>	
		</div>
		<div class="four columns">
			<form action="print.jsp" method="post">
					<input name="id" id="id" type="hidden" value="<%= session.getAttribute("patientid") %>">
					<input class="button u-pull-left" value="Print" type="submit">
			</form>	
		</div>
	</div>
	<div class="row">
		<%
		String patientDetails2 = "";
		try{
			//patientDetails2 = (String)session.getAttribute("patientDetails");
			ResultSet patientValues = (ResultSet)session.getAttribute("patientDetails");
			StringBuilder patientDetails = new StringBuilder();
			patientDetails.append("Patient ID: "+patientValues.getString(1)+"\n");
			patientDetails.append("Name: "+patientValues.getString(2)+" "+patientValues.getString(4)+" "+patientValues.getString(3)+"\n");
			patientDetails.append("Gender: "+patientValues.getString(6)+"\n");
			patientDetails.append("Birthday: "+patientValues.getString(5)+"\n");
			patientDetails.append("Birth Place: "+patientValues.getString(7)+"\n");
			patientDetails.append("Nationality: "+patientValues.getString(8)+"\n");
			patientDetails.append("Religion: "+patientValues.getString(9)+"\n");
			patientDetails.append("Civil Status: "+patientValues.getString(10)+"\n");
			patientDetails.append("Occupation: "+patientValues.getString(11)+"\n");
			//====================================================================
			patientDetails.append("Contact No 1: "+patientValues.getString(12)+"\n");
			patientDetails.append("Type: "+patientValues.getString(15)+"\n");
			patientDetails.append("Contact No 2: "+patientValues.getString(13)+"\n");
			patientDetails.append("Type: "+patientValues.getString(16)+"\n");
			patientDetails.append("Contact No 3: "+patientValues.getString(14)+"\n");
			patientDetails.append("Type: "+patientValues.getString(17)+"\n");
			patientDetails.append("Email: "+patientValues.getString(18)+"\n");
			//====================================================================
		    patientDetails.append("Address: "+patientValues.getString(19)+" "+patientValues.getString(20)+" "+patientValues.getString(21)+"\n");
		    patientDetails.append("Zip Code: "+patientValues.getString(22)+"\n");
		    patientDetails.append("Contact in case of Emergency: "+patientValues.getString(23)+" "+patientValues.getString(25)+" "+patientValues.getString(24)+"\n");
		    patientDetails.append("Emergency Contact Number: "+patientValues.getString(26)+"\n");
		    patientDetails.append("Relation to Patient: "+patientValues.getString(27)+"\n");
			patientDetails2 = patientDetails.toString();
		} catch (Exception e) {
			session.setAttribute("patientDetails", "Exception");
		}
		%>
		<div class="six columns">
		<textarea class="u-full-width dontresize textboxheight" name="patientDetails" placeholder="Basic Patient Information will show up here. Please input the patient ID number on top to see the data."><%= patientDetails2 %></textarea>
		</div>
		<div class="six columns">
		<textarea class="u-full-width dontresize textboxheight" name="medicalRecords" placeholder="The Medical Data of the Patient will show up here. Please input the patient ID number on top to see the data."></textarea>
		</div>
	</div>
</div>

</body>
</html>