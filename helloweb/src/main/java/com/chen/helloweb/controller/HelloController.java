package com.chen.helloweb.controller;


import com.netflix.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static Logger log= LoggerFactory.getLogger(HelloController.class);


//    @Autowired
//    private DiscoveryClient client;


    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }
}
