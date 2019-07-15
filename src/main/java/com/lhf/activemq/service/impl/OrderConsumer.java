package com.lhf.activemq.service.impl;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author liuhongfei
 * @since v1.0.0
 **/
@Component
public class OrderConsumer {

    /**
     * 监听指定消息队列
     *
     * @param text
     */
    @JmsListener(destination = "order.queue")
    public void receiveQueue(String text) {
        System.out.println("[ OrderConsumer收到的报文 : " + text + " ]");
    }
}
