package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Dao_livre;
import entitie.Livre;
 

@WebServlet("/Ajouter_livre")
public class Ajouter_livre extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Ajouter_livre() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String Titre= request.getParameter("Titre");
	   String Auteur= request.getParameter("Auteur");
	   String Description= request.getParameter("Description");
	   
	    Livre nv=new Livre();
	    nv.setTitre(Titre);
	    nv.setAuteur(Auteur);
	    nv.setDescription(Description);
	    Dao_livre.AjouterLivre(nv);
	    response.sendRedirect("acceuil.jsp");
	}

}
