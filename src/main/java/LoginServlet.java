import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String btn = request.getParameter("submit");
		RequestDispatcher rd = null;
		
		if("プレイ".equals(btn)) {
			
			try{
				
				rd = request.getRequestDispatcher("./play.jsp");
				
			}catch(Exception e) {
				
				request.setAttribute("error_msg", e.getMessage());
				
			}finally {
				
				rd.forward(request, response);
			}
			
		}
		else if("設定".equals(btn)) {
			
			try{
				
				rd = request.getRequestDispatcher("./settings.jsp");
				
			}catch(Exception e) {
				
				request.setAttribute("error_msg", e.getMessage());
				
			}finally {
				
				rd.forward(request, response);
			}
		}
		
	}

}
