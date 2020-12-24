<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Information System</title>
</head>
<body class="back">

<h2>Student Information System</h2>

<table border="3" align="center">
	<tr>
		<td><a href="RegisterForm.jsp" >Add student</a> </td>
	</tr>
	<tr>
		<td><a href="ServletController?frm=updateOnly" >Update Details</a> </td>
	</tr>
	<tr>
		<td><a href="fetch.jsp" >Fetch Students</a> </td>
	</tr>
	<tr>
		<td><a href="ServletController?frm=fetchall"> Fetch All Student</a> </td>
	</tr>
</table>

</body>
</html>