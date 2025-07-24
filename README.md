
# Marvellous Chat Application (Java TCP)

A simple client-server chat application using TCP sockets in Java.

---

## 📁 Files

- `ChatServer.java`: Java server code (waits for client, handles messages).
- `ChatClient.java`: Java client code (connects to server, sends/receives messages).

---

## 🚀 How to Run

### 1. Compile both programs:
```bash
javac ChatServer.java
javac ChatClient.java
```

### 2. Run Server (in one terminal):
```bash
java ChatServer
```

### 3. Run Client (in another terminal):
```bash
java ChatClient
```

---

## 🧪 Sample Interaction

**Server Output:**
```
Marvellous Server is waiting at port number 5100
Marvellous Server successfully connected with the client
----------------------------------------------------
Marvellous Chat Messenger is ready to use
----------------------------------------------------
Client says : Hello
Enter the message for client :
```

**Client Output:**
```
Marvellous Client is ready to connect with server
Marvellous Client is successfully connected with server
----------------------------------------------------
Marvellous Chat Messenger is ready to use
----------------------------------------------------
Enter message for server :
```

---

## ✅ Exit Chat
Type `end` to terminate the chat from either side.

---

## 📌 Requirements
- Java 8 or later
- Terminal / Command Prompt
