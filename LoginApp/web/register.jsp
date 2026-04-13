<!DOCTYPE html>
<html>
<head>
    <title>Register</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #ff7e5f, #feb47b);
            margin: 0;
            padding: 0;
        }

        .container {
            width: 350px;
            margin: 120px auto;
            background: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0px 0px 20px rgba(0,0,0,0.2);
            text-align: center;
        }

        h2 {
            margin-bottom: 20px;
            color: #333;
        }

        input[type="text"], input[type="password"] {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            border-radius: 6px;
            border: 1px solid #ccc;
            font-size: 14px;
        }

        .btn {
            width: 95%;
            padding: 10px;
            background: #ff7e5f;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 6px;
            cursor: pointer;
            transition: 0.3s;
        }

        .btn:hover {
            background: #e96a50;
        }

        .link {
            margin-top: 15px;
            display: block;
            color: #555;
            text-decoration: none;
        }

        .link:hover {
            color: #000;
        }

        .success {
            color: green;
            font-size: 14px;
        }
    </style>
</head>

<body>

<div class="container">
    <h2>Register</h2>

    <% 
        String success = request.getParameter("success");
        if (success != null) {
    %>
        <div class="success">Registration Successful! Please login.</div>
    <% } %>

    <form action="RegisterServlet" method="post">
        <input type="text" name="username" placeholder="Enter Username" required><br>
        <input type="password" name="password" placeholder="Enter Password" required><br>

        <input type="submit" value="Register" class="btn">
    </form>

    <a href="login.jsp" class="link">Already have an account? Login</a>
</div>

</body>
</html>