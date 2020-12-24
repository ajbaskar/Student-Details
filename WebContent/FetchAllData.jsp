<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,action.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fetch All Student</title>
</head>
<body class="fetch">
<table  border="1" align="center">
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Age</th>
	<th>Email</th>
	<th>Number</th>
	<th>Doj</th>
	<th colspan="2">Action</th>
</tr>
<%
	List<StudentBean> li=(List)request.getAttribute("fetchall");
	Iterator ir=li.iterator();
	while(ir.hasNext()){
	StudentBean b=(StudentBean)ir.next();
	
%>
	
<tr>
	<td><%=b.getId() %></td>
	<td><%=b.getName() %></td>
	<td><%=b.getAge() %></td>
	<td><%=b.getEmail() %></td>
	<td><%=b.getNumber() %></td>
	<td><%=b.getDate() %></td>
	
	<td><a href="update.jsp?id=<%=b.getId()%>&name=<%=b.getName() %>&age=<%=b.getAge() %>
	&email=<%=b.getEmail() %>&number=<%=b.getNumber() %>&date=<%=b.getDate() %>">update</a></td>
	
	<td><a href="ServletController?frm=delete&delid=<%=b.getId()%>">delete</a></td>
</tr>
<%
}                                                                                                                                      
	
%>
</table>
<br><br>
<div id="fetchall">
<a href="index.jsp">Home</a>
</div>
</body>
</html>