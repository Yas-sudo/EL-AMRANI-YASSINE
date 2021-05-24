
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase_Interaction {
	
	static Connection c=null;
	static Statement s = null;
	

	
	public DataBase_Interaction() {
		
	}
         
	
	public static void connect(){
      try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
         c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/DByas","root","");
         s=c.createStatement();
	  } 
      catch (ClassNotFoundException ex) {
    	  System.out.println("Error: unable to load driver class!");
	  } 
      catch (SQLException ex) {
    	  System.out.println("Error: Statement is null!"); 
      }  
	}
	        /*------------------méthode select-----------------*/
	
	public static ResultSet select(String sql) {
		ResultSet r =null;
		try {
			r = s.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	             /*-------------Mis A Jour-------------*/
	
	public static void misajour(String sql) {
	    try {
			s.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		    }
		
		
	}
	          /*----------------méthode de déconnexion----------------*/
	public static void disconnect() {
		try {
			if(c != null)
				c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(s != null)
				s.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}

