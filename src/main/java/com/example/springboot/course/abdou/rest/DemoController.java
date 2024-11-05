package com.example.springboot.course.abdou.rest;
import com.example.springboot.course.abdou.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // CONSTRUCTOR INJECTION
    // define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach coach,
            @Qualifier("cricketCoach") Coach theAnotherCoach) {
        myCoach = coach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans : myCoach == antotherCoach is " + (myCoach == anotherCoach);
    }

    // Get Method
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    // SETTER METHOD
//    @Autowired
//    public void setMyCoach(Coach coach) {
//        myCoach = coach;
//    }

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // endpoint using properties injected
    @GetMapping("/teaminfo")
    public String getTeamName() {
        return "Coach : " + coachName + ", Team : " + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // expose a new endpoint for fortune
    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day";
    }

}
