var stompClient = null;

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
    $("#vehicules").html("");
}

function connect() {
    var socket = new SockJS('/vehiculeSubscribe');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/vehicules', function (vehicules) {
            showVehicules(JSON.parse(vehicules.body));
        });
    });
}

function disconnect() {
    if (stompClient != null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendName() {
    stompClient.send("/app/ws", {}, JSON.stringify({'immat': $("#name").val()}));
}

function showVehicules(vehicules) {
	$("#vehicules").empty();
	
	for (i in vehicules) {
	    $("#vehicules").append("<tr><td>" + vehicules[i].immat + "</td></tr>");
	}
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#send" ).click(function() { sendName(); });
});