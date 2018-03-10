<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register New Patient</title>
<link rel="stylesheet" type="text/css" href="css/basedesign.css" />
<link rel="stylesheet" type="text/css" href="css/skeleton2.css" />
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<script type="text/javascript" src="javascript/isNumberKey.js"></script>
<%@ include file="script/SessionCheck2.jsp" %>
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
							<h4>Register New Patient</h4>
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
	<form action="registerPatient.action" method="post">
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
			    <input class="u-full-width" type="text" name="middleName" id="middleName" placeholder="Mother's Maiden Name" required="required"></input>
			</div>
		</div>
		<br>
		<div class="row"> <!-- 1 Row -->
			<div class="three columns">
				<label>Birthday:</label>
			</div>
			<div class="three columns">
				<select id="birthMonth" name="birthMonth" required="required" class="u-full-width">
					 <option selected="selected" disabled="disabled" value="0">Select Month</option>
					 <option value="Jan">January</option>
					 <option value="Feb">February</option>
					 <option value="Mar">March</option>
					 <option value="Apr">April</option>
					 <option value="May">May</option>
					 <option value="Jun">June</option>
					 <option value="Jul">July</option>
					 <option value="Aug">August</option>
					 <option value="Sep">September</option>
					 <option value="Oct">October</option>
					 <option value="Nov">November</option>
					 <option value="Dec">December</option>
				</select>
			</div>
			<div class="three columns">
				<select id="birthDay" name="birthDay" required="required" class="u-full-width">
					 <option selected="selected" disabled="disabled" value="0">Select Day</option>
					 <option value="1">01</option>
					 <option value="2">02</option>
					 <option value="3">03</option>
					 <option value="4">04</option>
					 <option value="5">05</option>
					 <option value="6">06</option>
					 <option value="7">07</option>
					 <option value="8">08</option>
					 <option value="9">09</option>
					 <option value="10">10</option>
					 <option value="11">11</option>
					 <option value="12">12</option>
					 <option value="13">13</option>
					 <option value="14">14</option>
					 <option value="15">15</option>
					 <option value="16">16</option>
					 <option value="17">17</option>
					 <option value="18">18</option>
					 <option value="19">19</option>
					 <option value="20">20</option>
					 <option value="21">21</option>
					 <option value="22">22</option>
					 <option value="23">23</option>
					 <option value="24">24</option>
					 <option value="25">25</option>
					 <option value="26">26</option>
					 <option value="27">27</option>
					 <option value="28">28</option>
					 <option value="29">29</option>
					 <option value="30">30</option>
					 <option value="31">31</option>
				</select>
			</div>
			<div class="three columns">
				<select id="birthYear" name="birthYear" required="required" class="u-full-width">
					<option selected="selected" disabled="disabled" value="0">Select Year</option>
					<jsp:include page="script/YearDropdown.jsp"></jsp:include>
				</select>
			</div>
			</div> <!-- 1 Row End -->
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
			<div class="row"> <!-- 1 Row -->
				<div class="two columns">
					<label>Birthplace:</label>
				</div>
				<div class="two columns">
					<input class="u-full-width" type="text" name="birthPlace" id="birthPlace" placeholder="Place of Birth" required="required"></input>
				</div>
				<div class="two columns">
					<label>Citizenship:</label>
				</div>
				<div class="two columns">
					<input class="u-full-width" type="text" name="citizenship" id="citizenship" placeholder="Nationality" required="required"></input>
				</div>
				<div class="two columns">
					<label>Religion:</label>
				</div>
				<div class="two columns">
					<input class="u-full-width" type="text" name="religion" id="religion" placeholder="Religion" required="required"></input>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="two columns">
					<label>Civil Status:</label>
				</div>
				<div class="two columns">
					<input type="radio" name ="civil" id="single" value="single" checked="checked"> Single
				</div>
				<div class="two columns">
					<input type="radio" name ="civil" id="married" value="married"> Married
				</div>
				<div class="two columns">
					<input type="radio" name ="civil" id="widowed/widower" value="widow" > Widow/Widower
				</div>
				<div class="two columns">
					<input type="radio" name ="civil" id="divorced" value="divorced" > Divorced
				</div>
				<div class="two columns">
					<input type="radio" name ="civil" id="separated" value="separated" > Separated
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Present Address: </label>
				</div>
				<div class="nine columns">
					<input class="u-full-width" type="text" name="presentAddress" id="presentAddress" placeholder="Address" required="required"></input>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Permanent Address: </label>
				</div>
				<div class="nine columns">
					<input class="u-full-width" type="text" name="permanentAddress" id="permanentAddress" placeholder="Disregard this line if the address is the same as the present address"></input>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Cellphone Number: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" onkeypress="return isNumberKey(event)" type="text" name="cellno" id="cellno" placeholder="e.g. 04799755545" required="required"></input>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Home Number: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" onkeypress="return isNumberKey(event)" type="text" name="homeno" id="homeno" placeholder="e.g. 8653326"></input>
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
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Occupation: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" type="text" name="job" id="job" placeholder="e.g. Accountant. If unemployed, state Unemployed" required="required"></input>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Employer: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" type="text" name="employer" id="employer" placeholder="Employer"></input>
				</div>
				<div class="three columns">
					<label>ID Number: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" type="text" name="employerid" id="employerid" placeholder="ID Number from Employer"></input>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Employer's Address: </label>
				</div>
				<div class="nine columns">
					<input class="u-full-width" type="text" name="employersAddress" id="employersAddress"></input>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Employer's Contact No.: </label>
				</div>
				<div class="nine columns">
					<input class="u-full-width" type="text" name="employerNo" id="employerNo"></input>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row">
				<div class="three columns">
					<label>Mother's Name:</label>
				</div>
				<div class="three columns">
				    <input class="u-full-width" type="text" name="mothersFirstName" id="mothersFirstName" placeholder="First Name"></input>
				</div>
				<div class="three columns">
				    <input class="u-full-width" type="text" name="mothersLastName" id="mothersLastName" placeholder="Last Name"></input>
				</div>
				<div class="three columns">
				    <input class="u-full-width" type="text" name="mothersMiddleName" id="mothersMiddleName" placeholder="Middle Name"></input>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="three columns">
					<label>Father's Name:</label>
				</div>
				<div class="three columns">
				    <input class="u-full-width" type="text" name="fathersFirstName" id="fathersFirstName" placeholder="First Name"></input>
				</div>
				<div class="three columns">
				    <input class="u-full-width" type="text" name="fathersLastName" id="fathersLastName" placeholder="Last Name"></input>
				</div>
				<div class="three columns">
				    <input class="u-full-width" type="text" name="fathersMiddleName" id="fathersMiddleName" placeholder="Middle Name"></input>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="three columns">
					<label>Spouse's Name:</label>
				</div>
				<div class="three columns">
				    <input class="u-full-width" type="text" name="spouseName" id="spousefirstName" placeholder="First Name"></input>
				</div>
				<div class="three columns">
				    <input class="u-full-width" type="text" name="spouselastName" id="spouselastName" placeholder="Last Name"></input>
				</div>
				<div class="three columns">
				    <input class="u-full-width" type="text" name="spousemiddleName" id="spousemiddleName" placeholder="Middle Name"></input>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="three columns">
				<input class="button-primary u-pull-right" value="Register Patient" type="submit"></input>
				</div>
			</div>
	</form>
</div>
</body>
</html>