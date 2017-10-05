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
        <h3>&nbsp;&nbsp;Information&nbsp;<small>&nbsp;for Semi Expandable</small>
        </h3>
    </div>
    <div class="row">
        <p>Name: ${semiExpandableInfo.name}</p>
    </div>
    <div class="row">
        <p>Description: ${semiExpandableInfo.description}</p>
    </div>
    <div class="row">
        <p>Item Type: ${semiExpandableInfo.itemType}</p>
    </div>
    <div class="row">
        <p>Threshold: ${semiExpandableInfo.threshold}</p>
    </div>

    <div class="row">
        <p>Quantity: ${semiExpandableInfo.quantity}</p>
    </div>
    <div>
        <a href="/semi-expandable/update/${semiExpandableId}">update this item</a>
    </div>


</section>
<c:import url="../../includes/footer.jsp"/>

</body>
</html>