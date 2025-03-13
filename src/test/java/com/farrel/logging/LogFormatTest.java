package com.farrel.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFormatTest {

    private static Logger log = LoggerFactory.getLogger(LogFormatTest.class);

    @Test
    void testLogFormat() {
        log.info("Without Parameter");
        log.info("{} + {} = {}", 10, 5, 15);
        log.error("Oops", new NullPointerException());
    }
}
