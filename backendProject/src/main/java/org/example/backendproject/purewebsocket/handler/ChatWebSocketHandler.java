package org.example.backendproject.purewebsocket.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class ChatWebSocketHandler extends TextWebSocketHandler {
    // 동시성 문제를 해결 - 서버에 여러 클라이언트 접속 시에 발생할 수 있는 데이터 손실 고려
    private final Set<WebSocketSession> sessions = Collections.synchronizedSet(new HashSet<>());

    // json 문자열 -> 자바 객체로 변환
    private final ObjectMapper objectMapper = new ObjectMapper();

    // 클라이언트가 웹 소켓 서버에 접속했을 때 호출
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message)
        throws Exception {
        super.handleTextMessage(session, message);
        sessions.add(session);      // 연결된 클라이언트 저장
        System.out.println("접속된 클라이언트 세션 ID = " + session.getId());
    }

    // 클라이언트가 보낸 메세지를 서버가 받았을 때 호출
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        super.afterConnectionEstablished(session);


    }

    // 클라이언트가 연결이 끊어졌을 때 호출
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status)
        throws Exception {
        super.afterConnectionClosed(session, status);
    }

}
