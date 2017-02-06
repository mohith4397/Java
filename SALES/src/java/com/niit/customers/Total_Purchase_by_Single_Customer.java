package com.niit.customers;
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
@WebServlet(name = "Total_Purchase_by_Single_Customer", urlPatterns = {"/Total_Purchase_by_Single_Customer"})
public class Total_Purchase_by_Single_Customer extends HttpServlet 
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
            String qry="SELECT CUSTID,SUM(TOTALPRICE) FROM SALES GROUP BY CUSTID";
            ResultSet rs = stmt.executeQuery(qry);
            out.println("<html><body>");
            out.println("<style>table, th, td { border: 1px solid black;}</style>");
            out.println("<b>1. Display total purchases made by single customer</b><br><br>");
             out.println(" <table><th>Customer ID</th><th>Total Purchase</th>");
            while(rs.next())
            {
                
                String st = rs.getString("CUSTID");
                String ct = rs.getString("2");
                out.println("<tr><td>"+st+"</td><td>"+ct+"</td></tr>");
             }
            out.println("</table>");
            out.println("<br><br><a href=/SALES/index.html>Back</a>");
            out.println("</body></html>");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}