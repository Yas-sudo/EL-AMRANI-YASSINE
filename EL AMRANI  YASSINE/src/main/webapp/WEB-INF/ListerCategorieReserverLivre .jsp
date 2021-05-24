<%@ 
page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ page import="entitie.*,dao.*,servlet.*,java.util.*" import="javax.servlet.httpServlet" %>

<!DOCTYPE html>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Lister les livres d'une catégorie et réserver un livre </title>
</head>
<body class="bg-Light">
<div class="row m-2 p-2 d-flex justify-content-center">
<%@ include file="Home.jsp" %>
	 <%
	 Dao_livre dao = new Dao_livre();
	 	 		List<Livre> boc = dao.Listelivres();
	 	 		String id = "tous";
	 	 		if(request.getParameter("Id") != null && !request.getParameter("Id").equals("tous")){
	 	 	id = request.getParameter("Id");
	 	 	boc = dao.getlivresBycategorie(Integer.parseInt(id));
	 	 		}
	 	 		
	 	 		if(request.getParameter("Auteur") != null && !request.getParameter("Auteur").equals("")){
	 	 	String auteur = request.getParameter("Auteur");
	 	 	List<Livre> newlist = new ArrayList<Livre>();
	 	 	for(Livre lv : boc){
	 	 		if(lv.getAuteur().equalsIgnoreCase(auteur)){
	 	 			newlist.add(lv);
	 	 		}
	 	 	}
	 	 	boc = newlist;
	 	 		}
	 	 		List<Categorie> liste = DaoCategorie.ListeCategorie();
	 %>
	<div class="row mx-5 py-5 cl-4">

    <form action="" method="post" target="_self">
      <div class="input-group ">
       <label class="input-group-text" for="inputGroupSelect01">Cherchez Par Categorie</label>
		<select class="form-select"  onchange="this.form.submit()" name="Id" aria-label="select example" id="inputGroupSelect01">
		<option value="tous" <%=id.equals("tous")?"selected":"" %>> tous </option>
		</div>
		<%
			for(Categorie cat : liste){
		%>
		  <option value="<%=cat.getId() %>" <%=id.equals(String.valueOf(cat.getId()))?"selected":"" %>><%=cat.getNom() %></option>
		<%} 
		%>
		</select> 
		
		
		
		
		 <div class="input-group  mx-5">
		<label class="input-group-text" >Cherchez Par nom de l'uteur </label>
        <input class="form-control me-2" type="text" placeholder="Search" name="Auteur"">
        <button class="btn btn-outline-success" type="submit">Search</button>
		</div>
	     </div>
	 </form>
   
    <div class="my-5"  >
                 <table class="table caption-top "> 
  <caption class="container text-center"><h1>La Liste des livres</h1></caption>
  <thead>
    <tr class="bg-dark text-white">
      <th scope="col">Id</th>
      <th scope="col">Auteur</th>
      <th scope="col">Titre</th>
      <th scope="col">Description</th>     
      <th scope="col">Reservation</th>
    </tr>
  </thead>
  
  <tbody>
  	<%
		for(int i=0;i<boc.size();i++){
	%>
    <tr>
      <th scope="row"><%= i+1%></th>
      <td><%=boc.get(i).getAuteur() %></td>
      <td><%=boc.get(i).getTitre() %></td>
      <td><%=boc.get(i).getDescription() %></td>
       <td>
       <form method="post" action="Lister_ResesverLivre">
	       <button type="submit" class="btn btn-primary">Reserver</button>
	       <input value="<%=boc.get(i).getId()%>" name="livreId" hidden>
       </form></td>
    </tr>
    <%
		}
	%>
    
  </tbody>
                </table>
             </div>
</div>
</body>
</html>