<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page import="net.tanesha.recaptcha.ReCaptcha" %>
<%@ page import="net.tanesha.recaptcha.ReCaptchaFactory" %>


<section class="col-lg-6 col-lg-offset-3" style="margin-bottom: 70px; margin-top: 100px;">
    <div class="panel panel-primary ">
        <div class="panel-heading">
            <h3 class="panel-title" style="text-align: center;">
                <spring:message text="Signup a New Personnel"/>
                &#33;
            </h3>
        </div>
        <div class="panel-body">
            <form:form commandName="personnel" method="post" class="form-horizontal"
                       role="form">
                <form:errors cssClass="alert alert-warning" path="*" element="div"/>

                <div class="border-top-less">

                    <div class="form-group">
                        <label for="username" class="col-lg-3 control-label"><spring:message
                                text="username"/>&nbsp;&#58;</label>

                        <div class="col-lg-9">
                            <form:input path="username" id="username" cssClass="form-control"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="password" class="col-lg-3 control-label"><spring:message
                                text="password"/>&nbsp;&#58;</label>

                        <div class="col-lg-9">
                            <spring:message text="ZzzzSAZz@#!123"
                                            var="passwordExample"/>
                            <form:password path="password" id="password" cssClass="form-control"
                                           placeholder="ZzzzSAZz@#!123"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="email" class="col-lg-3 control-label"><spring:message
                                text="email"/>&nbsp;&#58;</label>

                        <div class="col-lg-9">
                            <spring:message text="abc@xyz.com" var="emailExample"/>
                            <form:input path="email" id="email" cssClass="form-control"
                                        placeholder="abc@xyz.com"/>
                        </div>
                    </div>

<%--                    <div class="form-group">

                        <label for="secCode" class="col-lg-3 control-label">security code:</label>

                        <div class="col-lg-9" id="secCode">
                            <script type="text/javascript">
                                var RecaptchaOptions = {
                                    theme: 'clean'
                                };
                            </script>
                            <%
                                ReCaptcha c = ReCaptchaFactory.newReCaptcha("6LffLPoSAAAAAPl138Wb0W0FuHDXqTmqcCfGE7RA", "6LffLPoSAAAAAJ5as9XGebSdcd0xJqJgd4w6gHHC", true);
                                out.print(c.createRecaptchaHtml(null, null));
                            %>
                        </div>
                    </div>--%>

                    <div class="form-group">
                        <div class="col-lg-offset-4 col-lg-8">
                            <!-- 								<input type="reset" class="btn btn-warning btn-lg col-lg-3" -->
                            <!-- 									value=<spring:message text="Reset All" /> /> -->
                            <button type="submit"
                                    class="btn btn-default btn-lg col-lg-6">
                                <spring:message text="Submit"/>
                            </button>

                        </div>
                    </div>
                </div>
            </form:form>
        </div>
    </div>
</section>