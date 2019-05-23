package dev.fs.home.favsb.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RequestTestController {
    @RequestMapping(value = "/test")
    public String testBoot(){
        return "test test";
    }


}
