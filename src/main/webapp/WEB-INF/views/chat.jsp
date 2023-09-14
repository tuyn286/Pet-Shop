<!DOCTYPE html>
<html>
<head>
    <title>WebSocket Chat</title>
</head>
<body>
    <input type="text" id="message"/>
        <button id="send">Send</button>
        <div id="messages"></div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script>
            $(function() {
                var client = new WebSocket("ws://localhost:8080/chat");
                client.onopen = function() {
                    alert("Connection opened");
                };
                client.onmessage = function(event) {
                    $("#messages").append("<p>" + event.data + "</p>");
                };
                $("#send").on("click", function() {
                    var message = $("#message").val();
                    client.send(message);
                });
            });
        </script>
</body>
</html>
