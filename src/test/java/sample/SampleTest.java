package sample;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleTest {

    private final Logger logger = LoggerFactory.getLogger(SampleTest.class);

    @Test
    void testSample() {
        logger.error("This is a sample test");
        logger.info("This is a sample test");
    }
}
