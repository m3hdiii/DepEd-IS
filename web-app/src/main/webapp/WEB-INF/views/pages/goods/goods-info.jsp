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
    <c:param name="description" value="Goods Information"/>
</c:import>

<body>

<c:import url="../../includes/left-nav.jsp"/>

<section class="content">

    <c:import url="../../includes/top-nav.jsp"/>

    <div class="page-header">
        <h3>&nbsp;&nbsp;Information&nbsp;<small>&nbsp;for Goods</small>
        </h3>
    </div>
    <div class="row">
        <p>Name: ${goodsInfo.name}</p>
    </div>
    <div class="row">
        <p>Description: ${goodsInfo.description}</p>
    </div>
    <div class="row">
        <p>Item Type: ${goodsInfo.itemType}</p>
    </div>
    <div class="row">
        <p>Threshold: ${goodsInfo.threshold}</p>
    </div>

    <div class="row">
        <p>Quantity: ${goodsInfo.quantity}</p>
    </div>
    <div>
        <a href="/goods/update/${goodsId}">update this item</a>
    </div>

    <c:import url="../../modals/cart.jsp"/>
</section>
<section class="content">
    <c:import url="../../includes/footer.jsp"/>
</section>
</body>
</html>