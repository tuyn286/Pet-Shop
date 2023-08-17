<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Chat</title>
    <script>
        var socket = new WebSocket("ws://localhost:8080/chat?role=user");

        socket.onmessage = function(event) {
            var message = event.data;
            // Hiển thị tin nhắn từ admin trên giao diện user
            displayMessage(message);
        };

        function sendMessage() {
            var message = document.getElementById("message").value;
            socket.send(message);
            // Hiển thị tin nhắn từ user trên giao diện user
            displayMessage("You: " + message);
        }
        function displayMessage(message) {
                    var messageDiv = document.createElement("div");
                    messageDiv.textContent = message;
                    document.getElementById("messages").appendChild(messageDiv);
                }
    </script>
</head>
<body>
    <h1>User Chat</h1>
    <div id="messages"></div>
    <input type="text" id="message" placeholder="Nhập tin nhắn">
    <button onclick="sendMessage()">Gửi</button>
</body>
</html>
