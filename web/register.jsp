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
<%@ include file="script/inputParser.jsp" %>
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
			    <input class="u-full-width" type="text" name="firstName" id="firstName" placeholder="First Name" required="required" value="<%= session.getAttribute("pFirstName") %>"></input>
			</div>
			<div class="three columns">
			    <input class="u-full-width" type="text" name="lastName" id="lastName" placeholder="Last Name" required="required" value="<%= session.getAttribute("pLastName") %>"></input>
			</div>
			<div class="three columns">
			    <input class="u-full-width" type="text" name="middleName" id="middleName" placeholder="Mother's Maiden Name" value="<%= session.getAttribute("pMiddleName") %>"></input>
			</div>
		</div>
		<br>
		<div class="row"> <!-- 1 Row -->
			<div class="three columns">
				<label>Birthday:</label>
			</div>
			<div class="three columns">
				<select id="birthMonth" name="birthMonth" required="required" class="u-full-width">
					 <option selected="selected" <%= birthMonthDisabled %> value="<%= session.getAttribute("pBirthMonth") %>"><%= month %></option>
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
					 <option selected="selected" <%= birthDayDisabled %> value="<%= session.getAttribute("pBirthDay") %>"><%= day %></option>
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
					<option selected="selected" <%= birthYearDisabled %> value="<%= session.getAttribute("pBirthYear") %>"><%= year %></option>
					<jsp:include page="script/YearDropdown.jsp"></jsp:include>
				</select>
			</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Gender:</label>
				</div>
				<div class="two columns">
					<input type="radio" name ="gender" id="male" value="M" <%= isMale %>> Male
				</div>
				<div class="two columns">
					<input type="radio" name ="gender" id="female" value="F" <%= isFemale %>> Female
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Birthplace:</label>
				</div>
				<div class="three columns">
					<input class="u-full-width" type="text" name="birthPlace" id="birthPlace" placeholder="Place of Birth" value="<%= session.getAttribute("pBirthPlace") %>" required="required"></input>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="three columns">
					<label>Citizenship:</label>
				</div>
				<div class="three columns">
					<select class="u-full-width" id="citizenship" name="citizenship" >
						  <option value="<%= session.getAttribute("pCitizenship") %>" disabled="disabled"><%= citizenship %></option>
						  <option value="afghan">Afghan</option>
						  <option value="albanian">Albanian</option>
						  <option value="algerian">Algerian</option>
						  <option value="american">American</option>
						  <option value="andorran">Andorran</option>
						  <option value="angolan">Angolan</option>
						  <option value="antiguans">Antiguans</option>
						  <option value="argentinean">Argentinean</option>
						  <option value="armenian">Armenian</option>
						  <option value="australian">Australian</option>
						  <option value="austrian">Austrian</option>
						  <option value="azerbaijani">Azerbaijani</option>
						  <option value="bahamian">Bahamian</option>
						  <option value="bahraini">Bahraini</option>
						  <option value="bangladeshi">Bangladeshi</option>
						  <option value="barbadian">Barbadian</option>
						  <option value="barbudans">Barbudans</option>
						  <option value="batswana">Batswana</option>
						  <option value="belarusian">Belarusian</option>
						  <option value="belgian">Belgian</option>
						  <option value="belizean">Belizean</option>
						  <option value="beninese">Beninese</option>
						  <option value="bhutanese">Bhutanese</option>
						  <option value="bolivian">Bolivian</option>
						  <option value="bosnian">Bosnian</option>
						  <option value="brazilian">Brazilian</option>
						  <option value="british">British</option>
						  <option value="bruneian">Bruneian</option>
						  <option value="bulgarian">Bulgarian</option>
						  <option value="burkinabe">Burkinabe</option>
						  <option value="burmese">Burmese</option>
						  <option value="burundian">Burundian</option>
						  <option value="cambodian">Cambodian</option>
						  <option value="cameroonian">Cameroonian</option>
						  <option value="canadian">Canadian</option>
						  <option value="cape verdean">Cape Verdean</option>
						  <option value="central african">Central African</option>
						  <option value="chadian">Chadian</option>
						  <option value="chilean">Chilean</option>
						  <option value="chinese">Chinese</option>
						  <option value="colombian">Colombian</option>
						  <option value="comoran">Comoran</option>
						  <option value="congolese">Congolese</option>
						  <option value="costa rican">Costa Rican</option>
						  <option value="croatian">Croatian</option>
						  <option value="cuban">Cuban</option>
						  <option value="cypriot">Cypriot</option>
						  <option value="czech">Czech</option>
						  <option value="danish">Danish</option>
						  <option value="djibouti">Djibouti</option>
						  <option value="dominican">Dominican</option>
						  <option value="dutch">Dutch</option>
						  <option value="east timorese">East Timorese</option>
						  <option value="ecuadorean">Ecuadorean</option>
						  <option value="egyptian">Egyptian</option>
						  <option value="emirian">Emirian</option>
						  <option value="equatorial guinean">Equatorial Guinean</option>
						  <option value="eritrean">Eritrean</option>
						  <option value="estonian">Estonian</option>
						  <option value="ethiopian">Ethiopian</option>
						  <option value="fijian">Fijian</option>
						  <option value="filipino" selected="selected">Filipino</option>
						  <option value="finnish">Finnish</option>
						  <option value="french">French</option>
						  <option value="gabonese">Gabonese</option>
						  <option value="gambian">Gambian</option>
						  <option value="georgian">Georgian</option>
						  <option value="german">German</option>
						  <option value="ghanaian">Ghanaian</option>
						  <option value="greek">Greek</option>
						  <option value="grenadian">Grenadian</option>
						  <option value="guatemalan">Guatemalan</option>
						  <option value="guinea-bissauan">Guinea-Bissauan</option>
						  <option value="guinean">Guinean</option>
						  <option value="guyanese">Guyanese</option>
						  <option value="haitian">Haitian</option>
						  <option value="herzegovinian">Herzegovinian</option>
						  <option value="honduran">Honduran</option>
						  <option value="hungarian">Hungarian</option>
						  <option value="icelander">Icelander</option>
						  <option value="indian">Indian</option>
						  <option value="indonesian">Indonesian</option>
						  <option value="iranian">Iranian</option>
						  <option value="iraqi">Iraqi</option>
						  <option value="irish">Irish</option>
						  <option value="israeli">Israeli</option>
						  <option value="italian">Italian</option>
						  <option value="ivorian">Ivorian</option>
						  <option value="jamaican">Jamaican</option>
						  <option value="japanese">Japanese</option>
						  <option value="jordanian">Jordanian</option>
						  <option value="kazakhstani">Kazakhstani</option>
						  <option value="kenyan">Kenyan</option>
						  <option value="kittian and nevisian">Kittian and Nevisian</option>
						  <option value="kuwaiti">Kuwaiti</option>
						  <option value="kyrgyz">Kyrgyz</option>
						  <option value="laotian">Laotian</option>
						  <option value="latvian">Latvian</option>
						  <option value="lebanese">Lebanese</option>
						  <option value="liberian">Liberian</option>
						  <option value="libyan">Libyan</option>
						  <option value="liechtensteiner">Liechtensteiner</option>
						  <option value="lithuanian">Lithuanian</option>
						  <option value="luxembourger">Luxembourger</option>
						  <option value="macedonian">Macedonian</option>
						  <option value="malagasy">Malagasy</option>
						  <option value="malawian">Malawian</option>
						  <option value="malaysian">Malaysian</option>
						  <option value="maldivan">Maldivan</option>
						  <option value="malian">Malian</option>
						  <option value="maltese">Maltese</option>
						  <option value="marshallese">Marshallese</option>
						  <option value="mauritanian">Mauritanian</option>
						  <option value="mauritian">Mauritian</option>
						  <option value="mexican">Mexican</option>
						  <option value="micronesian">Micronesian</option>
						  <option value="moldovan">Moldovan</option>
						  <option value="monacan">Monacan</option>
						  <option value="mongolian">Mongolian</option>
						  <option value="moroccan">Moroccan</option>
						  <option value="mosotho">Mosotho</option>
						  <option value="motswana">Motswana</option>
						  <option value="mozambican">Mozambican</option>
						  <option value="namibian">Namibian</option>
						  <option value="nauruan">Nauruan</option>
						  <option value="nepalese">Nepalese</option>
						  <option value="new zealander">New Zealander</option>
						  <option value="ni-vanuatu">Ni-Vanuatu</option>
						  <option value="nicaraguan">Nicaraguan</option>
						  <option value="nigerien">Nigerien</option>
						  <option value="north korean">North Korean</option>
						  <option value="northern irish">Northern Irish</option>
						  <option value="norwegian">Norwegian</option>
						  <option value="omani">Omani</option>
						  <option value="pakistani">Pakistani</option>
						  <option value="palauan">Palauan</option>
						  <option value="panamanian">Panamanian</option>
						  <option value="papua new guinean">Papua New Guinean</option>
						  <option value="paraguayan">Paraguayan</option>
						  <option value="peruvian">Peruvian</option>
						  <option value="polish">Polish</option>
						  <option value="portuguese">Portuguese</option>
						  <option value="qatari">Qatari</option>
						  <option value="romanian">Romanian</option>
						  <option value="russian">Russian</option>
						  <option value="rwandan">Rwandan</option>
						  <option value="saint lucian">Saint Lucian</option>
						  <option value="salvadoran">Salvadoran</option>
						  <option value="samoan">Samoan</option>
						  <option value="san marinese">San Marinese</option>
						  <option value="sao tomean">Sao Tomean</option>
						  <option value="saudi">Saudi</option>
						  <option value="scottish">Scottish</option>
						  <option value="senegalese">Senegalese</option>
						  <option value="serbian">Serbian</option>
						  <option value="seychellois">Seychellois</option>
						  <option value="sierra leonean">Sierra Leonean</option>
						  <option value="singaporean">Singaporean</option>
						  <option value="slovakian">Slovakian</option>
						  <option value="slovenian">Slovenian</option>
						  <option value="solomon islander">Solomon Islander</option>
						  <option value="somali">Somali</option>
						  <option value="south african">South African</option>
						  <option value="south korean">South Korean</option>
						  <option value="spanish">Spanish</option>
						  <option value="sri lankan">Sri Lankan</option>
						  <option value="sudanese">Sudanese</option>
						  <option value="surinamer">Surinamer</option>
						  <option value="swazi">Swazi</option>
						  <option value="swedish">Swedish</option>
						  <option value="swiss">Swiss</option>
						  <option value="syrian">Syrian</option>
						  <option value="taiwanese">Taiwanese</option>
						  <option value="tajik">Tajik</option>
						  <option value="tanzanian">Tanzanian</option>
						  <option value="thai">Thai</option>
						  <option value="togolese">Togolese</option>
						  <option value="tongan">Tongan</option>
						  <option value="trinidadian or tobagonian">Trinidadian or Tobagonian</option>
						  <option value="tunisian">Tunisian</option>
						  <option value="turkish">Turkish</option>
						  <option value="tuvaluan">Tuvaluan</option>
						  <option value="ugandan">Ugandan</option>
						  <option value="ukrainian">Ukrainian</option>
						  <option value="uruguayan">Uruguayan</option>
						  <option value="uzbekistani">Uzbekistani</option>
						  <option value="venezuelan">Venezuelan</option>
						  <option value="vietnamese">Vietnamese</option>
						  <option value="welsh">Welsh</option>
						  <option value="yemenite">Yemenite</option>
						  <option value="zambian">Zambian</option>
						  <option value="zimbabwean">Zimbabwean</option>
						</select>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="three columns">
					<label>Religion:</label>
				</div>
				<div class="three columns">
					<select class="u-full-width" id="religion" name="religion">
					    <option value="<%= session.getAttribute("pReligion") %>" selected="selected" <%= religionDisabled %>><%= religion %></option>
					    <option value="African Traditional &amp; Diasporic">African Traditional &amp; Diasporic</option>
					    <option value="Agnostic">Agnostic</option>
					    <option value="Atheist">Atheist</option>
					    <option value="Baha'i">Baha'i</option>
					    <option value="Buddhism">Buddhism</option>
					    <option value="Cao Dai">Cao Dai</option>
					    <option value="Chinese traditional religion">Chinese traditional religion</option>
					    <option value="Christianity">Christianity</option>
					    <option value="Hinduism">Hinduism</option>
					    <option value="Islam">Islam</option>
					    <option value="Jainism">Jainism</option>
					    <option value="Juche">Juche</option>
					    <option value="Judaism">Judaism</option>
					    <option value="Neo-Paganism">Neo-Paganism</option>
					    <option value="Nonreligious">Nonreligious</option>
					    <option value="Rastafarianism">Rastafarianism</option>
					    <option value="Secular">Secular</option>
					    <option value="Shinto">Shinto</option>
					    <option value="Sikhism">Sikhism</option>
					    <option value="Spiritism">Spiritism</option>
					    <option value="Tenrikyo">Tenrikyo</option>
					    <option value="Unitarian-Universalism">Unitarian-Universalism</option>
					    <option value="Zoroastrianism">Zoroastrianism</option>
					    <option value="primal-indigenous">primal-indigenous</option>
					    <option value="Other">Other</option>
					</select>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Civil Status:</label>
				</div>
				<div class="three columns">
					<select id="civil" name="civil" required="required" class="u-full-width">
					 <option selected="selected" <%=civilDisabled %> value="<%= session.getAttribute("pCivil") %>"><%= civil %></option>
					 <option value="single">Single</option>
					 <option value="married">Married</option>
					 <option value="widow">Widow</option>
					 <option value="divorced">Divorced</option>
					 <option value="separated">Separated</option>
					</select>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row"> <!-- 1 Row -->
				<div class="three columns">
					<label>Occupation: </label>
				</div>
				<div class="three columns">
					<input class="u-full-width" type="text" name="job" id="job" value="<%= session.getAttribute("pJob") %>" placeholder="e.g. Accountant"></input>
				</div>
			</div> <!-- 1 Row End -->
			<br>
			<div class="row">
				<div class="three columns">
				<input class="button-primary u-pull-right" value="Next" type="submit"></input>
				<input type="hidden" name="status" id="status" value="alive">
				</div>
			</div>
	</form>
</div>
</body>
</html>