package entitie;

public class Etudiant {
	
		int Id;
		String Nom;
		String Prenom;
		String Email;
		String Password;

		public Etudiant() {
				}     

			public String getPassword() {
				return Password;
			}
	
			public void setPassword(String Password) {
				this.Password = Password;
			}

		
			public int getId() {
				return Id;
			}
		
			public void setId(int Id) {
				this.Id = Id;
			}
		
			public String getNom() {
				return Nom;
			}
		
			public void setNom(String Nom) {
				this.Nom = Nom;
			}
		

				@Override
				public String toString() {
					return "Etudiants [Id=" + Id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Email=" + Email
							+ ", Password=" + Password + "]";
				}


			public String getPrenom() {
				return Prenom;
			}
		
			public void setPrenom(String Prenom) {
				this.Prenom = Prenom;
			}
		
			public String getEmail() {
				return Email;
			}
		
			public void setEmail(String Email) {
				this.Email = Email;
			}

	

}
