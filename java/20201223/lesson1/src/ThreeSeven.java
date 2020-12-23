
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ThreeSeven")
public class ThreeSeven extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random rand=new Random();
		int num=0;
		int count=0;
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>777_GAME</title>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("</head>");
		out.println("<body>");
		do {
			count=count+1;
			num=rand.nextInt(900)+100;
			out.print("<p>");
			out.print(num);
			out.println("</p>");
		}while(num!=777);
		out.print("<p>");
		out.print(count+"回目に出ました");
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
	}
}
