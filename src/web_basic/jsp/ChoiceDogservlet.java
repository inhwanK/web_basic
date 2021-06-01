package web_basic.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp_chap03/choiceDog")
public class ChoiceDogservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		extracted(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		extracted(request, response);
	}

	private void extracted(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		String[] dog = request.getParameterValues("dog");
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body bgcolor='black'>");
		out.println("<table align='center' bgcolor='yellow'>");
		out.println("<tr>");
		for(int i =0;i<dog.length;i++) {
			out.println("<td>");
			out.println("<img src= 'Images/"+dog[i]+"'/>");
			out.println("</td>");
		}
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

}
