package org.example.backendproject.stompwebsocket.handler;

import java.security.Principal;
import java.util.Map;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

public class CustomHandshakeHandler extends DefaultHandshakeHandler {

    @Override
    protected Principal determineUser(ServerHttpRequest request,
                                    WebSocketHandler wsHandler,
                                    Map<String, Object> attributes) {

        String nickname = getNickName(request.getURI().getQuery());
        return new StompPrincipal(nickname);
    }

    private String getNickName(String query) {
        if (query == null || !query.contains("nickname=")) {
            return "닉네임없음";
        } else {
            return query.split("nicknames=")[1];
        }
    }

}
