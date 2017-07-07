<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="" var="routePath" scope="request" />
<c:url value="/public" var="resourceURL" scope="request" />


<div class="row">
	<div class="navbar navbar-fixed-top navbar-default">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand glyphicon glyphicon-star-empty" href=".">&nbsp;DepEd</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href=".">Home</a></li>
					<li><a href="${routePath}about">About</a></li>
					<li><a href="${routePath}contact">Contact</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Store<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li class="dropdown-header"><a href="ads">Advertisements</a></li>
							<li class="divider"></li>
							<li class="dropdown-header"><a href="buy-services">Buy our Services</a></li>

						</ul></li>
					<li><a href="categories">Categories</a></li>
                    <li>
                        <a class="btn btn-default" style="margin: 10px 3px 0 3px !important; padding: 5px !important;" href="signup">Sign up Now</a>
                    </li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="/?lang=en"
						class="dropdown-toggle" data-toggle="dropdown"><img
							style="width: 16px; height: 16px;"
							src="${resourceURL}/img/flags/united_states_flag.png" /><b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="/?lang=en"><img
									style="width: 16px; height: 16px;"
									src="${resourceURL}/img/flags/united_states_flag.png">&nbsp;en/us</a></li>
							<li><a href="/?lang=fa"><img
									style="width: 16px; height: 16px;"
									src="${resourceURL}/img/flags/iran_flag.png">&nbsp;farsi</a></li>
									<li class="divider"></li>
									<%--<li><a href="${routePath}add-lang" >Add a language</a></li>--%>
						</ul></li>

<%--					<li>
						<!-- AddThis Button BEGIN -->
						<div class="addthis_default_style"
							style="margin-top: 15px !important;">
							<a class="addthis_button_compact"></a>
						</div><script type="text/javascript"
							src="${resourceURL}/js/addthis_widget.js#pubid=ra-534f66b4120e57d1"></script>
						<!-- AddThis Button END -->
					</li>--%>


				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
</div>