<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 20/09/2017
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
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

<c:import url="../includes/left-nav.jsp" />

<section class="content">

    <c:import url="../includes/top-nav.jsp" />

    <!-- Header and additional info by Kieth Opiniano -->

    <div class="page-header">
        <h3> User Profile </h3>
    </div>

    <div class="row">

        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading"> Personal Information </div>
                <div class="panel-body">
                    <div class="image-group">
                        <img src="assets/images/avtar/user2.png" height="128" width="128"/>
                    </div>
                    <div class="info-group">
                        <label class="col-sm-2 control-label"> Username: </label>
                        <p> </p>
                        <br>
                    </div>
                    <div class="info-group">
                        <label class="col-sm-2 control-label"> First Name: </label>
                        <p> </p>
                        <br>
                    </div>
                    <div class="info-group">
                        <label class="col-sm-2 control-label"> Middle Name: </label>
                        <p> </p>
                        <br>
                    </div>
                    <div class="info-group">
                        <label class="col-sm-2 control-label"> Last Name: </label>
                        <p> </p>
                        <br>
                    </div>
                    <div class="info-group">
                        <label class="col-sm-2 control-label"> E-mail Address: </label>
                        <p> </p>
                        <br>
                    </div>
                    <div class="info-group">
                        <label class="col-sm-2 control-label"> Phone Number 1: </label>
                        <p> </p>
                        <br>
                    </div>
                    <div class="info-group">
                        <label class="col-sm-2 control-label"> Phone Number 2: </label>
                        <p> </p>
                        <br>
                    </div>
                    <div class="info-group">
                        <label class="col-sm-2 control-label"> Address: </label>
                        <p> </p>
                        <br>
                    </div>
                    <div class="info-group">
                        <label class="col-sm-2 control-label"> Website: </label>
                        <p> </p>
                        <br>
                    </div>
                    <div class="info-group">
                        <label class="col-sm-2 control-label"> Years of Experience: </label>
                        <p> </p>
                        <br>
                    </div>
                    <div class="info-group">
                        <label class="col-sm-2 control-label"> Birthdate: </label>
                        <p> </p>
                        <br>
                    </div>
                    <div class="info-group">
                        <label class="col-sm-2 control-label"> Gender: </label>
                        <p> </p>
                        <br>
                    </div>

                    <div class="col-lg-4 col-lg-offset-4">
                        <button type="button" class="btn btn-purple btn-block"> Edit Profile </button>
                    </div>

                </div>
            </div>
        </div>

    </div>

    <c:import url="../includes/footer.jsp" />

</section>

</body>
</html>