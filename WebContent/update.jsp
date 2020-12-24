<%@page import="action.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/script.js"></script>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body class="update">
<h2>Update Student Details</h2>
<form action="ServletController" method="post">
<table align="center">
 

 	<input type="hidden" name="regno" value="<%=request.getParameter("id")%>" />
 
	
<tr>
 	<td>Name : </td>
 	<td> <input type="text" name="name" value="<%=request.getParameter("name") %>" onkeypress="return validInput(this,event)"/></td>
 </tr>
 <tr>
 	<td>Age : </td>
 	<td> <input type="text" name="age" value="<%=request.getParameter("age") %>" onkeypress="return validInput(this,event)"/></td>
 </tr>
 <tr>
 	<td>Email :</td>
 	<td> <input type="text" name="email" value="<%=request.getParameter("email") %>" onkeypress="return validInput(this,event)"/></td>
 </tr>
 <tr>
 	<td>Phone Number : </td>
 	<td> <input type="text" name="number" value="<%=request.getParameter("number") %>" onkeypress="return validInput(this,event)"/></td>
 </tr>
 
 <tr >
 	<td>DOJ('01-JAN-19') : </td>
 	<td> <input type="text" name="date" value="<%=request.getParameter("date") %>" onkeypress="return validInput(this,event)" /></td>
 </tr>
 <tr>
 <td><input type="submit" value="Update" onClick="return validCheck()"/></td>
 </tr>
</table>
<input type="hidden" name="frm" value="update" />
</form>
</body>
</html>