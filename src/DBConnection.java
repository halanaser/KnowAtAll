

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {

	static Connection con;
    static Statement st;
 
    public static void connect (){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/knowatall";
            System.out.println(url);

            con = DriverManager.getConnection(url, "root", "naser1967");
            System.out.println("successful connection");
            st = con.createStatement();
           } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main (String []args) throws SQLException{
    	connect ();
    	System.out.println(" connect to database");

}
	
}
