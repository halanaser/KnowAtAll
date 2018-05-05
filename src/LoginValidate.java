

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidate() {
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
		// TODO Auto-generated method stub
		String StudentNo=request.getParameter("student_id");
    	String passowrd=request.getParameter("password");
    	System.out.println(StudentNo);
    	DBConnection.connect();
    	int idLogin=DataBaseAcces.validation(StudentNo,passowrd);
    	HttpSession session=request.getSession();
    	String address;

    	if(idLogin!=-1) {
   		session.setAttribute("idlogin",Integer.toString(idLogin) );
  		int idProfile=DataBaseAcces.getProfileIDFromIDLogin(Integer.toString(idLogin));
  		String profileName , stay, specifecatin, age,img;
		
/////////////////////////////////////////////////////////////////////////////////////////
  		ArrayList<String> arlist =new ArrayList();
  		ResultSet qustext=DataBaseAcces.getQuestion(Integer.toString(idProfile));
  		
        try {
			while(qustext.next()) {
	  	//		  session.setAttribute("qyestext",qustext.getString("Questiontext"));  
	  			arlist.add(qustext.getString("Questiontext"));
				System.out.println(arlist);
			}
			  session.setAttribute("arlist",arlist);  

			request.setAttribute("arlist", arlist);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
///////////////////////////////////////////////////////////////////////////////////////////
  		
  		
    	//ResultSet ProfileInf=DataBaseAcces.getProfileinfWithID(Integer.toString(idProfile));
		  System.out.println("ff"); 
		  ////////////////////////////////////////////////////////////////
		  try {
	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="SELECT profileName,spesification, stay,img,age from knowatall.profile WHERE idprofile = '"+ Integer.toString(idProfile) +"'";
	                ResultSet   r= DBConnection.st.executeQuery(sql);
	                if(r.next()) {
	                //System.out.println(sql);
		  			  session.setAttribute("idprofile",Integer.toString(idProfile));  
	  				  session.setAttribute("profileName",r.getString("profileName"));  

	                System.out.println(r.getString("profileName"));
	                
	                }
	                
	        } catch (SQLException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	        }
		  
    	//try {
			//while(ProfileInf.next()) {
				// profileName=ProfileInf.getString("profileName");
				
				  //System.out.println(profileName); 
				  
				  //session.setAttribute("profileName","mm" );  
		//	}
//			}  session.setAttribute("profileName",profileName ); 

//   	session.setAttribute("username","hala" );
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		  ArrayList<String> allFollowerName =new ArrayList();
		   try {
	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="SELECT followerNameFk from knowatall.follower WHERE profileFK = '"+ idProfile +"'";
	                ResultSet   followerName= DBConnection.st.executeQuery(sql);
	                
	               
	       
	       
	   
	  		
	  	  
				while(followerName.next()) {
		  	//		  session.setAttribute("qyestext",qustext.getString("Questiontext"));  
					allFollowerName.add(followerName.getString("followerName"));
					System.out.println(followerName);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   session.setAttribute("followerName",allFollowerName);  

			request.setAttribute("followerName", allFollowerName);
	  		
	  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
			  ArrayList<String> allFollowerid =new ArrayList();

	  for(int i=0;i<allFollowerName.size();i++) {
			  allFollowerName.get(i);
	 	       try {
	 	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	 	            String sql ="SELECT idprofile  from knowatall.profile WHERE profileName = '"+ allFollowerName.get(i) +"'";
	 	                ResultSet   r= DBConnection.st.executeQuery(sql);
	 	                
//	 	                String idprofile =r.getString("idprofile");
//	 	                return idprofile;
	 	                if(r.next()) {
	 	               	allFollowerid.add(r.getString("idprofile")) ;
	 		           	     }
	 		              
	 	        } catch (SQLException ex) {
	 	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	 	        }
	 	      

	 	    } 
	  session.setAttribute("allFollowerid",allFollowerid);  

		request.setAttribute("allFollowerid", allFollowerid);
	  		
	  		
	  		
	  		
	  		
	  		
	  		
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		  ArrayList<String> allFollowerImage =new ArrayList();

	  for(int i=0;i<allFollowerid.size();i++) {
		  allFollowerid.get(i);
	 	       try {
	 	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	 	            String sql ="SELECT img  from knowatall.profile WHERE idprofile = '"+ allFollowerid.get(i) +"'";
	 	                ResultSet   r= DBConnection.st.executeQuery(sql);
	 	                
//	 	                String idprofile =r.getString("idprofile");
//	 	                return idprofile;
	 	                if(r.next()) {
	 	                	allFollowerImage.add(r.getString("img")) ;
	 		           	     }
	 		              
	 	        } catch (SQLException ex) {
	 	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	 	        }
	 	      

	 	    } 
	  session.setAttribute("allFollowerImage",allFollowerImage);  

		request.setAttribute("allFollowerImage", allFollowerImage);
	  		
	  			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
   		address="main.jsp";
    		
        }else address="login.jsp";
    	
    	

    	response.sendRedirect(address);
    	
    	// RequestDispatcher dispatcher=request.getRequestDispatcher(address);
 		//dispatcher.forward(request, response);
		doGet(request, response);
	}

}
