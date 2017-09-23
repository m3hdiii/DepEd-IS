<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 20/09/2017
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:url value="/public" var="resourceURL" scope="request"/>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">

<c:import url="../includes/head.jsp">
    <c:param name="title" value="Login"/>
    <c:param name="description" value="Login page for personnel"/>
</c:import>
<body>


<p>lelasjdakjdhaskjdhkajsd</p>

<c:import url="../includes/footer.jsp" />
<script src="${resourceURL}/js/additional/login.js" type="text/javascript"></script>
</body>
</html>