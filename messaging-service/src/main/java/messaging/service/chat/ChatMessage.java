package messaging.service.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
public class ChatMessage {
    @JsonProperty("content")
    private String content;

    @JsonProperty("sender")
    private String sender;
    //private MessageType type;

    public ChatMessage() {}

    public ChatMessage(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    // Getters and Setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
    @Override
    public String toString() {
        return "ChatMessage{" +
                "content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                '}';
    }
}
