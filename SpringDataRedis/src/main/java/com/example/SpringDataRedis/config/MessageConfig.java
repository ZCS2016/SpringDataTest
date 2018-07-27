package com.example.SpringDataRedis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

@Configuration
public class MessageConfig {
    @Autowired
    private RedisConnectionFactory connectionFactory;

    @Bean
    public MessageListener printMessageListener(){
        return new MessageListener() {
            @Override
            public void onMessage(Message message, byte[] pattern) {
                System.out.println(new String(message.getBody()));
            }
        };
    }

    @Bean
    public RedisMessageListenerContainer messageListenerContainer(MessageListener printMessageListener){
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.addMessageListener(printMessageListener,new ChannelTopic("channel1"));
        return container;
    }
}
