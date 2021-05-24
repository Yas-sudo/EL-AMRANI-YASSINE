package entitie;

public class Livre {
	
		int Id;
		String Titre;
		String Auteur;
	    String Description; 
	    public Livre() {
		}

			public int getId() {
				return Id;
			}
			public void setId(int Id) {
				this.Id = Id;
			}
			public String getTitre() {
				return Titre;
			}
			public void setTitre(String Titre) {
				this.Titre = Titre;
			}
			public String getAuteur() {
				return Auteur;
			}
			public String setAuteur(String Auteur) {
				return this.Auteur = Auteur;
			}
			public String getDescription() {
				return Description;
			}
			public void setDescription(String Description) {
				this.Description = Description;
			}

			@Override
			public String toString() {
				return "livres [id=" + Id + ", titre=" + Titre + ", auteur=" + Auteur + ", description=" + Description
						+ "]";
			}

			
	

}
