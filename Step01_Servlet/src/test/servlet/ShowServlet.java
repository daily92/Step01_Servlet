package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/time/showtime")
public class ShowServlet extends HttpServlet {
   @Override
   protected void service(HttpServletRequest request,
         HttpServletResponse response) throws ServletException, IOException {
    //응답 인코딩 설정
   response.setCharacterEncoding("utf-8");
   //응답 컨텐츠 설정
   response.setContentType("text/html;charset=utf-8");
   // 클라이언트에게 문자열을 출력할 수 있는 객체 얻어오기
   PrintWriter pw = response.getWriter();//출력하면 클라이언트에게 보여줌
   pw.println("<doctype html>");
   pw.println("<html>");
   pw.println("<head>");
   pw.println("<meta charset='utf-8'/>");
   pw.println("<title></title>");
   pw.println("</head>");
   pw.println("<body>");
   //날짜 객체 생성
   Date date=new Date();
   pw.print("<p>"+date.toString()+"</p>");
   pw.println("</body>");
   pw.println("</html>");
   //window -> Preferences -> Templates 검색 -> Java/Editor/Templates ->
   //New... -> Name 축약어 적고, Description 적고 Pattern에 풀 텍스트 입력

   //Name을 html로 지정했으면 html(Ctrl+Space) 하면 Pattern 풀 텍스트 불러옴

   }
}