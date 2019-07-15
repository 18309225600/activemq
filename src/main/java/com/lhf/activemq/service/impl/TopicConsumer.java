package com.lhf.activemq.service.impl;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author liuhongfei
 * @since v1.0.0
 **/
@Component
public class TopicConsumer {

    @JmsListener(destination = "demo.topic", containerFactory = "jmsListenerContainerTopic")
    public void receiver1(String text) {
        System.out.println("TopicConsumer : receiver1 : " + text);
    }

    @JmsListener(destination = "demo.topic", containerFactory = "jmsListenerContainerTopic")
    public void receiver2(String text) {
        System.out.println("TopicConsumer : receiver2 : " + text);
    }

    @JmsListener(destination = "demo.topic", containerFactory = "jmsListenerContainerTopic")
    public void receiver3(String text) {
        System.out.println("TopicConsumer : receiver3 : " + text);
    }
}
