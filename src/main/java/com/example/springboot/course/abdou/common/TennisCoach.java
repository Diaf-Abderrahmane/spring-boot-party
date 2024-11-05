package com.example.springboot.course.abdou.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("TennisCoach "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "This is the daily workout for the tennis coach";
    }
}
