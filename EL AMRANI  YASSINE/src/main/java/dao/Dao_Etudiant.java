
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entitie.Etudiant;

public class Dao_Etudiant {
	public Etudiant getEtudiant(int Id){
		Etudiant etu = null;
		 DataBase_Interaction.connect();
		ResultSet r =  DataBase_Interaction.select("select * from Etudiant where id="+Id);
	try {
			  if(r.next()) {
				etu = new Etudiant();
				etu.setId(r.getInt(1));
				etu.setNom(r.getString(2));
				etu.setPrenom(r.getString(3));
				etu.setEmail(r.getString(4));
			}
				} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		 DataBase_Interaction.disconnect();
		return etu;
	}
		            
	public List<Etudiant> getListEtudiant(){
		List<Etudiant> Liste =  new ArrayList<Etudiant>();
		 DataBase_Interaction.connect();
		ResultSet r =  DataBase_Interaction.select("select * from Etudiant");
		try {
			while(r.next()) {
				Etudiant etu  = new Etudiant();
				etu.setId(r.getInt(1));
				etu.setNom(r.getString(2));
				etu.setPrenom(r.getString(3));
				etu.setEmail(r.getString(4));
				etu.setPassword(r.getString(5));
				Liste.add(etu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		 DataBase_Interaction.disconnect();
		return Liste;
	}
	public static void AjouterEtudiant(Etudiant etuAj) {
		 DataBase_Interaction.connect();
		String sql="INSERT INTO `Etudiant` ( `Nom`, `Prenom`, `Email`, `Password`)" 
				+ "VALUES('"+etuAj.getNom()+"','"+etuAj.getPrenom()+"','"+etuAj.getEmail()+"','"+etuAj.getPassword()+"')";
		 DataBase_Interaction.misajour(sql);		
		 DataBase_Interaction.disconnect();
	}
	
	public void SupprimerEtudiant(int Id) {
		 DataBase_Interaction.connect();
		String sql=("delete from etudiant where id="+Id);
		
		 DataBase_Interaction.misajour(sql);	
		 DataBase_Interaction.disconnect();
	}
	public void ModifierEtudiant( Etudiant etuMo) {
		DataBase_Interaction.connect();
		String sql="UPDATE `Etudiant`"
				+ "SET  Nom = '"+etuMo.getNom()+"', Prenom ='"+etuMo.getNom()+"' , Email= '"+etuMo.getEmail()+"', Password='"+etuMo.getPassword()+"'"
				+ " WHERE Id ="+etuMo.getId();
		 DataBase_Interaction.misajour(sql);
		 DataBase_Interaction.disconnect();
	}
	
	public static Etudiant Authentification(String login,String password) {
		Etudiant etu = null;
		 DataBase_Interaction.connect();
		ResultSet r =  DataBase_Interaction.select("select * from Etudiant where Email= '"+login+"' and Password='"+password+"';");
		try {
			  if(r.next()) {
				etu = new Etudiant();
				etu.setId(r.getInt(1));
				etu.setNom(r.getString(2)); 
				etu.setPrenom(r.getString(3));
				etu.setEmail(r.getString(4));
			}
	 } catch (SQLException e) {
		e.printStackTrace();
		}
    	 DataBase_Interaction.disconnect();
		return etu;
	}	
}
