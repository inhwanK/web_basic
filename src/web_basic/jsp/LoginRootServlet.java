package web_basic.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRootServlet
 */
@WebServlet("/jsp_ch03/login")
public class LoginRootServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath()+"<br>");
		
		String id = request.getParameter("id");
		String passwd =  request.getParameter("passwd");
		
		
		PrintWriter out = response.getWriter();
		out.printf("id = " + id + "<br>");
		out.printf("passwd =" + passwd );
	}

}
