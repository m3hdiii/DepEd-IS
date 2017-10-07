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
        <h3> Section List </h3>
    </div>

    <div class="row">
        <div class="col col-lg-3"/>
        <div class="col col-lg-9">
            <table>
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Department</th>
                    <th>Edit Section</th>
                    <th>Remove Section</th>

                </tr>
                </thead>
                <tbody>
                <c:forEach items="${sections}" var="section">
                    <tr>
                        <td>${section.name}</td>
                        <td>${section.description}</td>
                        <td>${section.department.name}</td>
                        <td><a href="/section/update/${section.sectionId}"><img src="${resourceURL}/images/edit.png"
                                                                                width="16"/></a></td>
                        <td><img src="${resourceURL}/images/delete.png" width="16"/></td>
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