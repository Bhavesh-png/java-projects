
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.sql.*;

@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb?useSSL=false&serverTimezone=UTC",
                    "root",
                    "" // ✅ empty password for XAMPP
            );

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM stud");

            out.println("<h3>Student Records</h3>");

            while (rs.next()) {
                out.println(rs.getInt("rno") + " - " + rs.getString("name") + "<br>");
            }

            con.close();

        } catch (Exception e) {
            out.println("Error: " + e);
        }
    }
}
