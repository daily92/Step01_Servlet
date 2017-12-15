package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PictureServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		PrintWriter pw = response.getWriter();
		pw.println("<doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8' />");
		pw.println("<title>오늘의 사진 보기</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.print("<p> 오늘의 사진 : <strong>강하늘</strong> </p>");
		//상대 경로
		// http://localhost:8888/Step01_Servlet/today/picture 에서 
		// picture 는 today 폴더 안에 있음. 즉 현재 위치는 today 폴더 안 (picture 은 폴더가 아님!!)
		// ../ 즉, 하나 상위폴더는 Step01_Servlet 내부 임. 
		// WebContent 에 있는 애들은 Step01_Servlet 내부에 있는 것이라서
		// ../images 하면 됨!!!!
		pw.print("<p><img src='../images/9.jpg'></p>");
		pw.print("<p><img src='/Step01_Servlet/images/10.jpg'></p>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
