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
@WebServlet(name = "Product_discount_greater_than_25", urlPatterns = {"/Product_discount_greater_than_25"})
public class Product_discount_greater_than_25 extends HttpServlet 
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
            String qry="SELECT PRODID,PRODPRICE,PRODTYPE,DISCOUNT FROM SALES WHERE DISCOUNT>25";
            ResultSet rs = stmt.executeQuery(qry);
            out.println("<html><body>");
            out.println("<style>table, th, td { border: 1px solid black;}</style>");
            out.println("<b>3. Display the list of products having discount > 25%</b><br><br>");
             out.println(" <table><th>Product ID</th><th>Product Price</th><th>Product Type</th><th>Discount</th>");
            while(rs.next())
            {
                
                
                String st2 = rs.getString("PRODID");
                String st3 = rs.getString("PRODPRICE");
                String st7 = rs.getString("PRODTYPE");
                String st8 = rs.getString("DISCOUNT");
                out.println(
                        "<tr>   <td>"+st2+"</td>"+
                                "<td>"+st3+"</td>" +
                                "<td>"+st7+"</td>" +
                                "<td>"+st8+"</td>" +
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