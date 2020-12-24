<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fetch Student</title>
</head>
<body class="view">
<h2>Student Details</h2>

<label>Id : </label>${fetch.id} <br>
<label>Name : </label> ${fetch.name} <br>
<label>Age : </label>${fetch.age} <br>
<label>Email : </label> ${fetch.email}<br>
<label>Phone Number : </label>${fetch.number}<br>
<label>Date of Joining : </label>${fetch.date} <br>
</body>
</html>