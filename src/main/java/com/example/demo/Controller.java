package com.example.demo;


import com.example.demo.intefaces.RabbitMqSender;
import com.example.demo.intefaces.TestRabbitMq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {



    @Autowired
    TestRabbitMq testRabbitMq;


    @PostMapping("/Write")
    public void write() {
        testRabbitMq.donothing();
    }
}
