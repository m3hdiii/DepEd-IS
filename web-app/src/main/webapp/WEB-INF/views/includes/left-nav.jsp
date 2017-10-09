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
            <li class="active"><a href="/dashboard"><span
                    class="nav-label">Dashboard</span></a>
            </li>
            <li class="has-submenu"><a href="#"><span class="nav-label">Profile</span></a>
                <ul class="list-unstyled">
                    <li><a href="/user/1">User Profile</a></li>
                    <li><a href="/user/update/1">Update User Profile</a></li>
                    <li><a href="/user/list">Search a User</a></li>
                </ul>
            </li>
            <!--
            <li class="has-submenu"><a href="#"><i class="fa fa-file-text-o"></i> <span class="nav-label">Item</span></a>
                <ul class="list-unstyled">
                    <li><a href="">Item Registration</a></li>
                    <li><a href="/item-list">List of all Items</a></li>
                    <li><a href="/goods/list">Goods</a></li>
                    <li><a href="/semi-expendable/lists">Semi-Expendables</a></li>
                    <li><a href="/equipment/list">Equipment</a></li>
                </ul>
            </li>
            -->
            <!--
            <li class="has-submenu"><a href="#"><i class="fa fa-comment-o"></i> <span class="nav-label">Manage Notifications</span></a>
                <ul class="list-unstyled">
                    <li><a href="UserNotifications.html">View Notifications</a></li>
                    <li><a href="GenerateNotification.html">Send Notifications</a></li>
                </ul>
            </li>
            -->
            <li class="has-submenu"><a href="#"></i><span
                    class="nav-label">User Management</span></a>
                <ul class="list-unstyled">
                    <li><a href="/user/create">Create User</a></li>
                    <li><a href="/user/update/1">Update User Information</a></li>
                    <li><a href="/user/1">View User</a></li>
                    <li><a href="/user/list">List of Users</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"> <span class="nav-label">Request Management</span></a>
                <ul class="list-unstyled">
                    <li><a href="/borrow-request/create">Request for an Equipment</a></li>
                    <li><a href="/request-item/create">Request for Goods</a></li>
                    <li><a href="/request-item/create">Request for Semi-Expendables</a></li>
                    <li><a href="/request-item/update">Manage an Item Request</a></li>
                    <li><a href="/request-item/1">View Item Request Info</a></li>
                    <li><a href="/request-item/list">List of all Item Requests</a></li>
                </ul>
            </li>
            <!--
            <li class="has-submenu"><a href="#"><i class="fa fa-book"></i><span class="nav-label">Item Management</span></a>
             -->
            <li class="has-submenu"><a href="#"><span class="nav-label">Item Information</span></a>
                <ul class="list-unstyled">
                    <li><a href="/equipment-info/update/1">Update Equipment Info</a></li>
                    <li><a href="/goods/update/1">Update Goods Info</a></li>
                    <li><a href="/semi-expendable/update/3">Update Semi-Expendable Info</a></li>
                    <li><a href="/brand/update/1">Update Item Brand Info</a></li>
                    <li><a href="/category/update/1">Update Item Category</a></li>
                    <li><a href="/pack/update/1">Update Item Package</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><span class="nav-label">Item Creation</span></a>
                <ul class="list-unstyled">
                    <li><a href="/brand/create">Create Equipment</a></li>
                    <li><a href="/goods/create">Create Goods</a></li>
                    <li><a href="/semi-expendable/create">Create Semi-Expendables</a></li>
                    <li><a href="/brand/create">Create an Item Brand</a></li>
                    <li><a href="/category/create">Create an Item Category</a></li>
                    <li><a href="/pack/create">Create Item Package</a></li>
                </ul>
            </li>
            <li class="has-submenu"><a href="#"><i class="fa fa-sign-out"></i> <span class="nav-label">Logout</span></a>
            </li>
        </ul>
    </nav>
</aside>