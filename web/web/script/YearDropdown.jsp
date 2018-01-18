<%@ page import="java.util.Calendar" %>

<%!Calendar rightNow = Calendar.getInstance(); 
	int Year = rightNow.get(Calendar.YEAR);
%>  
<% for (int i=0;i<=100;i++){ %>
					<option value="<%= Year-i %>"><%=Year-i%></option> 
<% } %>