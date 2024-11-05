package com.example.springboot.course.abdou.config;

import com.example.springboot.course.abdou.common.Coach;
import com.example.springboot.course.abdou.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
