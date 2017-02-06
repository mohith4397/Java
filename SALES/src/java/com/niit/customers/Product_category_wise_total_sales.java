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
@WebServlet(name = "Product_category_wise_total_sales", urlPatterns = {"/Product_category_wise_total_sales"})
public class Product_category_wise_total_sales extends HttpServlet 
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
            String qry="SELECT PRODTYPE,SUM(PRODPRICE) FROM SALES GROUP BY PRODTYPE";
            ResultSet rs = stmt.executeQuery(qry);
            out.println("<html><body>");
            out.println("<style>table, th, td { border: 1px solid black;}</style>");
            out.println("<b>4. Display total sales product wise</b><br><br>");
             out.println(" <table><th>Product Type</th><th>Total Sales</th>");
            while(rs.next())
            {
               String st3 = rs.getString("PRODTYPE");
                String st4 = rs.getString("2");
                out.println(
                        "<tr>   <td>"+st3+"</td>"+
                                "<td>"+st4+"</td>" +
                               
                          "</tr>"
                                );
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