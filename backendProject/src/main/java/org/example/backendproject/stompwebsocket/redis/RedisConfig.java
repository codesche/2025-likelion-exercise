package org.example.backendproject.stompwebsocket.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

@RequiredArgsConstructor
@Configuration
public class RedisConfig {

    private final RedisSubscriber redisSubscriber;

    @Bean
    public RedisMessageListenerContainer container(RedisConnectionFactory redisConnectionFactory) {
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(redisConnectionFactory);

        container.addMessageListener(new MessageListenerAdapter(redisSubscriber), new PatternTopic("room.*"));
        container.addMessageListener(new MessageListenerAdapter(redisSubscriber), new PatternTopic("private.*"));       // 귓속말

        return container;
    }

}
