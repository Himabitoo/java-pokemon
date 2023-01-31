

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PlayerServlet")
public class PlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PlayerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String submit = request.getParameter("submit");
		
		PlayerActions Player = new PlayerActions();
		
		if("acctionAttack".equals(submit)) {
			
			Player.Attack_To_Enemy();
			
		}
		else if("actionDefense".equals(submit)) {
			
			Player.Defense_To_Enemy();
			
		}
		else if("actionHeal".equals(submit)) {
			
			Player.Heal_Your_Self();
			
		}
		else if("actionRunAway".equals(submit)) {
			
			Player.Run_Away();
			
		}
		
	}

}
