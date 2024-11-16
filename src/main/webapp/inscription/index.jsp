<%--
  Created by IntelliJ IDEA.
  User: CYTech Student
  Date: 11/15/2024
  Time: 6:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Inscription</title>
</head>
<body>
<style>
    .en_rouge{
        color: red;
    }
</style>
<%
        if (request.getAttribute("erreur") != null) {%>
            <div class="en_rouge">
                <%= request.getAttribute("erreur") %>
            </div>
       <% }%>

    <form action="${pageContext.request.contextPath}/creer-client" method="post">
        <label for="nom">Nom:</label>
        <input type="text" required name="nom" id="nom"><br><br>
        <label for="prenom">Prénom</label>
        <input id="prenom" type="text" name="prenom" required><br><br>
        <label for="tel">Téléphone:</label>
        <input id="tel" type="tel" name="tel" required><br><br>
        <label for="email">Email:</label>
        <input id="email" type="email" name="email" required><br><br>
        <button type="submit">Envoyer</button>
    </form>

</body>
</html>
