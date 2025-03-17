package com.farrel.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyController {

    private static final Logger log = LoggerFactory.getLogger(MyController.class);

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    public void save(String requestId) {
        log.info("{} - MyController save", requestId);
        myService.save(requestId);
    }

    public void save() {
        log.info("MyController save");
        myService.save();
    }
}
