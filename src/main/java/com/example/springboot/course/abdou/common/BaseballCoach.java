package com.example.springboot.course.abdou.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("Baseball Coach " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "This is the daily workout for the baseball coach.";
    }
}
