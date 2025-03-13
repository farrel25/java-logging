package com.farrel.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {

    private static Logger log = LoggerFactory.getLogger(MainTest.class);

    @Test
    void testLog() {
        System.out.println("Welcome to log");
        log.info("Welcome to log");
    }
}
