<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 27/09/2017
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:url value="/public" var="resourceURL" scope="request"/>
<c:url value="/" var="routePath" scope="request"/>
<c:import url="../includes/head.jsp">
    <c:param name="title" value="All Item Types"/>
    <c:param name="description" value="List of all Item Types" />
</c:import>
<html>
<body>
<c:import url="../includes/left-nav.jsp" />
<section class="content">
    <c:import url="../includes/top-nav.jsp" />
    <div class="container">
        <p>insert unfiltered item list</p>
    </div>

    <c:import url="../includes/footer.jsp" />
</section>

</body>
</html>
