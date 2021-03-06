package com.niit.movie;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mohith
 */
@WebServlet(name = "Jan_Movies", urlPatterns = {"/Jan_Movies"})
public class Jan_Movies extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String URL = "jdbc:derby://localhost:1527/sample";
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection(URL,"app","app");
            Statement stmt = con.createStatement();
            String qry="SELECT TITLE,RELEASEDATE FROM MOVIE WHERE RELEASEDATE >='2016-01-01' AND RELEASEDATE <='2016-01-31'";
            ResultSet rs = stmt.executeQuery(qry);
            out.println("<html><body>");
            out.println("<style>table, th, td { border: 1px solid black;}</style>");
            out.println("<b>1. List of all the movies released between 1 Jan and 31 Jan</b><br><br>");
             out.println(" <table><th>Title</th><th>Release Date</th>");
            while(rs.next())
            {
                
                String st = rs.getString("TITLE");
                String ct = rs.getString("RELEASEDATE");
                out.println("<tr><td>"+st+"</td><td>"+ct+"</td></tr>");
             }
            out.println("</table>");
            out.println("<br><br><a href=/MOVIE/index.html>Back</a>");
            out.println("</body></html>");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}