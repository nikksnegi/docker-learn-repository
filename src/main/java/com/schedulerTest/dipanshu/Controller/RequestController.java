package com.schedulerTest.dipanshu.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @RequestMapping("/get/desc")
    String getDescription()  {

         return "I am very great guy " ;
    }

}
