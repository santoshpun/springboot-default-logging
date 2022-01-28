package com.santosh.springbootdefaultlogging.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class Rectangle {
    private static final Logger log = LoggerFactory.getLogger(Rectangle.class);

    public void calculateArea(int length, int width) {
        int area = length * width;
        log.debug("Area of rectangle is {}", area);
    }
}
