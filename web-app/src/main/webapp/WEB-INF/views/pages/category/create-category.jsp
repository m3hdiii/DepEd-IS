<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>

<c:url value="/public" var="resourceURL" scope="request"/>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

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

    <div class="page-header">
        <h3> Create Category </h3>
    </div>

    <c:choose>
        <c:when test="${not empty notCreated}">
            <p style="color: red;">${notCreated}</p>
        </c:when>


        <c:when test="${not empty successfullyCreated}">
            <p style="color: green;">${successfullyCreated}</p>
            &nbsp;&nbsp;<a href="/category/create">Create New Category</a>
        </c:when>

    </c:choose>
    <form:form commandName="category" method="post">
        <p><span>name: </span><form:input path="name"/></p>
        <p><span>description: </span><form:textarea path="description"/></p>
        <button type="submit">Create Brand</button>
    </form:form>



</section>
<c:import url="../../includes/footer.jsp"/>

</body>
</html>