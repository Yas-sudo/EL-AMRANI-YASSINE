<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="entitie.*,dao.*,servlet.*,java.util.*" import="javax.servlet.httpServlet" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>S'inscrire</title>
</head>
<body>    
<div class="row m-2 p-2 d-flex justify-content-center">
	<%@ include file="Home.jsp" %>
	<div class="m-4 p-5 col-6">
		<div class="mb-5 display-6">S'inscrire</div>
	    <form action="inscription" method="post" class="row g-3">
		  <div class="col-md-6">
		    <label for="inputEmail4" class="form-label">Nom d'utilisateur</label>
		    <input type="text" name="username" class="form-control" id="inputEmail4">
		  </div>
		  <div class="col-md-6">
		    <label for="inputPassword4" class="form-label">Mot de passe</label>
		    <input type="password" name="pass" class="form-control" id="inputPassword4">
		  </div>
		  <div class="col-12">
		    <label for="inputAddress" class="form-label">Nom </label>
		    <input type="text" name="nom" class="form-control" id="inputAddress" placeholder="1234 Main St">
		  </div>
		  <div class="col-12">
		    <label for="inputAddress2" class="form-label">Prénom </label>
		    <input type="text" name="prenom" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
		  </div>
		  <div class="col-12">
		    <button type="submit" class="btn btn-primary">S'inscrire</button>
		  </div>
		</form>
	</div>
</div>
</body>
</html>