package com.demo.springamqp.consumer;

import com.demo.springamqp.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitConfig.QUEUE_A)
public class Receiver {

    @RabbitHandler
    public String process(String msg) {
        return "receive msg : " + msg;
    }
}
