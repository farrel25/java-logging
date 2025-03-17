package com.farrel.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

public class MyTest {

    @Test
    void testRequestId() {
        String requestId = UUID.randomUUID().toString();

        MDC.put("requestId", requestId);

        MyRepository myRepository = new MyRepository();
        MyService myService = new MyService(myRepository);
        MyController myController = new MyController(myService);

        //myController.save(requestId);
        myController.save();

        MDC.remove("requestId");
        //MDC.clear();
    }

    @Test
    void testRequestIdNotShownInMultiThread() {
        String requestId = UUID.randomUUID().toString();

        MDC.put("requestId", requestId);

        MyRepository myRepository = new MyRepository();
        MyService myService = new MyService(myRepository);
        MyController myController = new MyController(myService);

        new Thread(myController::save).start();

        MDC.remove("requestId");
    }

    @Test
    void testRequestIdMultiThread() throws InterruptedException {

        MyRepository myRepository = new MyRepository();
        MyService myService = new MyService(myRepository);
        MyController myController = new MyController(myService);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                String requestId = UUID.randomUUID().toString();
                MDC.put("requestId", requestId);

                myController.save();

                MDC.remove("requestId");
            }).start();
        }

        Thread.sleep(1000L);
    }
}
