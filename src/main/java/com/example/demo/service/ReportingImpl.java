package com.example.demo.service;

import com.example.demo.intefaces.Reporting;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Aspect
@Service
public class ReportingImpl implements Reporting {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Override
    public void sendReportAfterReturning(JoinPoint joinPoint) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        rabbitTemplate.convertAndSend("myQueue1", "Hello, world from myQueue1!");
        rabbitTemplate.convertAndSend("myQueue2", "Hello, world from myQueue2!");
    }
}
