/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mohith
 */
   @WebServlet(name = "Show", urlPatterns = {"/Show"})
public class Show extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String stitle = request.getParameter("season_title");
        String syear = request.getParameter("year");
         String sseason = request.getParameter("season");
        PrintWriter hmm = response.getWriter(); 
        hmm.println("<html>");
	hmm.println("<body>"); 
        hmm.println("Title: "+stitle+"<br>");
        hmm.println("Year: "+syear+"<br>");
        hmm.println("Season: "+sseason+"<br>");
        hmm.println("</html>");
	hmm.println("</body>");
        
    }

private void generateView(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	}

}