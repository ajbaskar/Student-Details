<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/script.js"></script>

<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert New Student</title>
</head>
<body class="back">
<h1>Insert New Student</h1>
<h2>Student Form</h2>
<div class="ex">
<form name="fm" action="ServletController" method="post">
<table align="center">
 
 <tr>
 	<td>Register No : </td>
 	<td> <input type="text" name="regno" maxlength="4" onkeypress="return validInput(this,event)"/></td>
 </tr>
	
<tr>
 	<td>Name : </td>
 	<td> <input type="text" name="name" maxlength="15" onkeypress="return validInput(this,event)"/></td>
 </tr>
 <tr>
 	<td>Age : </td>
 	<td> <input type="text" name="age" maxlength="2" onkeypress="return validInput(this,event)"/></td>
 </tr>
 <tr>
 	<td>Email :</td>
 	<td> <input type="text" name="email" maxlength="30"/></td>
 </tr>
 <tr>
 	<td>Phone Number : </td>
 	<td> <input type="text" name="number" maxlength="10" onkeypress="return validInput(this,event)"/></td>
 </tr>
 
 <tr >
 	<td>DOJ('01-JAN-19') : </td>
 	<td> <input type="text" name="date" onkeypress="return validInput(this,event)" /></td>
 </tr>
 <tr>
 <td><input type="submit" value="Add student" onClick="return validCheck()" /></td>
 <td align="right"><input type="reset" value="reset" onClick="return validCheck()"/> </td>
 </tr>
 <tr></tr>
 <tr></tr>
 <tr></tr>
 <tr></tr>
 <tr>
 
 <td><a href="index.jsp">Home</a></td></tr>
</table>
<input type="hidden" name="frm" value="register" />
</form>
</div>
</body>
</html>