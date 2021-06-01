package web_basic.jsp_ch13.erp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TitleInsertServlet
 */
@WebServlet("")
public class TitleInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private TitleService service;
    
    public TitleInsertServlet() {
        service = new TitleService();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		int tNo = Integer.parseInt(request.getParameter("titleno").trim());
		String tName = request.getParameter("titlename").trim();
		
		
		
//		request.getRequestDispatcher("web_basic/TitleSevlet.jsp").forward(request, response);
		
		response.sendRedirect("");
		Title title = new Title(tNo,tName);
		service.addTitle(title);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
