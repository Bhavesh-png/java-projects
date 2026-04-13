package com.mycompany;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBConnection.getConnection();

            // ✅ Check if user already exists
            PreparedStatement check = con.prepareStatement(
                "SELECT * FROM users WHERE username=?");
            check.setString(1, username);
            ResultSet rs = check.executeQuery();

            if (rs.next()) {
                // ❌ User already exists
                res.sendRedirect("register.jsp?error=1");
                return;
            }

            // ✅ Insert new user
            ps = con.prepareStatement(
                "INSERT INTO users(username, password) VALUES (?, ?)");

            ps.setString(1, username);
            ps.setString(2, password);

            int i = ps.executeUpdate();

            if (i > 0) {
                // ✅ Success → redirect to login
                res.sendRedirect("login.jsp?registered=1");
            } else {
                res.sendRedirect("register.jsp?error=1");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            // ✅ Close resources
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}