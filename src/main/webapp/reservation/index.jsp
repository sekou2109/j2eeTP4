<%--
  Created by IntelliJ IDEA.
  User: CYTech Student
  Date: 11/15/2024
  Time: 6:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Réservation</title>
</head>
<body>
<style>
    .en_rouge{
        color:red;
    }
</style>

<% if(request.getAttribute("erreur")!=null){%>
    <div class="en_rouge">
        <%= request.getAttribute("erreur") %>
    </div>

<%}%>

<h1>Vos informations personelles</h1>
    <form action="${pageContext.request.contextPath}/creer-reservation" method="post">
        <label for="nom">Nom:</label>
        <input id="nom" name="nom" type="text" required><br><br>
        <label for="prenom">Prenom:</label>
        <input id="prenom" type="text" name="prenom"><br><br>
        <label for="tel">Téléphone:</label>
        <input id="tel" name="tel" type="tel" required><br><br>
        <label for="email">Email:</label>
        <input id="email" name="email" type="email" required><br><br>
<h1>Informations liées à la réservation</h1>
        <label for="type">Type d'appartement:</label>
        <input id="type" name="type" type="text" required><br><br>
        <label for="prix">Prix:</label>
        <input id="prix" name="prix" type="number" required>
        <label for="option">Option:</label>
        <select id="option" name="option" required>
            <option value="">Choisissez une option</option>
            <option value="mer">Proche de la mer</option>
            <option value="piscine">Piscine</option>
            <option value="jardin">Jardin</option>
        </select>
        <br><br>
        <button type="submit">Envoyer</button>
    </form>

</body>
</html>
