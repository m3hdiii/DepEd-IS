<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:url value="/public" var="resourceURL" scope="request"/>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">

<c:import url="../includes/head.jsp">
    <c:param name="title" value="Home Index Page"/>
    <c:param name="description" value="First and Enterance Page"/>
</c:import>
<body>
<h1>Index Page</h1>
<p>Welcome to DepEd Inventory System</p>
<c:import url="../includes/footer.jsp" />
</body>
</html>
