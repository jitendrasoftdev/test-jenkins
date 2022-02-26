package com.jsd.testjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TestJenkinsApplication {

    public static Logger log = LoggerFactory.getLogger(TestJenkinsApplication.class);

    @PostConstruct
    public void init() {
        log.info("Application started ...");
    }
    public static void main(String[] args) {
        log.info("Application Executing  ...");
        SpringApplication.run(TestJenkinsApplication.class, args);
    }
}
