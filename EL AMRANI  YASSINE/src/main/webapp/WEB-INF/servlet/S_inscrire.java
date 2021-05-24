package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Dao_Etudiant;
import entitie.Etudiant;

@WebServlet("/S_inscrire")
public class S_inscrire extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public S_inscrire() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String username = request.getParameter("username");
	      String pass = request.getParameter("pass");
	      String nom = request.getParameter("nom");
	      String prenom = request.getParameter("prenom");    
	      Etudiant etu=new Etudiant();
	      etu.setEmail(username);
	      etu.setNom(nom);
	      etu.setPassword(pass);
	      etu.setPrenom(prenom);
	      Dao_Etudiant.AjouterEtudiant(etu);
	      response.sendRedirect("Authentification");
	     
	}

}
