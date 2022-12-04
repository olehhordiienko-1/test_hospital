package com.example.hospital.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    // our logging for method in controller
    @Before("execution(public String mainPage())")
    public void beforeExecutionWebAppAdvice() {
        System.out.println("[LOG] START OUR WEB APP WITH");
    }
}