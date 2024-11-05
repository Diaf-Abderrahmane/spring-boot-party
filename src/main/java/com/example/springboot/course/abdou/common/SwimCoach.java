package com.example.springboot.course.abdou.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In Constructor : SwimCoach is being created");
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
