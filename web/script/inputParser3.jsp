<% 
if (session.getAttribute("pStreet") == null){
	session.setAttribute("pStreet", "");
}
if (session.getAttribute("pCity") == null){
	session.setAttribute("pCity", "");
}
if (session.getAttribute("pCountry") == null){
	session.setAttribute("pCountry", "");
}
if (session.getAttribute("pZip") == null){
	session.setAttribute("pZip", "");
}
%>