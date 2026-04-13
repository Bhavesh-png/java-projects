<%@ page session="true" %>
<!DOCTYPE html>

<head>
    <title>Dashboard</title>
    
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #4facfe, #00f2fe);
            margin: 0;
            padding: 0;
        }

        .container {
            width: 400px;
            margin: 100px auto;
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 0px 15px rgba(0,0,0,0.2);
            text-align: center;
        }

        h2 {
            color: #333;
        }

        .welcome {
            margin: 15px 0;
            font-size: 18px;
            color: #555;
        }

        .btn {
            padding: 10px 20px;
            border: none;
            background: #4facfe;
            color: white;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        .btn:hover {
            background: #007bff;
        }
    </style>
</head>



<%
    String user = (String) session.getAttribute("username");

    if (user == null) {
        response.sendRedirect("login.jsp");
    }
%>

<div class="container">
    <h2>Login Successful!</h2>

    <div class="welcome">
        Welcome, <b><%= user %></b>
    </div>

    <form action="LogoutServlet" method="post">
        <input type="submit" value="Logout" class="btn">
    </form>
</div>


