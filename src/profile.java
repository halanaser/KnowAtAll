

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class profile {
	String idLogin;
	String idProfile;
	String profilName;
	String imge;
	String stay;
	String specefication;
	String age;
	ArrayList<String> follower;
	ArrayList<String> following;
	ArrayList<String> Questioin;
	
	
	
	public ArrayList<String> getQuestioin() {
		return Questioin;
	}

	public void setQuestioin(ArrayList<String> questioin) {
		Questioin = questioin;
	}

	public  profile() {};
	
	public  profile (String idLogin ,String idProfile, String profilName ,String imge,String stay,
	String specefication,String age,ArrayList<String> follower,ArrayList<String> following, ArrayList<String> Questioin) {
		this.idLogin=idLogin;
		this.idProfile=idProfile;
		this.profilName=profilName;
		this.imge=imge;
		this. stay=stay;
		this.specefication=specefication;
		this. age=age;
		this. follower =follower;
		this.following=following;
		this.Questioin=Questioin;
	}


	public String getIdLogin() {
		return idLogin;
	}


	public void setIdLogin(String idLogin) {
		this.idLogin = idLogin;
	}


	public String getIdProfile() {
		return idProfile;
	}


	public void setIdProfile(String idProfile) {
		this.idProfile = idProfile;
	}


	public String getProfilName() {
		return profilName;
	}


	public void setProfilName(String profilName) {
		this.profilName = profilName;
	}


	public String getImge() {
		return imge;
	}


	public void setImge(String imge) {
		this.imge = imge;
	}


	public String getStay() {
		return stay;
	}


	public void setStay(String stay) {
		this.stay = stay;
	}


	public String getSpecefication() {
		return specefication;
	}


	public void setSpecefication(String specefication) {
		this.specefication = specefication;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public ArrayList<String> getFollower() {
		return follower;
	}


	public void setFollower(ArrayList<String> follower) {
		this.follower = follower;
	}


	public ArrayList<String> getFollowing() {
		return following;
	}


	public void setFollowing(ArrayList<String> following) {
		this.following = following;
	}
public profile setProfilenowInf(String idprofile) throws SQLException {
		
		profile profile =new profile();
		String profileName , stay, specifecatin, age,img;
		DBConnection.connect();
    	ResultSet ProfileInf=DataBaseAcces.getProfileinfWithID(idprofile);
    	while(ProfileInf.next()) {
    		 profileName=ProfileInf.getString(1);
    		 specifecatin=ProfileInf.getString(2);
    		  stay =ProfileInf.getString(3);
    		  img =ProfileInf.getString(4);
    		  age=ProfileInf.getString(5);
    	
    	
    	
    	
    	profile.setProfilName(profileName);
    	profile.setSpecefication(specifecatin);
    	profile.setStay(stay);
    	profile.setImge(img);
    	profile.setAge(age);
    	
    	 
    	 
    	 
    	
    	
    	
    	
    	}
//    	ArrayList<String> followerN=new ArrayList<String>();
//    	followerN=this.getfollwerprofile(idprofile);
//    	profile.setFollower(followerN);
//    	ArrayList<String> followingN=new ArrayList<String>();
//    	followingN=this.getfollwerprofile(idprofile);
//    	profile.setFollower(followingN);
//    	
    	
    	return profile;
	}
//	public ArrayList<String> getfollwerprofile(String idprofile) throws SQLException {
//		ArrayList<String> followerName=new ArrayList<String>();
//		DBConnection.connect();
//    	ResultSet followerNameD=DataBaseAcces.getFollowerName(idprofile);
//    	
//    	while(followerNameD.next()) {
//    		
//    		followerName.add("Integer.toString(followerNameD)");
//    		
//    	}
//		return followerName;
		
		
		
		
//		
//	}
//	public ArrayList<String> getfollwingprofile(String idprofile) throws SQLException {
//		ArrayList<String> followingName=new ArrayList<String>();
//		DBConnection.connect();
//    	ResultSet followingNameD=DataBaseAcces.getFollowingName(idprofile);
//    	
//    	while(followingNameD.next()) {
//    		
//    		followingName.add("Integer.toString(followingNameD)");
//    		
//    	}
//		return followingName;
//		
//		
//		
//		
//		
//	}
//	
//	
//	
	
	
	
	
	
	

}
