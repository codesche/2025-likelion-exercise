package org.example.backendproject.stompwebsocket.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class RedisPublisher {

    private final StringRedisTemplate stringRedisTemplate;
    /** 메세지를 발행하는 클래스 **/
    public void publish(String channel, String msg) {
        stringRedisTemplate.convertAndSend(channel, msg);
    }

}
