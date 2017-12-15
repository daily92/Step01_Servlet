package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FortunePictureServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//오늘의 사진 운세 목록
		String[] list= {"../../images/10.jpg",
						"/Step01_Servlet/images/11.jpg",
						"../../images/12.jpg",
						"../../images/13.jpg"};
		String[] list2= {"오늘은 하늘오빠랑 파스타를 먹게 될 거야", 
						"오늘은 하늘오빠랑 드라이브를 하게 될 거야",
						"오늘은 하늘오빠랑 족발을 먹게 될 거야",
						"오늘은 하늘오빠랑 치맥을 하게 될 거야"};
		
		int index= new Random().nextInt(4);
		String fortuneImg= list[index];
		String fortuneSentence= list2[index];
				
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		PrintWriter pw = response.getWriter();
		pw.println("<doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8' />");
		pw.println("<title> 오늘의 사진 운세 </title>");
		pw.println("</head>");
		pw.println("<body>");
				
		pw.print("<p> 오늘은 하늘오빠와 어떤 데이트를 할 수 있을까? </p>");
		pw.print("<img src="+ fortuneImg +">");
		pw.print("<p>"+ fortuneSentence +"</p>");
		
		pw.println("</body>");
		pw.println("</html>");
	}
}
