
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




public class DataBaseAcces {
	 public  static  int validation(String StudentID,String Password){
         int loginid=-1;
	      
	       try {
	       if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="SELECT id from knowatall.login WHERE studentNumber = '"+ StudentID +"' and password = '"+ Password+"'";
	            System.out.println(sql);
                ResultSet   r= DBConnection.st.executeQuery(sql);
	                //String idlog =r.getString(0);
                if(r.next()) {
                	  loginid= r.getInt("id") ;
	           	       return loginid;}
	                else return loginid;
	        } catch (SQLException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	        }
	       return loginid;
	        
	    }
	 public  static int  getProfileIDFromIDLogin(String idlogin){
		int idprof=-1;
	      
	       try {
	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="SELECT idprofile  from knowatall.profile WHERE loginFk = '"+ idlogin +"'";
	                ResultSet   r= DBConnection.st.executeQuery(sql);
	                
//	                String idprofile =r.getString("idprofile");
//	                return idprofile;
	                if(r.next()) {
	                	idprof= r.getInt("idprofile") ;
		           	       return idprof;}
		                else return idprof;
	        } catch (SQLException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return idprof;

	    } 
	 public  static ResultSet  getProfileinfWithID(String profileId){
		    
	      
	       try {
	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="SELECT profileName,spesification, stay,img,age from knowatall.profile WHERE idprofile = '"+ profileId +"'";
	                ResultSet   r= DBConnection.st.executeQuery(sql);
	                if(r.next()) {
	                //System.out.println(sql);
	                //System.out.println(r.getString("profileName"));
	                return r;}
	                
	        } catch (SQLException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return null;

	    } 
	 
	 public  static ResultSet  getProfileinfWithName(String ProfileName){
		    
	      
	       try {
	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="SELECT idprofile ,spesification, stay,img,age from knowatall.profile WHERE profileName = '"+ ProfileName +"'";
	                ResultSet   r= DBConnection.st.executeQuery(sql);
	                
	                if(r.next()) {
	                return r;}
	        } catch (SQLException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return null;

	    } 
	 public  static ResultSet  getFollowerName(String idProfile){
		    
	      
	       try {
	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="SELECT followerNameFk from knowatall.follower WHERE profileFK = '"+ idProfile +"'";
	                ResultSet   r= DBConnection.st.executeQuery(sql);
	                
	                if(r.next()) {
	                return r;}
	        } catch (SQLException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return null;

	    } 
	 public  static ResultSet  getFollowingName(String idProfile){
		    
	      
	       try {
	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="SELECT followingName from knowatall.follower WHERE profileFK = '"+ idProfile +"'";
	                ResultSet   r= DBConnection.st.executeQuery(sql);
	                
	                if(r.next()) {  
	                return r;}
	        } catch (SQLException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return null;

	    }
	 public  static void addfollowing(String followingName,String idProfile){
	      int r=0;
	      
	       try {
	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="insert into knowatall.login (followingNameFk,idProfileFk) values ('followingName', 'idProfile')";
	                  
	            r= DBConnection.st.executeUpdate(sql);
	                
	                

	        } catch (SQLException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	        }
	       
	    } 
	 
	 public  static void addfollower(String followerName,String idProfile){
	      int r=0;
	      
	       try {
	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="insert into knowatall.follower (followerNameFk),profileFK) values ('followerName', 'idProfile')";
	                  
	            r= DBConnection.st.executeUpdate(sql);
	                
	                

	        } catch (SQLException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	        }
	       
	    }
	 public  static void addlike(String QuestionId){
	      int r=0;
	      int like=0;
	       try {
	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="insert into knowatall.liked (like,idQuestionFk) values ('like', 'QuestionId')";
	                  
	            r= DBConnection.st.executeUpdate(sql);
	                
	                

	        } catch (SQLException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	        }
	       
	    } 
	 
	 public  static void addDislike(String QuestionId){
	      int r=0;
	      int dislike=1;
	       try {
	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	            String sql ="insert into knowatall.disliked (dislike,idQuestionFk) values ('dislike', 'QuestionId')";
	                  
	            r= DBConnection.st.executeUpdate(sql);
	                
	                

	        } catch (SQLException ex) {
	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);}
	        }
	       
	       public  static void selectType(String QuestionId,int type){
	 	      int r=0;
	 	    
	 	       try {
	 	            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	 	            if(type==0) {
	 	            String sql ="update knowatall.question set typeFk='0' where idQuestion = '"+ QuestionId+"'";
	 	            r= DBConnection.st.executeUpdate(sql);}
	 	            else if(type==0) {
		 	            String sql ="update knowatall.question set typeFk='0' where idQuestion = '"+ QuestionId+"'";
		 	            r= DBConnection.st.executeUpdate(sql);   
	 	                
	 	            }
	 	        } catch (SQLException ex) {
	 	            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);}
	 	        }
	 	       
	 	      public  static int gestType(String QuestionId){
		 	     
		 	    
		 	       try {
		 	    	  if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
			            String sql ="SELECT typeFk from knowatall.question  WHERE idQuestion = '"+ QuestionId +"'";
			                ResultSet   r= DBConnection.st.executeQuery(sql);
			                int type=r.getInt("typeFk");
			                
			                return type;
			        } catch (SQLException ex) {
			            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
			        }
		 	      return -1;
		 	      
		 	      
	 	       
	       
	    }  
	 		 public  static void addQuestion(String idprofile ,String QuestionText ,int qutype){
	 		      int r=0;
	 		      
	 		       try {
	 		            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	 		            String sql ="insert into knowatall.question (idprofileFk,Questiontext) values ('"+idprofile+"', '"+QuestionText+"')";
	 		                  
	 		            r= DBConnection.st.executeUpdate(sql);
	 		                
	 		                

	 		        } catch (SQLException ex) {
	 		            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	 		        }
	 		 }
	 	 	      public  static ResultSet getQuestion(String idprofile){
	 		 	     
	 		 	    
	 		 	       try {
	 		 	    	  if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
	 			            String sql ="SELECT Questiontext from knowatall.question  WHERE idprofileFk= '"+ idprofile +"'";
	 			                ResultSet   r= DBConnection.st.executeQuery(sql);
	 			                
	 			                
	 			                return r;
	 			        } catch (SQLException ex) {
	 			            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	 			        }
	 		 	      return null;
	 	 	      }
	 			 public  static void addRatting(String QuestionFk ,String QuestionText ){
		 		      int r=0;
		 		      
		 		       try {
		 		            if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
		 		            String sql ="insert into knowatall.ratting (QuestionFk,reviwer) values ('QuestionFk', 'reviwer')";
		 		                  
		 		            r= DBConnection.st.executeUpdate(sql);
		 		                
		 		                

		 		        } catch (SQLException ex) {
		 		            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);}
		 		        }
		 		       
		 	 	      public  static ResultSet gestRatting(String QuestionFk){
		 		 	     
		 		 	    
		 		 	       try {
		 		 	    	  if (DBConnection.con== null || DBConnection.con.isClosed()) DBConnection.connect();
		 			            String sql ="SELECT reviwer from knowatall.ratting  WHERE QuestionFk= '"+ QuestionFk +"'";
		 			                ResultSet   r= DBConnection.st.executeQuery(sql);
		 			                
		 			                
		 			                return r;
		 			        } catch (SQLException ex) {
		 			            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
		 			        }
		 		 	      return null;
		 	 	      }
	 	 	      
	 	 	      
	 	 	      
	 	 	      
	 		 	      
	 		 	      
	 	 	       
	 	       
	 	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


