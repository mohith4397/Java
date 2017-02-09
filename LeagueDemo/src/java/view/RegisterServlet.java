package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="RegisterServlet",urlPatterns={"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
                
		generateView(request, response);

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
                response.setContentType("text/html");
                generateView(request, response);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form action=\"http://localhost:8080/LeagueDemo/Show\" method=\"GET\">");
                out.println("<br/> Title: <select name='season_title'>");
		out.println("<option name='spring'> Spring Soccer league </option>");
		out.println("<option name='autumn'> Autumn Soccer league </option>");
		out.println("<option name='summer'> Summer Soccer league </option>");
		out.println("<option name='winter'> Winter Soccer league </option>");
		out.println("<option name='Rainfall'> Rainfall Soccer league </option>");
		out.println("</select><br>");
		out.println("Season: <br/><input type='text' name='season'required>");
		out.println("<br/> Year:<br/><input type='number' name='year'required><br>");
		out.println(" <input type=\"submit\" name =\"submit\"/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
	}

	private void generateView(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	}

}
