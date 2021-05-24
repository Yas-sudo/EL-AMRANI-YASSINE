package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entitie.Categorie;

public class DaoCategorie {
	 public static List<Categorie> ListeCategorie(){
	    	List<Categorie> cat = new ArrayList<Categorie>() ;
	    	DataBase_Interaction.connect();
	    	ResultSet r=DataBase_Interaction.select("select * from Categorie");
	    	 try {
	    		 while(r.next()) {
	    			       Categorie n=new Categorie();
	    		            n.setId(r.getInt(1));
	    		            n.setNom(r.getString(2));	    		            
				           cat.add(n);
	    		 } 
			} catch (Exception e) {
			}
			return cat;
	    	
	    }
}

