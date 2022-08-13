package com.example.demo.service;

import com.example.demo.annotation.ReportingAnnotation;
import com.example.demo.intefaces.TestRabbitMq;
import org.springframework.stereotype.Service;

@Service
public class TestRabbitMqImpl implements TestRabbitMq {


    @ReportingAnnotation
    @Override
    public void donothing() {

    }
}
