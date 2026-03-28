<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>  
    <center>
        <h1>JDBC Program</h1>
        <form action="jspdb.jsp" method="post">
            Roll No: <input type="text" name="t1"><br><br>
            Student Name: <input type="text" name="t2"><br><br>
            <input type="submit" name="b" value="insert">
            <input type="submit" name="b" value="update">
            <input type="submit" name="b" value="delete">
            <input type="submit" name="b" value="view">
        </form>
    </center>
</html>