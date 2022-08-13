package com.example.demo.service;

import com.example.demo.intefaces.RabbitMqReader;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqReaderImpl {

    @RabbitListener(queues = "myQueue1")
    public void listen1(String in) {
        System.out.println("Message read from myQueue1 : " + in);
    }

    @RabbitListener(queues = "myQueue2")
    public void listen2(String in) {
        System.out.println("Message read from myQueue2 : " + in);
    }

}
