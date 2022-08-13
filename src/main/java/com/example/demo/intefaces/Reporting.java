package com.example.demo.intefaces;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;

import java.lang.reflect.InvocationTargetException;

public interface Reporting {

    @After("@annotation(com.example.demo.annotation.ReportingAnnotation) && execution(* *(..))")
    void sendReportAfterReturning(JoinPoint joinPoint) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;
}
