package com.lhf.activemq.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Topic;

/**
 * @author liuhongfei
 * @since v1.0.0
 **/
@Configuration
public class TopicBean {

    @Bean
    public Topic topic() {
        return new ActiveMQTopic("demo.topic");
    }
}
