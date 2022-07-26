package com.schedulerTest.dipanshu;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
    public class DipanshuApplication {

        public static void main(String[] args) {
		SpringApplication.run(DipanshuApplication.class, args);
        }


        @Bean
        TimedAspect timedAspect(MeterRegistry registry) {
            return new TimedAspect(registry);
        }
}
