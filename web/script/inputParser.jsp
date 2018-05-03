<% 
String month = "Select Month";
String year = "Select Year";
String day = "Select Day";
String isMale = "checked='checked'";
String isFemale = "";
String citizenship = "Select One";
String religion = "Select One";
String civil = "Select One";
String birthDayDisabled = "disabled='disabled'";
String birthMonthDisabled = "disabled='disabled'";
String birthYearDisabled = "disabled='disabled'";
String civilDisabled = "disabled='disabled'";
if (session.getAttribute("pFirstName") == null){
	session.setAttribute("pFirstName", "");
}
if (session.getAttribute("pLastName") == null) {
	session.setAttribute("pLastName", "");
}
if (session.getAttribute("pMiddleName") == null) {
	session.setAttribute("pMiddleName", "");
}
if (session.getAttribute("pMiddleName") == null) {
	session.setAttribute("pMiddleName", "");
}
if (session.getAttribute("pBirthMonth") == null) {
	session.setAttribute("pBirthMonth", "");
} else {
	month = session.getAttribute("pBirthMonth").toString();
	birthMonthDisabled = "";
}
if (session.getAttribute("pBirthDay") == null) {
	session.setAttribute("pBirthDay", 0);
} else {
	day = session.getAttribute("pBirthDay").toString();
	birthDayDisabled = "";
}
if (session.getAttribute("pBirthYear") == null) {
	session.setAttribute("pBirthYear", 0);
} else {
	year = session.getAttribute("pBirthYear").toString();
	birthYearDisabled = "";
}
if (session.getAttribute("pGender") == null) {
	session.setAttribute("pGender", "");
} else if (session.getAttribute("pGender").toString().equals("F")) {
	isMale = "";
	isFemale = "checked='checked'";
}
if (session.getAttribute("pBirthPlace") == null) {
	session.setAttribute("pBirthPlace", "");
}
if (session.getAttribute("pCitizenship") == null) {
	session.setAttribute("pCitizenship", "");
} else {
	citizenship = session.getAttribute("pCitizenship").toString();
}
if (session.getAttribute("pReligion") == null) {
	session.setAttribute("pReligion", "");
} else {
	religion = session.getAttribute("pReligion").toString();
}
if (session.getAttribute("pCivil") == null) {
	session.setAttribute("pCivil", "");
} else {
	civil = session.getAttribute("pCivil").toString();
	civilDisabled = "";
}
if (session.getAttribute("pJob") == null) {
	session.setAttribute("pJob", "");
}

%>