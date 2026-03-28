<%@page import="java.sql.*" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String rn = request.getParameter("t1");
            int a = Integer.parseInt(rn);
            String name = request.getParameter("t2");
            int i;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/studentdb",
                        "root",
                        "password"
                );
                Statement st = c.createStatement();
                String btn = request.getParameter("b");
                if (btn.equals("update")) {
                    i = st.executeUpdate("update stud set name='" + name + "'whererno=" + a + "");
                    out.println("record update");
                }
                if (btn.equals("delete")) {
                    i = st.executeUpdate("delete * from stud where rno=" + a + "");
                    out.println("record delete");
                }
                if (btn.equals("insert")) {
                    i = st.executeUpdate("insert into stud values(" + a + ",'" + name + "')");
                    out.println("record insert");
                }
                if (btn.equals("view")) {
                    ResultSet rs = st.executeQuery("select * from stud");
                    out.println("student detail<br>");
                    while (rs.next()) {
                        out.println(rs.getInt("rno") + " ");
                        out.println(rs.getString("name"));
                        out.println("<br>");
                    }
                    out.println("record view");
                }
            } catch (Exception ee) {
                out.println(ee);
            }
        %>
    </body>
</html>
