package SS11.bai3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    private String sender;
    private String content;
    private LocalDateTime timestamp;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    public void display(){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        System.out.println("["+timestamp.format(formatter)+"]"+sender+":"+content);
    }
}
