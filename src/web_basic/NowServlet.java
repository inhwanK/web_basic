package web_basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NowServlet
 */
@WebServlet("/NowServlet")
public class NowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NowServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());

		Date now = new Date();
		PrintWriter writer = response.getWriter();
		writer.println("<br>");
		writer.println("<html>");
		writer.println("<html>\r\n" + "<head>\r\n" + "<title>서블렛 생성 현재 시간</title>\r\n" + "</head>" + "<body>");

		writer.println("서블렛 생성시간 :" + now);
		writer.println("</body>\r\n" + "</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
