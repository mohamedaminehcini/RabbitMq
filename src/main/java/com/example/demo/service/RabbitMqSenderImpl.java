package com.example.demo.service;

import com.example.demo.intefaces.RabbitMqSender;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqSenderImpl implements RabbitMqSender {

    @Autowired
    RabbitTemplate rabbitTemplate;



    @Override
    public void sendMessage() {

        rabbitTemplate.convertAndSend("myQueue", "Hello, world!");
    }
}
