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
@WebServlet(name = "Purchases_made_during_January", urlPatterns = {"/Purchases_made_during_January"})
public class Purchases_made_during_January extends HttpServlet 
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
            String qry="SELECT * FROM SALES WHERE DOP >= '2016-01-01' AND DOP <='2016-01-31'";
            ResultSet rs = stmt.executeQuery(qry);
            out.println("<html><body>");
            out.println("<style>table, th, td { border: 1px solid black;}</style>");
            out.println("<b>2. Display purchases made during January</b><br><br>");
             out.println(" <table><th>Customer ID</th><th>Product ID</th><th>Product Price</th><th>Quantity</th><th>Total Price</th><th>Date of Purchase</th><th>Product Type</th><th>Discount</th>");
            while(rs.next())
            {
                
                String st1 = rs.getString("CUSTID");
                String st2 = rs.getString("PRODID");
                String st3 = rs.getString("PRODPRICE");
                String st4 = rs.getString("QUANTITY");
                String st5 = rs.getString("TOTALPRICE");
                String st6 = rs.getString("DOP");
                String st7 = rs.getString("PRODTYPE");
                String st8 = rs.getString("DISCOUNT");
                out.println(
                        "<tr>   <td>"+st1+"</td>"+
                                "<td>"+st2+"</td>" +
                                "<td>"+st3+"</td>" +
                                "<td>"+st4+"</td>" +
                                "<td>"+st5+"</td>" +
                                "<td>"+st6+"</td>" +
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