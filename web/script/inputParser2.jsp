<% 
String typeA = "Select Type";
String typeB = "Select Type";
String typeC = "Select Type";
String typeADisabled = "disabled='disabled'";
String typeBDisabled = "disabled='disabled'";
String typeCDisabled = "disabled='disabled'";

if (session.getAttribute("pTypeA") == null || session.getAttribute("pTypeA").toString().equals("")){
	session.setAttribute("pTypeA", "");
	typeA = "Select Type";
} else {
	typeA = session.getAttribute("pTypeA").toString();
	typeADisabled = "";
}
if (session.getAttribute("pTypeB") == null || session.getAttribute("pTypeB").toString().equals("")){
	session.setAttribute("pTypeB", "");
	typeB = "Select Type";
} else {
	typeB = session.getAttribute("pTypeB").toString();
	typeBDisabled = "";
}
if (session.getAttribute("pTypeC") == null || session.getAttribute("pTypeC").toString().equals("")){
	session.setAttribute("pTypeC", "");
	typeC = "Select Type";
} else {
	typeC = session.getAttribute("pTypeC").toString();
	typeCDisabled = "";
}
if (session.getAttribute("pContactA") == null){
	session.setAttribute("pContactA", "");
}
if (session.getAttribute("pContactB") == null){
	session.setAttribute("pContactB", "");
}
if (session.getAttribute("pContactC") == null){
	session.setAttribute("pContactC", "");
}
if (session.getAttribute("pEmail") == null){
	session.setAttribute("pEmail", "");
}

%>