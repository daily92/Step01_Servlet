package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 맵핑은 WEB-INF/web.xml 에서 하기
public class PersonServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//html + ctrl + space
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		PrintWriter pw = response.getWriter();
		pw.println("<doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8' />");
		pw.println("<title> 오늘의 인물 </title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.print("<p>오늘의 인물 : <strong>강하늘</strong> </p>");
		//상대경로
		//http://localhost:8888/Step01_Servlet/person 에서 
		//person 파일이 들어있는 Step01_Servlet 폴더 안! (person 은 폴더가 아님!!)
		//그래서 바로 images/ 하면 됨!!!
		pw.print("<img src=images/10.jpg>");
		pw.println("</body>");
		pw.println("</html>");
	}
}
