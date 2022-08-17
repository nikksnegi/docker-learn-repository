package com.schedulerTest.dipanshu.Controller;


import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// in main file 

@RestController
public class RequestController {

    @RequestMapping("/get/poem")
    @Timed(value = "poem.api.monitoring", description = "This function is prometheous monitored")
    String getDescription()  {
         return "Heyyy ! \n Jo bhara nahi hai bhavo se, \n behti jismain rasdhaar nahi , \n Vo hridaya nahi hai pathar hai, \n jismain swadesh ka pyar nahi " ;
    }

}
