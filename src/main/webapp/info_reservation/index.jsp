<%--
  Created by IntelliJ IDEA.
  User: CYTech Student
  Date: 11/16/2024
  Time: 5:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Informations de réservation</title>
</head>
<body>
<h1>Informations de réservation</h1>
<p1>Nom:${reservation.nom}</p1>
<p>Prenom:${reservation.prenom}</p>
<p>Téléphone:${reservation.telephone}</p>
<p>E-mail:${reservation.email}</p>
<p>Type d'appartement:${reservation.typeAppart}</p>
<p>Prix:${reservation.prix}</p>
<p>Option:${reservation.option}</p>

</body>
</html>
