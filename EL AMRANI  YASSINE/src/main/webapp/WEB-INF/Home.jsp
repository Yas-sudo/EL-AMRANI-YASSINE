<%@ page import="entitie.*,dao.*,servlet.*,java.util.*" import="javax.servlet.httpServlet" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
       <a class="navbar-brand" href="Se_connecter.jsp">Se connecter</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Sinscrire.jsp">S'inscrire</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="AjoutLivre.jsp">Ajouter un livre</a>
        </li>
          <li class="nav-item">
         <a class="nav-link disabled" href="ListerCategorieReserverLivre.jsp" tabindex="-1" aria-disabled="true">Lister les livres(par catégorie) pour réserver un</a>
        </li>
      </ul>
    </div>
  </div>
</nav>