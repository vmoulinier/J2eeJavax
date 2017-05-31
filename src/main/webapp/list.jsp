<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <title>Liste des membres</title>
    <link type="text/css" rel="stylesheet" href="style.css" />
</head>
<body>
<fieldset>
    <table>
        <tr>
            <th>Email</th>
            <th>Date d'inscription</th>
        </tr>
        <c:forEach var="user"  items="${users}" >
            <tr>
                <td><c:out value="${user.email}" /></td>
                <td><c:out value="${user.dateAdhesion}" /> </td>
            </tr>
        </c:forEach>

        <tr>
        </tr>
    </table>
    <br />
    <a href='index.jsp'><button type="button">Retour</button></a>
    <br />
</fieldset>

</body>
</html>