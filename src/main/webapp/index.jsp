<%@page pageEncoding="UTF-8" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
  </head>
  <body>
  	<ol>
  		<li><a href="<c:url value="/date.jsp"/>">JSP de date</a></li>
  		<li><a href="<c:url value="/parametres.jsp?language=java&version=1.6&version=1.7&version=1.8&motto=&lt;strong>compile once, run anywhere&lt;/strong>"/>">JSP d'affichage des paramètres</a></li>
  		<li><a href="<c:url value="/adhesion"/>">Formulaire d'adhésion</a></li>
  		<li><a href="<c:url value="/list"/>">Liste des utilisateurs</a></li>
  	</ol>
  </body>
</html>

