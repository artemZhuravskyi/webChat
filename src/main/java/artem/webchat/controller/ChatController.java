package artem.webchat.controller;

import artem.webchat.model.Chat;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.register")
    @SendTo("/topic/public")
    public Chat register(@Payload Chat chat) {
        return chat;
    }

    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public Chat sendMessage(@Payload Chat chat) {
        return chat;
    }

    @MessageMapping("/chat.rename")
    @SendTo("/topic/public")
    public Chat changeName(@Payload Chat chat) {
        return chat;
    }
}
