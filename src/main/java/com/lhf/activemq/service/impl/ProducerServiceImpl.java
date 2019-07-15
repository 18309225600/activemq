package com.lhf.activemq.service.impl;

import com.lhf.activemq.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.Topic;

/**
 * @author liuhongfei
 * @since v1.0.0
 **/
@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Topic topic;

    @Override
    public void sendMsg(Destination destination, String message) {
        jmsMessagingTemplate.convertAndSend(destination,message);
    }



    @Override
    public void publish(String msg) {
        jmsMessagingTemplate.convertAndSend(topic, msg);
    }
}
