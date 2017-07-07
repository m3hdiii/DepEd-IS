var map;
var infowindow;
var latitude;
var longitude;
var sales = [48.105475, 14.128418];
var sponsorship = [47.63381,5.119629];
var assistant = [48.105475, 14.128418];
var complaints = [47.63381,5.119629];

function mapShow(building) {
	if (building == 'sales') {
		latitude = sales[0];
		longitude = sales[1];
	} else if (building == 'sponsorship') {
		latitude = sponsorship[0];
		longitude = sponsorship[1];
	} else if (building == 'assistant') {
		latitude = assistant[0];
		longitude = assistant[1];
	} else if (building == 'complaints') {
		latitude = complaints[0];
		longitude = complaints[1];
	} else {
		latitude = sales[0];
		longitude = sales[1];
	}
	initialize();
}

function initialize() {
	var pyrmont;
	if (latitude == null || longitude == null) {
		pyrmont = new google.maps.LatLng(47.63381,5.119629);
	} else {
		pyrmont = new google.maps.LatLng(latitude, longitude);
	}
	map = new google.maps.Map(document.getElementById('map-canvas'), {
		center : pyrmont,
		zoom : 15
	});

	var request = {
		location : pyrmont,
		radius : 500,
		types : [ 'store' ]
	};
	infowindow = new google.maps.InfoWindow();
	var service = new google.maps.places.PlacesService(map);
	service.nearbySearch(request, callback);
}

function callback(results, status) {
	if (status == google.maps.places.PlacesServiceStatus.OK) {
		for (var i = 0; i < results.length; i++) {
			createMarker(results[i]);
		}
	}
}

function createMarker(place) {
	var placeLoc = place.geometry.location;
	var marker = new google.maps.Marker({
		map : map,
		position : place.geometry.location
	});

	google.maps.event.addListener(marker, 'click', function() {
		infowindow.setContent(place.name);
		infowindow.open(map, this);
	});
}

google.maps.event.addDomListener(window, 'load', initialize);
