package org.example.backendproject.purewebsocket.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.example.backendproject.purewebsocket.dto.ChatMessage;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class ChatWebSocketHandler extends TextWebSocketHandler {
    // 동시성 문제를 해결 - 서버에 여러 클라이언트 접속 시에 발생할 수 있는 데이터 손실 고려
    private final Set<WebSocketSession> sessions = Collections.synchronizedSet(new HashSet<>());

    // json 문자열 <-> 자바 객체로 변환
    private final ObjectMapper objectMapper = new ObjectMapper();

    // 방과 방 안에 있는 세션을 관리하는 객체
    private final Map<String, Set<WebSocketSession>> rooms = new ConcurrentHashMap<>();


    // 클라이언트가 보낸 메세지를 서버가 받았을 때 호출
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message)
        throws Exception {
        super.handleTextMessage(session, message);

        // json 문자열 -> 자바 객체
        ChatMessage chatMessage = objectMapper.readValue(message.getPayload(), ChatMessage.class);

        String roomId = chatMessage.getRoomId();    // 클라이언트에게 받은 메세지에서 roomID를 추출

        if (!rooms.containsKey(roomId)) {   // 방을 관리하는 객체에 현재 세션이 들어가는 방이 있는지 확인
            rooms.put(roomId, ConcurrentHashMap.newKeySet()); // 없으면 새로운 방을 생성
        }
        rooms.get(roomId).add(session);                     // 방이 있으면 해당 방에 세션 추가

        // 들어온 메세지를 반복문으로 처리
        for (WebSocketSession s : rooms.get(roomId)) {
//        for (WebSocketSession s : sessions) {
            if (s.isOpen()) {
                // 자바 객체 -> json 문자열
                s.sendMessage(new TextMessage(objectMapper.writeValueAsString(chatMessage)));

                System.out.println("전송된 메세지 = " + chatMessage.getMessage());
            }
        }
    }

    // 클라이언트가 웹 소켓 서버에 접속했을 때 호출
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        super.afterConnectionEstablished(session);
        sessions.add(session);      // 연결된 클라이언트 저장
        System.out.println("접속된 클라이언트 세션 ID = " + session.getId());
    }

    // 클라이언트가 연결이 끊어졌을 때 호출
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status)
        throws Exception {
        super.afterConnectionClosed(session, status);

        sessions.remove(session);

        // 연결이 해제되면 소속되어 있는 방에서 제거
        for (Set<WebSocketSession> room : rooms.values()) {
            room.remove(session);
        }

    }

}
