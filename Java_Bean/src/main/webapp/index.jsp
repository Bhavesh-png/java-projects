<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Java Bean Demo</title>
</head>
<body>

<h1>Demonstrates Java Bean</h1>

<jsp:useBean id="student" class="mypackage.packg" scope="page">
    <jsp:setProperty name="student" property="rno" value="1" />
    <jsp:setProperty name="student" property="sname" value="Bhavesh" />
</jsp:useBean>

Roll No: <jsp:getProperty name="student" property="rno" /><br>
Student Name: <jsp:getProperty name="student" property="sname" />

</body>
</html>