package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.Dao_livre;
import entitie.Etudiant;

@WebServlet("/ListerCategorieReserverLivre ")
public class ListerCategorieReserverLivre extends HttpServlet {
	private static final long serialVersionUID = 1L;
        public ListerCategorieReserverLivre () {
        super();
    }
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int livreId = Integer.parseInt(request.getParameter("livreId"));
		HttpSession session = request.getSession();
		Etudiant etu = (Etudiant) session.getAttribute("Etud");
		if (etu != null) {
			Dao_livre.reservation(etu.getId(), livreId);
			response.sendRedirect("Acceuil.jsp");
		} else {
              response.sendRedirect("S_authentification");
		}
	}

}
