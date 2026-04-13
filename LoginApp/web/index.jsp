<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #667eea, #764ba2);
            margin: 0;
            padding: 0;
        }

        .container {
            width: 400px;
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

        .btn {
            display: block;
            width: 80%;
            margin: 10px auto;
            padding: 12px;
            text-decoration: none;
            color: white;
            background: #667eea;
            border-radius: 6px;
            font-size: 16px;
            transition: 0.3s;
        }

        .btn:hover {
            background: #5a67d8;
        }

        .register {
            background: #48bb78;
        }

        .register:hover {
            background: #38a169;
        }
    </style>
</head>

<body>

<div class="container">
    <h2>Welcome to Login System</h2>

    <a href="login.jsp" class="btn">Login</a>
    <a href="register.jsp" class="btn register">Register</a>
</div>

</body>
</html>