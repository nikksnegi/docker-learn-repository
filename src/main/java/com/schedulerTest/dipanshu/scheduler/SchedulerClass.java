package com.schedulerTest.dipanshu.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;


@RestController
@RequestMapping("application")
public class SchedulerClass {

    private static final Logger log = LoggerFactory.getLogger(SchedulerClass.class);

    @RequestMapping("/prometheus/run")
    String restController( ) {
        return "I am great and I know it ";
    }
}
