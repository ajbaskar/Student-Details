<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fetch Student</title>
</head>
<body class="fetch">
<form action="ServletController" method="post">
<table>

<tr>
<td>Student Id : </td>
</tr>
<tr>
	<td><input type="text" name="fetch" /></td>
</tr>
<tr>
<td><input type="submit" />
</tr>
<tr>
<td><a href="index.jsp">Home</a></td>
</tr>
</table>
<input type="hidden" name="frm" value="fetch" />
</form>
</body>
</html>