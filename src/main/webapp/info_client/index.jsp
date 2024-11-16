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
    <title>Inscrit avec succès</title>
</head>
<body>
<style>
    .en_vert{
        color: green;
    }
</style>
<%
    if(request.getAttribute("success")!=null){%>
        <div class="en_vert">
            <%= request.getAttribute("success")%>
        </div>

    <%}%>

<h1>Vous êtes:</h1>
<p>Nom:${client.nom}</p>
<p>Prenom:${client.prenom}</p>
<p>Téléphone:${client.telephone}</p>
<p>E-mail:${client.email}</p>


</body>
</html>
