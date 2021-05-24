<%@ page import="entitie.*,dao.*,servlet.*,java.util.*" import="javax.servlet.httpServlet" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>   
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" type="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>  Ajout d'un livre</title>
</head>
<body>
     <form method="post" action="Ajouter"  >
		
		<div class="input-group mb-3 ">
		
		  <span class="input-group-text" id="inputGroup-sizing-default">Titre</span>
		  <input type="text" class="form-control" name="titre" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
		</div>
		<div class="input-group mb-3">
		  <span class="input-group-text" id="inputGroup-sizing-default">Auteur</span>
		  <input type="text" class="form-control" name="auteur" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
		</div>     
		<div class="input-group mb-3">
		  <span class="input-group-text" id="inputGroup-sizing-default">Description</span>
		  <input type="text" class="form-control" name="description" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
		</div>
		<button type="submit" class="btn btn-primary">Ajouter</button>
		</form>
 
</body>
</html>