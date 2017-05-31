<%@page pageEncoding="UTF-8" contentType="text/html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
  </head>
  <body>
  
  	<table>
  		<tbody>
  			<c:forEach var="p" items="${paramValues}">
  				<tr>
  					<td><c:out value="${p.key}"/></td>
  					<td><c:out value="${fn:join(p.value, ', ')}"/></td>
  				</tr>
  			</c:forEach>
  		</tbody>
  	</table>
  
  	<p><a href="<c:url value="/index.jsp"/>">Retour à l'accueil</a></p>
  
  </body>
</html>