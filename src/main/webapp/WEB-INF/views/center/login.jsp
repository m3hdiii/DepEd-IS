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


<div class="container">
    <div class="row">
        <div class="col-lg-4 col-lg-offset-4">
            <h3 class="text-center">Department of Education Baguio City Division</h3>
            <p class="text-center">Inventory System Login</p>
            <hr class="clean">
        <form:form commandName="user" method="post" role="form">

                <div class="form-group input-group">
                    <span class="input-group-addon"><i class="fa fa-envelope"></i></span>
                    <form:input path="username" type="text" class="form-control"  placeholder="Username" />
                </div>
                <div class="form-group input-group">
                    <span class="input-group-addon"><i class="fa fa-key"></i></span>
                    <form:input path="password" type="password" class="form-control"  placeholder="Password" />
                </div>
                <div class="form-group">
                    <label class="cr-styled">
                        <input type="checkbox" ng-model="todo.done">
                        <i class="fa"></i>
                    </label>
                    Remember me?
                </div>
                <button type="submit" class="btn btn-purple btn-block">Login</button>
            </form:form>
            <hr>

            <p class="text-center text-gray">Did you forget your password?</p>
            <button type="submit" class="btn btn-default btn-block">Contact Admin</button>
        </div>
    </div>
</div>
<c:import url="../includes/footer.jsp" />
</body>
</html>