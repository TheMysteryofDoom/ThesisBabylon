<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="java.sql.ResultSet" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Medical Status</title>
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
							<h4>Medical Data</h4>
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
				Hospital: <%= session.getAttribute("hospitalName") %><br>
				Hospital ID: <%= session.getAttribute("hospitalID") %><br>
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
	<hr> <!-- End of Header -->
	<form action="updateMedicalStatus" method="post">
		<div class ="row">
			<div class="six columns">
				<label>Patient: </label>[PatientName]
			</div>
			<div class="six columns">
				<label>ID Number: </label><%= session.getAttribute("patientid") %>
			</div>
		</div>
		<hr>
		<%
		String medData = "";
		String bldPressure = "";
		String prcr = "";
		String resrate = "";
		String temp = "";
		String weight = "";
		String height = "";
		String headCirc = "";
		String chestCirc = "";
		String abdCirc = "";
		String medHistory="";
		String treatmentPlans = "";
		
		try{
			ResultSet medicalData = (ResultSet)session.getAttribute("medicalHistory");
			//StringBuilder medicalDataBuilder = new StringBuilder();
			//if (medicalData.next()){
				bldPressure = medicalData.getString(3);
				prcr = medicalData.getString(4);
				resrate = medicalData.getString(5);
				temp = medicalData.getString(6);
				weight = medicalData.getString(7);
				height = medicalData.getString(8);
				headCirc = medicalData.getString(9);
				chestCirc = medicalData.getString(10);
				abdCirc = medicalData.getString(11);
				medHistory = medicalData.getString(12);
				treatmentPlans = medicalData.getString(13);
			//}
			//medData = medicalDataBuilder.toString();
		} catch (Exception e) {
			session.setAttribute("medicalHistory", "Exception");
			//medData = "No Medical Data yet";
		}
		%>
		<input type="hidden" name="patientID" id="patientID" value="<%=session.getAttribute("patientid") %>">
		<input type="hidden" name="hospitalID" id="hospitalID" value="<%=session.getAttribute("hospitalID") %>">
		<div class ="row">
			<div class="twelve columns" align="center">
				<h5><b>Vital Signs</b></h5>
			</div>
		</div>
		<div class ="row">
			<div class="three columns">
				<label>Blood Pressure:</label>
			</div>
			<div class="nine columns">
				<input type="text" onkeypress="return isNumberKey(event)" name="bloodPressure" id="bloodPressure" value="<%= bldPressure %>" placeholder="mm/HG"> (mm/HG)
			</div>
		</div>
		<br>
		<div class ="row">
			<div class="three columns">
				<label>PR/CR:</label>
			</div>
			<div class="nine columns">
				<input type="text" onkeypress="return isNumberKey(event)" name="prcr" id="prcr" value="<%= prcr %>" placeholder="bpm"> (bpm)
			</div>
		</div>
		<br>
		<div class ="row">
			<div class="three columns">
				<label>Respiratory Rate:</label>
			</div>
			<div class="nine columns">
				<input type="text" onkeypress="return isNumberKey(event)" name="respiratoryRate" id="respiratoryRate" value="<%= resrate %>" placeholder="bpm"> (bpm)
			</div>
		</div>
		<br>
		<div class ="row">
			<div class="three columns">
				<label>Temperature:</label>
			</div>
			<div class="nine columns">
				<input type="text" onkeypress="return isNumberKey(event)" name="temperature" id="temperature" value="<%= temp %>" placeholder="Celsius"> (Celsius)
			</div>
		</div>
		<br>
		<div class ="row">
			<div class="three columns">
				<label>Weight:</label>
			</div>
			<div class="nine columns">
				<input type="text" onkeypress="return isNumberKey(event)" name="weight" id="weight" value="<%= weight %>" placeholder="kg"> (kg)
			</div>
		</div>
		<br>
		<div class ="row">
			<div class="three columns">
				<label>Height:</label>
			</div>
			<div class="nine columns">
				<input type="text" onkeypress="return isNumberKey(event)" name="height" id="height" value="<%= height %>" placeholder="cm"> (cm)
			</div>
		</div>
		<hr>
		<div class ="row">
			<div class="twelve columns" align="center">
				<h5><b>Anthropometric Measurements</b></h5>
			</div>
		</div>
		<br>
		<div class ="row">
			<div class="three columns">
				<label>Head Circumference:</label>
			</div>
			<div class="nine columns">
				<input type="text" onkeypress="return isNumberKey(event)" name="headCirc" id="headCirc" value="<%= headCirc %>" placeholder="cm"> (cm)
			</div>
		</div>
		<br>
		<div class ="row">
			<div class="three columns">
				<label>Chest Circumference:</label>
			</div>
			<div class="nine columns">
				<input type="text" onkeypress="return isNumberKey(event)" name="chestCirc" id="chestCirc" value="<%= chestCirc %>" placeholder="cm"> (cm)
			</div>
		</div>
		<br>
		<div class ="row">
			<div class="three columns">
				<label>Abdominal:</label>
			</div>
			<div class="nine columns">
				<input type="text" onkeypress="return isNumberKey(event)" name="abdCirc" id="abdCirc" value="<%= abdCirc %>" placeholder="cm"> (cm)
			</div>
		</div>
		<hr>
		<div class ="row">
			<div class="twelve columns" align="center">
				<h5><b>Medical History</b></h5>
			</div>
		</div>
		<div class ="row">
			<div class="twelve columns">
				<textarea class="u-full-width dontresize textboxheight" name="medHistory" placeholder="Write down the patient's Medical History here."><%= medHistory %></textarea>
			</div>
		</div>
		<hr>
		<div class ="row">
			<div class="twelve columns" align="center">
				<h5><b>Treatment Plan</b></h5>
			</div>
		</div>
		<div class ="row">
			<div class="twelve columns">
				<textarea class="u-full-width dontresize textboxheight" name="treatmentPlan" placeholder="Write down the patient's Treatment Plan here."><%= treatmentPlans %></textarea>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="three columns">
			<input class="button-primary u-pull-right" value="Update Patient" type="submit"></input>
			</div>
		</div>
	</form>
	<hr>
	<s:form action="uploadAction" id="uploadAction" enctype="multipart/form-data" method="post">
		<div class ="row">
			<div class="twelve columns" align="center">
				<h5><b>Upload a Patient File</b></h5>
				<input type="hidden" name="patientID" id="patientID" value="<%=session.getAttribute("patientid") %>">
			</div>
		</div>
		<div class ="row">
			<div class="twelve columns">
				<s:file name="fileUpload" label="Select a file to upload" size="30"/>
			</div>
		</div>
		<br>
		<div class="row">
			<div class="three columns">
			<s:submit value="Upload File" name="submit" />
		</input>
			</div>
		</div>
	</s:form>
</div>
</body>
</html>