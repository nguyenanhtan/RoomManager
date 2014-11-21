<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:forEach items="${list}" var="lr"> 
 <p ><c:out value="${lr.name}"/></p>
</c:forEach> 