package com.jsd.testjenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestJenkinsApplicationTests {

    public static Logger log = LoggerFactory.getLogger(TestJenkinsApplication.class);

    @Test
    void contextLoads() {
        log.info("Test case executing ... ");
        log.info("Test case executing  2nd Time  ... ");
        assertEquals(true, true);
    }

}
