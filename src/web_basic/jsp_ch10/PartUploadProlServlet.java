package web_basic.jsp_ch10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class PartUploadProlServlet
 */
@WebServlet("/jsp_chap10/partUploadPro1")
@MultipartConfig(
			fileSizeThreshold = 0,
			location = "C:\\Users\\202-12\\Desktop\\upload"
		)
public class PartUploadProlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public PartUploadProlServlet() {
    	
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String writer = request.getParameter("writer");
		Part part = request.getPart("partFile1");
		System.out.println(part);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String contentDisposition=part.getHeader("content-disposition");
//		String uploadFileName = part.getSubmittedFileName();
		String uploadFileName = getUploadFileName(contentDisposition);
		System.out.println(uploadFileName);
		part.write(uploadFileName);
		out.println("작성자 " + writer + "님이 " + uploadFileName + "파일을 업로드 하였습니다.");
		
	}


	private String getUploadFileName(String contentDisposition) {
		String uploadFileName = null;
		String[] contentSplitStr = contentDisposition.split(";");
		int firstOutosIndex = contentSplitStr[2].indexOf("\"");
		int lastOutosIndex = contentSplitStr[2].lastIndexOf("\"");
		uploadFileName = contentSplitStr[2].substring(firstOutosIndex + 1, lastOutosIndex);

		return uploadFileName;
	}

}
