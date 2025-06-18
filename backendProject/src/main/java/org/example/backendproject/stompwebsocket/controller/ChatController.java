package org.example.backendproject.stompwebsocket.controller;

import lombok.RequiredArgsConstructor;
import org.example.backendproject.stompwebsocket.dto.ChatMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ChatController {

    // 단일 브로드캐스트 (동적으로 방 생성이 안 됨)
//    @MessageMapping("/chat.sendMessage")
//    @SendTo("/topic/public")
//    public ChatMessage sendMessage(ChatMessage message) {
//        return message;
//    }

    @Value("${PROJECT_NAME:web Server}")
    private String instanceName;

    // 서버가 클라이언트에게 수동으로 메세지를 보낼 수 있도록 하는 클래스
    private final SimpMessagingTemplate template;

    // 동적으로 방 생성 가능
    @MessageMapping("/chat.sendMessage")
    public void sendMessage(ChatMessage message) {

        message.setMessage(instanceName + " " + message.getMessage());

        if (message.getTo() != null && !message.getTo().isEmpty()) {
            // 귓속말
            // 내 아이디로 귓속말 경로를 활성화 함
            template.convertAndSendToUser(message.getTo(), "/queue/private", message);
        } else {
            // 일반 메시지
            // message에서 roomId를 추출해서 해당 roomId를 구독하고 있는 클라이언트에게 메세지를 전달
            template.convertAndSend("/topic/" + message.getRoomId(), message);
        }
    }

}
