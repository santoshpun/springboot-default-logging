package com.santosh.springbootdefaultlogging;

import com.santosh.springbootdefaultlogging.service.Rectangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(Starter.class);

    @Autowired
    private Rectangle rectangle;

    @Override
    public void run(String... args) throws Exception {
        log.debug("Starter run method called");
        rectangle.calculateArea(100, 100);
    }
}
