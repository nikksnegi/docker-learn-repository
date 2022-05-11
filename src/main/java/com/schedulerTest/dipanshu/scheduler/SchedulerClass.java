package com.schedulerTest.dipanshu.scheduler;

import com.schedulerTest.dipanshu.Service.DockerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("application")
public class SchedulerClass {

    private static final Logger log = LoggerFactory.getLogger(SchedulerClass.class);

    @Autowired
    DockerService service;
    /*
    This is a controller
     */
    @RequestMapping("/prometheus/run")
    String restController() {
        return service.returnFirstName() + service.returnLastName() ;
    }
}
