<%
  if(session.getAttribute("login") == null){
       response.sendRedirect("/index.jsp");
       return;
  } else {
  }
%>