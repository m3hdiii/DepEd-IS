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
<c:import url="../../includes/head.jsp">
    <c:param name="title" value="Goods"/>
    <c:param name="description" value="List of Goods"/>
</c:import>
<html>
<body>
<c:import url="../../includes/left-nav.jsp"/>
<section class="content">
    <c:import url="../../includes/top-nav.jsp"/>

    <%--<div class="warper container-fluid">--%>
    <%--<div class="page-header">--%>
    <%--<h1>Goods--%>
    <%--<small>DepEd-Baguio City Division Office</small>--%>
    <%--</h1>--%>
    <%--</div>--%>
    <%--</div>--%>

    <div class="row">
        <div class="col col-lg-3"/>
        <div class="col col-lg-3">
            <table>
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Item Type</th>
                    <th>Threshold</th>
                    <th>Quantity</th>

                </tr>
                </thead>
                <tbody>
                <c:forEach items="${goods}" var="good">
                    <tr>
                        <td>${good.name}</td>
                        <td>${good.description}</td>
                        <td>${good.itemType}</td>
                        <td>${good.threshold}</td>
                        <td>${good.quantity}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>


</section>
<c:import url="../../includes/footer.jsp"/>
</body>
</html>
