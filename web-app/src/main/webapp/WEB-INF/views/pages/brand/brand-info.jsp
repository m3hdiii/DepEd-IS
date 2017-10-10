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
        <h3> Brand Info </h3>
    </div>

    <div class="row">
        <p>Name: ${brandInfo.name}</p>
    </div>
    <div class="row">
        <p>Description: ${brandInfo.description}</p>
    </div>
    <div class="row">
        <p>Contact Number: ${brandInfo.contactNumber}</p>
    </div>
    <div class="row">
        <p>Contact Number 2: ${brandInfo.contactNumber2}</p>
    </div>

    <div class="row">
        <p>Central Office Address: ${brandInfo.centralOfficeAddress}</p>
    </div>

    <div class="row">
        <p>Service Center Address: ${brandInfo.serviceCenterAddress}</p>
    </div>


    <div>
        <a href="/brand/update/${brandId}">update the Brand</a>
    </div>

    <c:import url="../../modals/cart.jsp"/>
</section>
<section class="content">
    <c:import url="../../includes/footer.jsp"/>
</section>
</body>
</html>