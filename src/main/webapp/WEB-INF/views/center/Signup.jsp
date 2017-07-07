<%--
  Created by IntelliJ IDEA.
  User: mehdi
  Date: 7/7/17
  Time: 11:43 AM
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

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Brio Web App - Bootstrap Admin Template + AngularJS</title>
    <meta name="description" content="">
    <meta name="author" content="Akshay Kumar">

    <link rel="stylesheet" href="assets/css/bootstrap/bootstrap.css" />
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,500,600,700,300' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="assets/css/app/app.v1.css" />
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>


</head>
<body>


<div class="container">
    <div class="row">
        <div class="col-lg-4 col-lg-offset-4">
            <h3 class="text-center">Braio</h3>
            <p class="text-center">Sign in to get in touch</p>
            <hr class="clean">
            <form:form commandName="user" method="post" role="form">
                <div class="form-group input-group">
                    <span class="input-group-addon"><i class="fa fa-user"></i></span>
                    <form:input path="username" type="email" class="form-control"  placeholder="User Name" />
                </div>
                <div class="form-group input-group">
                    <span class="input-group-addon"><i class="fa fa-envelope"></i></span>
                    <form:input path="email" type="email" class="form-control"  placeholder="Email Adress">
                </div>
                <div class="form-group input-group">
                    <span class="input-group-addon"><i class="fa fa-key"></i></span>
                    <form:input path="password" type="text" class="form-control"  placeholder="Password">
                </div>
                <div class="form-group">
                    <label class="cr-styled">
                        <input type="checkbox" ng-model="todo.done">
                        <i class="fa"></i>
                    </label>
                    Remember me
                </div>
                <button type="submit" class="btn btn-purple btn-block">Sign up</button>
            </form:form>
            <hr>

            <p class="text-center text-gray">Already have account</p>
            <button type="submit" class="btn btn-default btn-block">Sign In</button>
        </div>
    </div>
</div>



<script src="assets/js/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="assets/js/plugins/underscore/underscore-min.js"></script>
<script src="assets/js/bootstrap/bootstrap.min.js"></script>
<script src="assets/js/globalize/globalize.min.js"></script>
<script src="assets/js/plugins/nicescroll/jquery.nicescroll.min.js"></script>
<script src="assets/js/app/custom.js" type="text/javascript"></script>
<script>
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
            (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

    ga('create', 'UA-56821827-1', 'auto');
    ga('send', 'pageview');
</script>
</body>
</html>
