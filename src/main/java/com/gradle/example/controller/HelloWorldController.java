package com.gradle.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dxjm on 2018/5/5.
 */


@Controller
public class HelloWorldController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping("/hello")
    public String hw(){
        LOGGER.info("enter hello...");
        LOGGER.debug("enter hello...");
        LOGGER.error("enter hello");
        LOGGER.warn("enter hello...");
        return "hello";
    }

}
