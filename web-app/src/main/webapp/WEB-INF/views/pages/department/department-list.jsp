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
        <h3>Department List</h3>
    </div>

    <div class="row">
        <div class="col col-lg-3"/>
        <div class="col col-lg-3">
            <table>
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Parent Category</th>
                    <th>Creation Date</th>
                    <th>Department Head</th>

                </tr>
                </thead>
                <tbody>
                <c:forEach items="${departments}" var="department">
                    <tr>
                        <td>${department.name}</td>
                        <td>${department.description}</td>
                        <td>${department.parentCategory.name}</td>
                        <td>${department.creationDate}</td>
                        <td>${department.departmentHead}</td>
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