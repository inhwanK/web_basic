package web_basic.jsp_ch13.erp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp_chap13/TitleServlet")
public class TitleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private TitleService service;
    
    public TitleServlet() {
        service = new TitleService();
       
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		List<Title> lists = service.showTitles();
		
		request.setAttribute("list", lists);
		request.getRequestDispatcher("titlelist.jsp").forward(request, response);
//		request.getRequestDispatcher("/TitleServlet").forward(request, response);
		
		/*
		 * PrintWriter out = response.getWriter();
		 * 
		 * for(Title t :lists) { out.printf("%s- %s<br>", t.getNo(),t.getName());
		 */
		
		System.out.println(lists);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
