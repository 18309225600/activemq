package com.lhf.activemq.controller;

import com.lhf.activemq.service.ProducerService;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

/**
 * @author liuhongfei
 * @since v1.0.0
 **/
@RestController
public class OrderController {
    @Autowired
    private ProducerService producerService;

    @GetMapping("/order")
    private Object order(String msg) {
        Destination destination = new ActiveMQQueue("order.queue");
        producerService.sendMsg(destination,msg);
        return "order";
    }

    @GetMapping("/topic")
    private Object topic(String msg) {
        producerService.publish(msg);
        return "success";
    }
}
