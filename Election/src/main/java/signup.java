

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p1 = request.getParameter("pass1");
	 	String p2 = request.getParameter("pass2");
	 	String username = request.getParameter("username"); 
	 	
	 	if(!p1.contentEquals(p2)) {
            response.getWriter().println("it seems you have already forgotten your password ");
            response.getWriter().print("try to confirm with the same password");
	 	}
	 	else
	 	{
	 		response.getWriter().println("you are now a registered user");
	 		response.setContentType("text/html");
	 		response.getWriter().print("<a href=/index.html> go to main page </a>");
	 	}
	}

}
