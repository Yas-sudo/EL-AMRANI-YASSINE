package dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entitie.Livre; 

public class Dao_livre {
   
	  public Livre getlivres(int Id) {
		    Livre li=new Livre();
		    DataBase_Interaction.connect();
		    ResultSet res =  DataBase_Interaction.select("select * from oeuvrages where id= "+Id);
		     try {
		    	 if (res.next()) {
		    		 li.setId(res.getInt(1));
		    		 li.setAuteur(res.getString(2));
		    		 li.setTitre(res.getString(3));
		    		 li.setDescription(res.getString(4));	    		 
		    	 }	
			} catch (Exception e) {
			}
		     DataBase_Interaction.disconnect();
		        return li;
	  }
	  public List<Livre> getlivresBycategorie(int Id){
		  List<Livre> li = new ArrayList<Livre>() ;
		  DataBase_Interaction.connect();
	    	ResultSet res= DataBase_Interaction.select("select * from oeuvrages where id_categorie="+Id);
	    	 try {
	    		 while(res.next()) {
	    			        Livre l=new Livre();
	    		            l.setId(res.getInt(1));
	    		            l.setAuteur(res.getString(2));
	    		            l.setTitre(res.getString(3));
	    		            l.setDescription(res.getString(4));
	    		 
				        li.add(l);
	    		 }
			} catch (Exception e) {
			}
			return li;
	  }
	  
	  
	    public List<Livre> Listelivres(){
	    	List<Livre> li = new ArrayList<Livre>() ;
	    	 DataBase_Interaction.connect();
	    	ResultSet res= DataBase_Interaction.select("select * from oeuvrages");
	    	 try {
	    		 while(res.next()) {
	    			        Livre l=new Livre();
	    		            l.setId(res.getInt(1));
	    		            l.setAuteur(res.getString(2));
	    		            l.setTitre(res.getString(3));
	    		            l.setDescription(res.getString(4));
	    		 
				        li.add(l);
	    		 }
			} catch (Exception e) {
				// TODO: handle exception
			}
			return li;
	    	
	    }
	    public static void AjouterLivre(Livre r) {
	    	
	    	 DataBase_Interaction.connect();
	    	String sql="INSERT INTO `ouvrage` (`Auteur`, `Aitre`, `Description`, `IdOfCategorie`)"
	    			+ " VALUES ('"+r.getAuteur()+"','"+r.getTitre()+"','"+r.getDescription()+"', 3 )";
	    	 DataBase_Interaction.misajour(sql);
	    	 DataBase_Interaction.disconnect();
	    }
	    public void SupprimerLivres(int Id) {
	    	 DataBase_Interaction.connect();
	    	String sql=("delete from oeuvrages where id="+Id);
	    	 DataBase_Interaction.misajour(sql);
	    	 DataBase_Interaction.disconnect();
	    	
	    }
	    
	    public static void reservation(int Id, int Id_livre) {
	    	 DataBase_Interaction.connect();
	    	String sql="INSERT INTO `reservation` (`id_etudiant`, `id_livre`)"
	    			+ " VALUES ("+Id+","+Id_livre+")";
	    	 DataBase_Interaction.misajour(sql);
	    	 DataBase_Interaction.disconnect();
	    }
	    
	    public void ModifierLivre( Livre r) {
	    	 DataBase_Interaction.connect();
			String sql="UPDATE `ouvrage`"
					+ "SET  Auteur = '"+r.getAuteur()+"', Titre ='"+r.getTitre()+"' , Description = '"+r.getDescription()+"'"
					+ " WHERE Id ="+r.getId();
			 DataBase_Interaction.misajour(sql);
			 DataBase_Interaction.disconnect();
		}
	    
	    
	
}
