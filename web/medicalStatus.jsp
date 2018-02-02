<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Medical Status</title>
<link rel="stylesheet" type="text/css" href="css/basedesign.css" />
<link rel="stylesheet" type="text/css" href="css/skeleton.css" />
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<script type="text/javascript" src="javascript/isNumberKey.js"></script>
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
	<hr> <!-- End of Header -->
	<div class ="row">
		<div class="six columns">
			<label>Patient: </label>[PatientName]
		</div>
		<div class="six columns">
			<label>ID Number: </label>[PatientNumber]
		</div>
	</div>
	<hr>
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
			<input type="text" onkeypress="return isNumberKey(event)" name="bloodPressure" id="bloodPressure" placeholder="mm/HG"> (mm/HG)
		</div>
	</div>
	<br>
	<div class ="row">
		<div class="three columns">
			<label>PR/CR:</label>
		</div>
	</div>
	<br>
	<div class ="row">
		<div class="three columns">
			<label>Respiratory Rate:</label>
		</div>
		<div class="nine columns">
			<input type="text" onkeypress="return isNumberKey(event)" name="respiratoryRate" id="respiratoryRate" placeholder="bpm"> (bpm)
		</div>
	</div>
	<br>
	<div class ="row">
		<div class="three columns">
			<label>Temperature:</label>
		</div>
		<div class="nine columns">
			<input type="text" onkeypress="return isNumberKey(event)" name="temperature" id="temperature" placeholder="Celsius"> (Celsius)
		</div>
	</div>
	<br>
	<div class ="row">
		<div class="three columns">
			<label>Weight:</label>
		</div>
		<div class="nine columns">
			<input type="text" onkeypress="return isNumberKey(event)" name="weight" id="weight" placeholder="kg"> (kg)
		</div>
	</div>
	<br>
	<div class ="row">
		<div class="three columns">
			<label>Height:</label>
		</div>
		<div class="nine columns">
			<input type="text" onkeypress="return isNumberKey(event)" name="height" id="height" placeholder="cm"> (cm)
		</div>
	</div>
	<hr>
	<div class ="row">
		<div class="twelve columns" align="center">
			<h5><b>Anthropometric Measurements</b></h5>
		</div>
	</div>
	<div class ="row">
		<div class="four columns">
			<label>Head Circumference:</label>
		</div>
		<div class="eight columns">
			<input type="text" onkeypress="return isNumberKey(event)" name="headCirc" id="headCirc" placeholder="cm"> (cm)
		</div>
	</div>
</div>
</body>
</html>