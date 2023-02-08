package artem.webchat.model;

import lombok.Data;

@Data
public class Chat {
    private String content;
    private String sender;
    private MessageType type;

    public enum MessageType {
        CHAT, JOIN, RENAME
    }

}