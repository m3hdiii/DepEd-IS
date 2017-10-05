<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
            <li class="active"><a href="dashboard"><i class="fa fa-bookmark-o"></i><span class="nav-label">Dashboard</span></a>
            </li>
            <li class="has-submenu"><a href="#"><i class="fa fa-user"></i> <span
                    class="nav-label">Profile</span></a>
                <ul class="list-unstyled">
                    <li><a href="profile">User Profile</a></li>
                    <li><a href="edituserprofile">Update User Profile</a></li>
                    <li><a href="UserSearch.html">Search a User</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="fa fa-file-text-o"></i> <span
                    class="nav-label">Item</span></a>
                <ul class="list-unstyled">
                    <li><a href="">Item Registration</a></li>
                    <li><a href="item-list">List of all Items</a></li>
                    <li><a href="goods">Goods</a></li>
                    <li><a href="semi-expendables">Semi-Expendables</a></li>
                    <li><a href="equipment">Equipment</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="fa fa-comment-o"></i> <span class="nav-label">Manage Notifications</span></a>
                <ul class="list-unstyled">
                    <li><a href="UserNotifications.html">View Notifications</a></li>
                    <li><a href="GenerateNotification.html">Send Notifications</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="fa fa-shopping-cart"></i> <span class="nav-label">Request Management
                </span></a>
                <ul class="list-unstyled">
                    <li><a href="">Request for an Item</a></li>
                    <li><a href="">View Request History</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="fa fa-book"></i> <span class="nav-label">User Reports &
                Statistics</span></a>
                <ul class="list-unstyled">
                    <li><a href="UserReports.html">View User Report</a></li>
                    <li><a href="GenerateReports">Generate User Report</a></li>
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