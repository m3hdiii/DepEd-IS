<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:url value="/public" var="resourceURL" scope="request"/>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">

<c:import url="../includes/head.jsp">
    <c:param name="title" value="Dashboard"/>
    <c:param name="description" value="Dashboard page"/>
</c:import>
<body data-ng-app>

<aside class="left-panel">

    <div class="user text-center">
        <img src="${resourceURL}/images/avtar/user.png" class="img-circle" alt="...">
        <h4 class="user-name">Empoyee Name Here</h4>

        <div class="dropdown user-login">
            <button class="btn btn-xs dropdown-toggle btn-rounded" type="button" data-toggle="dropdown"
                    aria-expanded="true">
                <i class="fa fa-circle status-icon available"></i> Available <i class="fa fa-angle-down"></i>
            </button>
            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                <li role="presentation"><a role="menuitem" href="#"><i class="fa fa-circle status-icon busy"></i>
                    Busy</a></li>
                <li role="presentation"><a role="menuitem" href="#"><i class="fa fa-circle status-icon invisibled"></i>
                    Invisible</a></li>
                <li role="presentation"><a role="menuitem" href="#"><i class="fa fa-circle status-icon signout"></i>
                    Away</a></li>
            </ul>
        </div>
    </div>

    <nav class="navigation">
        <ul class="list-unstyled">
            <li class="active"><a href="#"><i class="fa fa-bookmark-o"></i><span class="nav-label">Dashboard</span></a>
            </li>
            <li class="has-submenu"><a href="#"><i class="fa fa-user"></i> <span
                    class="nav-label">Profile</span></a>
                <ul class="list-unstyled">
                    <li><a href="#">page #</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="fa fa-file-text-o"></i> <span
                    class="nav-label">Item Registration Forms</span></a>
                <ul class="list-unstyled">
                    <li><a href="#">page #</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="fa fa-comment-o"></i> <span class="nav-label">Manage Notifications</span></a>
                <ul class="list-unstyled">
                    <li><a href="#">page #</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="fa fa-shopping-cart"></i> <span class="nav-label">Request Management
                </span></a>
                <ul class="list-unstyled">
                    <li><a href="#">page #</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="fa fa-book"></i> <span class="nav-label">User Reports &
                Statistics</span></a>
                <ul class="list-unstyled">
                    <li><a href="#">page #</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="fa fa-sign-out"></i> <span class="nav-label">Logout</span></a>
                <ul class="list-unstyled">
                    <!-- sub pages must be added here -->
                </ul>
            </li>
        </ul>
    </nav>

</aside>

<section class="content">

    <header class="top-head container-fluid">
        <button type="button" class="navbar-toggle pull-left">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>

        <form role="search" class="navbar-left app-search pull-left hidden-xs">
            <input type="text" placeholder="Search" class="form-control form-control-circle">
        </form>

        <nav class=" navbar-default hidden-xs" role="navigation">
            <ul class="nav navbar-nav">
                <li><a href="#">Home</a></li>
                <li><a href="#">Profile</a></li>
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">Search & Filter <span
                            class="caret"></span></a>
                    <ul role="menu" class="dropdown-menu">
                        <li><a href="#">Goods</a></li>
                        <li><a href="#">Semi-Expendables</a></li>
                        <li class="divider">
                        <li><a href="#">Computer Peripehrals</a></li>
                        <li><a href="#">Data Storage</a></li>
                        </li>
                        <li><a href="#">Equipment</a></li>
                        <li class="divider">
                        <li><a href="#">Electrionics</a></li>
                        <li><a href="#">Non-Electronics</a></li>
                        </li>
                    </ul>
                </li>
            </ul>
        </nav>

        <ul class="nav-toolbar">
            <li class="dropdown"><a href="#" data-toggle="dropdown"><i class="fa fa-comments-o"></i> <span
                    class="badge bg-warning">7</span></a>
                <div class="dropdown-menu md arrow pull-right panel panel-default arrow-top-right messages-dropdown">
                    <div class="panel-heading">
                        Private Messages
                    </div>

                    <div class="list-group">

                        <a href="#" class="list-group-item">
                            <div class="media">
                                <div class="user-status busy pull-left">
                                    <img class="media-object img-circle pull-left" src="${resourceURL}/images/avtar/user2.png"
                                         alt="user#1" width="40">
                                </div>
                                <div class="media-body">
                                    <h5 class="media-heading">Lorem ipsum dolor sit consect....</h5>
                                    <small class="text-muted">23 Sec ago</small>
                                </div>
                            </div>
                        </a>
                        <a href="#" class="list-group-item">
                            <div class="media">
                                <div class="user-status offline pull-left">
                                    <img class="media-object img-circle pull-left" src="${resourceURL}/images/avtar/user3.png"
                                         alt="user#1" width="40">
                                </div>
                                <div class="media-body">
                                    <h5 class="media-heading">Nunc elementum, enim vitae</h5>
                                    <small class="text-muted">23 Sec ago</small>
                                </div>
                            </div>
                        </a>
                        <a href="#" class="list-group-item">
                            <div class="media">
                                <div class="user-status invisibled pull-left">
                                    <img class="media-object img-circle pull-left" src="${resourceURL}/images/avtar/user4.png"
                                         alt="user#1" width="40">
                                </div>
                                <div class="media-body">
                                    <h5 class="media-heading">Praesent lacinia, arcu eget</h5>
                                    <small class="text-muted">23 Sec ago</small>
                                </div>
                            </div>
                        </a>
                        <a href="#" class="list-group-item">
                            <div class="media">
                                <div class="user-status online pull-left">
                                    <img class="media-object img-circle pull-left" src="${resourceURL}/images/avtar/user5.png"
                                         alt="user#1" width="40">
                                </div>
                                <div class="media-body">
                                    <h5 class="media-heading">In mollis blandit tempor.</h5>
                                    <small class="text-muted">23 Sec ago</small>
                                </div>
                            </div>
                        </a>

                        <a href="#" class="btn btn-info btn-flat btn-block">View All Messages</a>

                    </div>

                </div>
            </li>
            <li class="dropdown"><a href="#" data-toggle="dropdown"><i class="fa fa-bell-o"></i><span
                    class="badge">3</span></a>
                <div class="dropdown-menu arrow pull-right md panel panel-default arrow-top-right notifications">
                    <div class="panel-heading">
                        System Notifications
                    </div>

                    <div class="list-group">

                        <a href="#" class="list-group-item">
                            <p>Installing App v1.2.1
                                <small class="pull-right text-muted">45% Done</small>
                            </p>
                            <div class="progress progress-xs no-margn progress-striped active">
                                <div class="progress-bar" role="progressbar" aria-valuenow="45" aria-valuemin="0"
                                     aria-valuemax="100" style="width: 45%">
                                    <span class="sr-only">45% Complete</span>
                                </div>
                            </div>
                        </a>

                        <a href="#" class="list-group-item">
                            Fusce dapibus molestie tincidunt. Quisque facilisis libero eget justo iaculis
                        </a>

                        <a href="#" class="list-group-item">
                            <p>Server Status</p>
                            <div class="progress progress-xs no-margn">
                                <div class="progress-bar progress-bar-success" style="width: 35%">
                                    <span class="sr-only">35% Complete (success)</span>
                                </div>
                                <div class="progress-bar progress-bar-warning" style="width: 20%">
                                    <span class="sr-only">20% Complete (warning)</span>
                                </div>
                                <div class="progress-bar progress-bar-danger" style="width: 10%">
                                    <span class="sr-only">10% Complete (danger)</span>
                                </div>
                            </div>
                        </a>


                        <a href="#" class="list-group-item">
                            <div class="media">
                                <span class="label label-danger media-object img-circle pull-left">Danger</span>
                                <div class="media-body">
                                    <h5 class="media-heading">Lorem ipsum dolor sit consect..</h5>
                                </div>
                            </div>
                        </a>


                        <a href="#" class="list-group-item">
                            <p>Server Status</p>
                            <div class="progress progress-xs no-margn">
                                <div style="width: 60%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="60"
                                     role="progressbar" class="progress-bar progress-bar-info">
                                    <span class="sr-only">60% Complete (warning)</span>
                                </div>
                            </div>
                        </a>
                    </div>

                </div>
            </li>
            <li class="dropdown"><a href="#" data-toggle="dropdown"><i class="fa fa-ellipsis-v"></i></a>
                <div class="dropdown-menu lg pull-right arrow panel panel-default arrow-top-right">
                    <div class="panel-heading">
                        More Apps
                    </div>
                    <div class="panel-body text-center">
                        <div class="row">
                            <div class="col-xs-6 col-sm-4"><a href="#" class="text-green"><span class="h2"><i
                                    class="fa fa-envelope-o"></i></span>
                                <p class="text-gray no-margn">Messages</p></a></div>
                            <div class="col-xs-6 col-sm-4"><a href="#" class="text-purple"><span class="h2"><i
                                    class="fa fa-calendar-o"></i></span>
                                <p class="text-gray no-margn">Calendar</p></a></div>

                            <div class="col-xs-12 visible-xs-block">
                                <hr>
                            </div>

                            <div class="col-xs-6 col-sm-4"><a href="#" class="text-red"><span class="h2"><i
                                    class="fa fa-comments-o"></i></span>
                                <p class="text-gray no-margn">Chatting</p></a></div>

                            <div class="col-lg-12 col-md-12 col-sm-12  hidden-xs">
                                <hr>
                            </div>

                            <div class="col-xs-12 visible-xs-block">
                                <hr>
                            </div>

                            <div class="col-xs-6 col-sm-4"><a href="#" class="text-primary"><span class="h2"><i
                                    class="glyphicon glyphicon-comment"></i></span>
                                <p class="text-gray">Notifications</p></a></div>

                            <div class="col-xs-6 col-sm-4"><a href="#" class="text-primary"><span class="h2"><i
                                    class="fa fa-sign-out"></i></span>
                                <p class="text-gray">Logout</p></a></div>
                        </div>
                    </div>
                </div>
            </li>
        </ul>
    </header>

    <div class="warper container-fluid">

        <div class="page-header">
            <h1>Home
                <small>DepEd-Baguio City Division Office</small>
            </h1>
        </div>


        <div class="row">

            <div class="col-md-3 col-sm-6">
                <div class="panel panel-default clearfix rounded icon-bar border-radius-50">
                    <i class="img-circle fa fa-shopping-cart bg-danger transit stats-icon"></i>
                    <a href="">
                        Request for an Item
                    </a>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="panel panel-default clearfix rounded icon-bar border-radius-50">
                    <i class="img-circle fa fa-tags bg-info transit stats-icon"></i>
                    <a href="">
                        View Request History
                    </a>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="panel panel-default clearfix rounded icon-bar border-radius-50">
                    <i class="img-circle fa fa-user bg-green transit stats-icon"></i>
                    <a href="">
                        View Registered users
                    </a>
                </div>
            </div>
            <div class="col-md-3 col-sm-6">
                <div class="panel panel-default clearfix rounded icon-bar border-radius-50">
                    <i class="img-circle fa fa-newspaper-o bg-gray transit stats-icon"></i>
                    <a href="">
                        View All Notifications
                    </a>
                </div>
            </div>

        </div>


        <div class="row">
            <div class="col-lg-8">

                <div class="panel panel-default">
                    <div class="panel-heading clean">
                        Statistics
                        <div class="pull-right">
                            <div class="btn-group">
                                <button type="button" class="btn btn-default btn-sm btn-circle"
                                        data-toggle="dropdown">
                                    Monthly <span class="caret"></span></button>
                                <ul class="dropdown-menu pull-right" role="menu">
                                    <li><a href="#">Daily</a></li>
                                    <li><a href="#">Weekly</a></li>
                                    <li class="active"><a href="#">Monthly</a></li>
                                    <li><a href="#">Yearly</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Specific Time</a></li>
                                </ul>
                            </div>
                            <button type="button" class="btn btn-default btn-sm btn-circle">GO</button>
                        </div>
                    </div>
                    <div class="panel-body">
                        <div id="splineArea-chart" style="height:280px;"></div>
                    </div>
                </div>

            </div>

        </div>
    </div>

    <div class="row">
        <div class="col-lg-6">

            <div class="row">
                <div class="col-lg-6">
                    <div class="panel panel-default">
                        <div class="panel-body text-center">
                            <h5 class="no-margn"><strong>WoW Revenue</strong></h5>
                            <p class="text-muted">
                                <small>total 153,248</small>
                            </p>
                            <div id="dashboard-stats-sparkline5"></div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="panel panel-default">
                        <div class="panel-body text-center">
                            <h5 class="no-margn"><strong>Sessions Count</strong></h5>
                            <p class="text-muted">
                                <small>total 153,248</small>
                            </p>
                            <div id="dashboard-stats-sparkline6"></div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">Task's in progress</div>
                        <div class="panel-body">

                            <p><strong>Loading Server Data</strong>
                                <small class="text-muted">45% completed</small>
                            </p>
                            <div class="progress progress-xs progress-striped active">
                                <div style="width: 45%" aria-valuemax="100" aria-valuemin="0" aria-valuenow="45"
                                     role="progressbar" class="progress-bar">
                                    <span class="sr-only">45% Complete</span>
                                </div>
                            </div>


                            <div class="row">
                                <div class="col-lg-4">
                                    <p><strong>40%</strong> Task one</p>
                                    <div class="progress progress-xs no-margn">
                                        <div class="progress-bar progress-bar-success progress-bar-striped"
                                             role="progressbar" aria-valuenow="40" aria-valuemin="0"
                                             aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4">
                                    <p><strong>60%</strong> Task two</p>
                                    <div class="progress progress-xs no-margn">
                                        <div class="progress-bar progress-bar-warning progress-bar-striped"
                                             role="progressbar" aria-valuenow="60" aria-valuemin="0"
                                             aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4">
                                    <p><strong>80%</strong> Task three</p>
                                    <div class="progress progress-xs no-margn">
                                        <div class="progress-bar progress-bar-danger progress-bar-striped"
                                             role="progressbar" aria-valuenow="80" aria-valuemin="0"
                                             aria-valuemax="100" style="width: 80%">
                                            <span class="sr-only">80% Complete (danger)</span>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-body" id="demo-map-2" style="height:280px;">


                        </div>
                    </div>
                </div>
            </div>


        </div>
        <div class="col-lg-6">

            <ul class="nav nav-tabs" role="tablist">
                <li class="active"><a href="#messages" role="tab" data-toggle="tab">Notifications</a></li>
                <li><a href="#activities" role="tab" data-toggle="tab"><span class="hidden-xs">Item Requests</span>
                </a></li>
            </ul>

            <div class="tab-content">

                <div class="panel panel-default tab-pane tabs-up active" id="notification">
                    <div class="panel-body">


                        <ul class="media-list messages nicescroll">
                            <li class="media">
                                <a href="#" class="pull-left user-status online">
                                    <img alt="user" class="media-object" src="${resourceURL}/images/avtar/user2.png">
                                </a>
                                <div class="media-body">
                                    <h5 class="media-heading"><strong>Maximo Mccall</strong></h5>
                                    <p class="text-muted no-margn">Cras sit amet nibh libero, in gravida nulla.
                                        Nulla vel metus scelerisque ante sollicitudin commodo.</p>
                                </div>
                            </li>
                            <li class="media">
                                <a href="#" class="pull-right user-status offline">
                                    <img alt="user" class="media-object" src="${resourceURL}/images/avtar/user3.png">
                                </a>
                                <div class="media-body">
                                    <h5 class="media-heading"><strong>Brice Rodriquez</strong></h5>
                                    <p class="text-muted no-margn">Cras sit amet nibh libero, in gravida nulla.
                                        Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio,
                                        vestibulum in vulputate at, tempus viverra turpis.</p>
                                </div>
                            </li>
                            <li class="media">
                                <a href="#" class="pull-left user-status invisibled">
                                    <img alt="user" class="media-object" src="${resourceURL}/images/avtar/user4.png">
                                </a>
                                <div class="media-body">
                                    <h5 class="media-heading"><strong>Garfield Abbott</strong></h5>
                                    <p class="text-muted no-margn">Cras sit amet nibh libero, in gravida nulla.
                                        Nulla vel metus scelerisque ante sollicitudin commodo.</p>
                                    <div class="media">
                                        <a href="#" class="pull-left user-status online">
                                            <img alt="user" class="media-object"
                                                 src="${resourceURL}/images/avtar/user5.png">
                                        </a>
                                        <div class="media-body">
                                            <h5 class="media-heading"><strong>Wilbert Melton</strong></h5>
                                            <p class="text-muted no-margn">Cras sit amet nibh libero, in gravida
                                                nulla. Nulla vel metus scelerisque ante sollicitudin commodo.</p>
                                        </div>
                                    </div>
                                    <div class="media">
                                        <a href="#" class="pull-left user-status online">
                                            <img alt="user" class="media-object"
                                                 src="${resourceURL}/images/avtar/user6.png">
                                        </a>
                                        <div class="media-body">
                                            <h5 class="media-heading"><strong>Felecia Oconnell</strong></h5>
                                            <p class="text-muted no-margn">Cras sit amet nibh libero, in gravida
                                                nulla. Nulla vel metus scelerisque ante sollicitudin commodo.</p>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="media">
                                <a href="#" class="pull-left online">
                                    <img alt="user" class="media-object" src="${resourceURL}/images/avtar/user.png">
                                </a>
                                <div class="media-body">
                                    <h5 class="media-heading"><strong>Media heading</strong></h5>
                                    <p class="text-muted no-margn">Cras sit amet nibh libero, in gravida nulla.
                                        Nulla vel metus scelerisque ante sollicitudin commodo.</p>
                                </div>
                            </li>
                        </ul>

                    </div>
                    <div class="panel-footer">
                        <form role="form">
                            <div class="input-group">
                                <input type="text" placeholder="Message here..." class="form-control"
                                       data-ng-model="todoText">
                                <span class="input-group-btn">
                                    <button type="submit" class=" btn-success btn">Send</button>
                                  </span>
                            </div>
                        </form>
                    </div>
                </div>


                <div class="panel panel-default padd-t-sm tab-pane tabs-up" id="appointments">

                    <div class="panel-heading clean clearfix text-center">
                        <div class="btn-group pull-left">
                            <button class="btn btn-default btn-sm" data-calendar-nav="prev">&lt; Prev</button>
                            <button class="btn btn-sm btn-default" data-calendar-nav="today">Today</button>
                            <button class="btn btn-sm btn-default" data-calendar-nav="next">Next &gt;</button>
                        </div>
                        <b class="calender-title"></b>
                        <div class="btn-group pull-right">
                            <button class="btn btn-sm btn-default" data-calendar-view="year">Year</button>
                            <button class="btn btn-sm btn-default active" data-calendar-view="month">Month</button>
                            <button class="btn btn-sm btn-default" data-calendar-view="week">Week</button>
                            <button class="btn btn-sm btn-default" data-calendar-view="day">Day</button>
                        </div>
                    </div>

                    <div class="panel-body">
                        <div id="calendar"></div>
                    </div>

                </div>

                <div class="panel panel-default tab-pane tabs-up" id="activities">
                    <div class="panel-body">
                        <ul class="activities-list list-unstyled nicescroll">
                            <li class="default-activity">
                                <span class="time">moments ago</span>
                                <p><a href="#">Kevin</a> Requested for 1 rim of Bond Paper.</p>
                                <div class="btn-group btn-group-xs activity-actions">
                                    <button type="button" class="btn btn-default btn-xs">Actions</button>
                                    <button type="button" class="btn btn-default btn-xs dropdown-toggle"
                                            data-toggle="dropdown">
                                        <span class="caret"></span>
                                        <span class="sr-only">Toggle Dropdown</span>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li><a href="#">Approve Request</a></li>
                                        <li><a href="#">Disapprove Request</a></li>
                                        <li><a href="#">Mark as Returned</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li class="default-activity">
                                <span class="time">1 min ago</span>
                                <p><a href="#">Nick</a> Requested for 1 box of Rubber Bands</p>
                                <div class="btn-group btn-group-xs activity-actions">
                                    <button type="button" class="btn btn-default">Actions</button>
                                    <button type="button" class="btn btn-default dropdown-toggle"
                                            data-toggle="dropdown">
                                        <span class="caret"></span>
                                        <span class="sr-only">Toggle Dropdown</span>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li><a href="#">Approve Request</a></li>
                                        <li><a href="#">Disapprove Request</a></li>
                                        <li><a href="#">Mark as Returned</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li class="default-activity">
                                <span class="time">10 mins ago</span>
                                <p><a href="#">Jacob</a> Requested for one 22 inches<span class="label label-info">
                                        LCD monitor</span> and one set of<span class="label label-info">
                                        Altec Lansing Speakers</span></p>
                                <div class="btn-group btn-group-xs activity-actions">
                                    <button type="button" class="btn btn-default">Actions</button>
                                    <button type="button" class="btn btn-default dropdown-toggle"
                                            data-toggle="dropdown">
                                        <span class="caret"></span>
                                        <span class="sr-only">Toggle Dropdown</span>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li><a href="#">Approve Request</a></li>
                                        <li><a href="#">Disapprove Request</a></li>
                                        <li><a href="#">Mark as Returned</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li class="default-activity">
                                <span class="time">8hrs ago</span>
                                <p><a href="#">John</a> Successfully returned 2 <span class="label label-success">
                                        Dell Laptops</span> under his name</p>
                                <div class="btn-group  btn-group-xs activity-actions">
                                    <button type="button" class="btn btn-default">Actions</button>
                                    <button type="button" class="btn btn-default dropdown-toggle"
                                            data-toggle="dropdown">
                                        <span class="caret"></span>
                                        <span class="sr-only">Toggle Dropdown</span>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li><a href="#">Approve Request</a></li>
                                        <li><a href="#">Disapprove Request</a></li>
                                        <li><a href="#">Mark as Returned</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li class="default-activity">
                                <span class="time">12 hrs ago</span>
                                <p><a href="#">Jake</a> Returned 5 damaged <span class="label label-danger">Logitech K200 Keyboards</span>
                                    .</p>
                                <div class="btn-group btn-group-xs activity-actions">
                                    <button type="button" class="btn btn-default">Actions</button>
                                    <button type="button" class="btn btn-default dropdown-toggle"
                                            data-toggle="dropdown">
                                        <span class="caret"></span>
                                        <span class="sr-only">Toggle Dropdown</span>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li><a href="#">Approve Request</a></li>
                                        <li><a href="#">Disapprove Request</a></li>
                                        <li><a href="#">Mark as Returned</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li class="default-activity">
                                <span class="time">13 hrs ago</span>
                                <p><a href="#">Jake</a> Returned 5 damaged <span class="label label-danger">Logitech K200 Keyboards</span>
                                    .</p>
                                <div class="btn-group btn-group-xs activity-actions">
                                    <button type="button" class="btn btn-default">Actions</button>
                                    <button type="button" class="btn btn-default dropdown-toggle"
                                            data-toggle="dropdown">
                                        <span class="caret"></span>
                                        <span class="sr-only">Toggle Dropdown</span>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li><a href="#">Approve Request</a></li>
                                        <li><a href="#">Disapprove Request</a></li>
                                        <li><a href="#">Mark as Returned</a></li>
                                    </ul>
                                </div>
                            </li>
                            <li class="default-activity">
                                <span class="time">14 hrs ago</span>
                                <p><a href="#">Jake</a> Returned 5 damaged <span class="label label-danger">Logitech K200 Keyboards</span>
                                    .</p>
                                <div class="btn-group btn-group-xs activity-actions">
                                    <button type="button" class="btn btn-default">Actions</button>
                                    <button type="button" class="btn btn-default dropdown-toggle"
                                            data-toggle="dropdown">
                                        <span class="caret"></span>
                                        <span class="sr-only">Toggle Dropdown</span>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li><a href="#">Approve Request</a></li>
                                        <li><a href="#">Disapprove Request</a></li>
                                        <li><a href="#">Mark as Returned</a></li>
                                    </ul>
                                </div>
                            </li>
                        </ul>
                    </div>

                </div>

            </div>

        </div>
    </div>

    </div>
    <!-- Warper Ends Here (working area) -->


    <footer class="container-fluid footer">
        Copyright &copy; 2017 <a href="#" target="_blank">DepEd-IS Group</a>
        <a href="#" class="pull-right scrollToTop"><i class="fa fa-chevron-up"></i></a>
    </footer>


</section>
<c:import url="../includes/footer.jsp" />
</body>
</html>
