$(function () {
    $('.carousel').carousel({
        interval: 2000
    });
});


//$(function() {
//	$("home a:contains('Home')").parent().addClass('active');
//});



//$(function () {
//    $('ul.nav li.dropdown').hover(function () {
//        $('.dropdown-menu', this).fadeIn();
//    }, function () {
//        $('.dropdown-menu', this).fadeOut('fast');
//    });
//});


$(document).ready(function() {
    $('ul.nav li.dropdown').hover(function () {
        $('.dropdown-menu', this).fadeIn();
    }, function () {
        $('.dropdown-menu', this).fadeOut('fast');
    });
});

$('#sidebar > a').on('click', function (e) {
    e.preventDefault();
    if (!$(this).hasClass("active")) {
        var lastActive = $(this).closest("#sidebar").children(".active");
        lastActive.removeClass("active");
        lastActive.next('div').collapse('hide');
        $(this).addClass("active");
        $(this).next('div').collapse('show');
    }
});

$('.clickableAnchor').on('click', function (e) {
    var url = $(this)[0];
    window.location.href = url;
});

//$(function() {
//	$("#sortable1").sortable({
//		cancel : ".ui-state-disabled"
//	});
//
//	$("#sortable2").sortable({
//		cancel : ".ui-state-disabled"
//	});
//
//	$("#sortable3").sortable({
//		cancel : ".ui-state-disabled"
//	});
//
//	$("#sortable4").sortable({
//		cancel : ".ui-state-disabled"
//	});
//
//	$("#sortable5").sortable({
//		cancel : ".ui-state-disabled"
//	});
//
//	$(
//			"#sortable1 li, #sortable2 li, #sortable3 li, #sortable4 li, #sortable5 li ")
//			.disableSelection();
//});

$('#inviteTab a').click(function (e) {
    e.preventDefault();
    $(this).tab('show');
});

//$(function() {
//	$(your_editor_id + "_ifr").get(0);
//});


//$(window).load(function () {
//    $(function () {
//        $('#login-modal').on('hide', function () {
//            $(this).removeData('modal');
//        });
//    });
//});

$(document).ready(function() {
    $(function () {
        $('#login-modal').on('hide', function () {
            $(this).removeData('modal');
        });
    });
});


$('.draftPostExhibitor').popover({
    placement: 'left',
    trigger: 'hover'
});




