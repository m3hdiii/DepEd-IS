<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    //System.out.println(getServletContext().getRealPath("/"));
%>
<c:url value="/public" var="resourceURL" scope="request"/>
<c:url value="/" var="routePath" scope="request"/>
<c:import url="../includes/head.jsp"/>

<body id="home">
<section id="header">
    <c:import url="../includes/header.jsp"/>
</section>
<section id="body">
    <c:choose>
        <c:when test="${signup}">
            <div >
                <c:import url="sign-up.jsp"/>
            </div>
        </c:when>
    </c:choose>
</section>

<section id="footer">
    <c:import url="../includes/footer.jsp"/>
</section>

<script>
    (function (i, s, o, g, r, a, m) {
        i['GoogleAnalyticsObject'] = r;
        i[r] = i[r] || function () {
                (i[r].q = i[r].q || []).push(arguments)
            }, i[r].l = 1 * new Date();
        a = s.createElement(o),
            m = s.getElementsByTagName(o)[0];
        a.async = 1;
        a.src = g;
        m.parentNode.insertBefore(a, m)
    })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

    ga('create', 'UA-54271712-1', 'auto');
    ga('send', 'pageview');

</script>
</body>
</html>