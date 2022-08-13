package com.example.demo.configuration;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfiguration {

    @Bean
    Queue createmyQueue1(){
        return new Queue("myQueue1", false);
    }
    @Bean
    Queue createmyQueue2(){
        return new Queue("myQueue2", false);
    }
}
