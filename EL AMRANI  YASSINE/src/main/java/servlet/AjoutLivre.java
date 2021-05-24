package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Dao_livre;
import entitie.Livre;
 

@WebServlet("/AjoutLivre")
public class AjoutLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AjoutLivre() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String Titre= request.getParameter("Titre");
	   String Auteur= request.getParameter("Auteur");
	   String Description= request.getParameter("Description");
	   
	    Livre li=new Livre();
	    li.setTitre(Titre);
	    li.setAuteur(Auteur);
	    li.setDescription(Description);
	    Dao_livre.AjouterLivre(li);
	    response.sendRedirect("AjouterLivre.jsp");
	}

}
