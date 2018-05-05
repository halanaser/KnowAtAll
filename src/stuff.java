

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class stuff
 */
@WebServlet("/stuff")
public class stuff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stuff() {
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
		String QuestionText=request.getParameter("questionText");
		String professorName=request.getParameter("selected");
		try {
            int professorFk = 0;

	    	  if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="SELECT idprofessor FROM knowatall.professor where professorName='"+ professorName +"'";
	             ResultSet r = DBConnection.st.executeQuery(sql);
	             if(r.next()) {
					professorFk = r.getInt("idprofessor");
	             }

	
		HttpSession session=request.getSession();
		String idprofile= (String) session.getAttribute("idprofile"); 
    	System.out.println(QuestionText);
    	DBConnection.connect();
    	DataBaseAcces.addQuestion(idprofile , QuestionText,professorFk );
    	
		doGet(request, response);
		String addr=	"professor.jsp";
 
    	
    	

    	response.sendRedirect(addr);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}
