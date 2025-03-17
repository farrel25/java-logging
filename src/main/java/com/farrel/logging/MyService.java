package com.farrel.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyService {

    private static final Logger log = LoggerFactory.getLogger(MyService.class);

    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void save(String requestId) {
        log.info("{} - MyService save", requestId);
        myRepository.save(requestId);
    }

    public void save() {
        log.info("MyService save");
        myRepository.save();
    }
}