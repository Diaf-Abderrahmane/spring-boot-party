package com.example.springboot.course.abdou.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// make it the primary coach ( default )
// @Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("Cricket Coach "+ getClass().getSimpleName());
    }

    // define out intit method
//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("Cricket Coach doMyStartupStuff");
//    }

    // define our destroy method
//    @PreDestroy
//    public void doMyShutdownStuff() {
//        System.out.println("Cricket Coach doMyShutdownStuff");
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice Fast bowling for 15 mins ";
    }
}
