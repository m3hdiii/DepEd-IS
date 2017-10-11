<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<c:url value="/public" var="resourceURL" scope="request"/>
<!DOCTYPE html>
<html lang="en">

<c:url value="/" var="routePath" scope="request"/>
<c:import url="../../includes/head.jsp">
    <c:param name="title" value="EDIT LATER"/>
    <c:param name="description" value="EDIT LATER PAGE"/>
</c:import>

<body>

<c:import url="../../includes/left-nav.jsp"/>

<section class="content">

    <c:import url="../../includes/top-nav.jsp"/>

    <c:choose>
        <c:when test="${not empty notCreated}">
            <p style="color: red;">${notCreated}</p>
        </c:when>


        <c:when test="${not empty successfullyCreated}">
            <p style="color: green;">${successfullyCreated}</p>
            &nbsp;&nbsp;<a href="/brand/create">Create New Brand</a>
        </c:when>

    </c:choose>
    <form:form commandName="brand" method="post">
        <p><span>name: </span><form:input path="name"/></p>
        <p><span>description: </span><form:textarea path="description"/></p>
        <p><span>contact number: </span><form:input path="contactNumber"/></p>
        <p><span>contact number2: </span><form:input path="contactNumber2"/></p>
        <p><span>central office address: </span><form:input path="centralOfficeAddress"/></p>
        <p><span>service center address: </span><form:input path="serviceCenterAddress"/></p>
        <button type="submit">Create Brand</button>
    </form:form>

    <c:import url="../../modals/cart.jsp"/>
</section>
<section class="content">
    <c:import url="../../includes/footer.jsp"/>
</section>
</body>
</html>