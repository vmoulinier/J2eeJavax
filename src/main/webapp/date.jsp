<%@page pageEncoding="UTF-8" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
  </head>
  <body>
    <jsp:useBean id="now" scope="page" class="java.util.Date"/>
    <fmt:formatDate value="${now}" type="both" />

	<p><a href="<c:url value="/index.jsp"/>">Retour à l'accueil</a></p>
  </body>
</html>
