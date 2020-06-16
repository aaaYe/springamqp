package com.demo.springamqp.producer;

import com.demo.springamqp.config.RabbitConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public String send() {
        return rabbitTemplate.convertSendAndReceive(RabbitConfig.EXCHANGE_A,RabbitConfig.ROUTINGKEY_A,"test rabbitmq message !!!").toString();
    }
}
