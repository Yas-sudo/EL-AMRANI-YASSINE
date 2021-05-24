package servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Dao_Etudiant;
import entitie.Etudiant;

@WebServlet("/Sinscrire")
public class Sinscrire extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Sinscrire() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String username = request.getParameter("Login");
	      String password = request.getParameter("Password");
	      String nom = request.getParameter("Nom");
	      String prenom = request.getParameter("Prenom");    
	      Etudiant etu=new Etudiant();
	      etu.setEmail(username);
	      etu.setNom(nom);
	      etu.setPassword(password);
	      etu.setPrenom(prenom);
	      Dao_Etudiant.AjouterEtudiant(etu);
	      response.sendRedirect("Se connecter");
	   	}
}
