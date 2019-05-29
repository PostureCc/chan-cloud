package com.chan.controller;

import com.chan.feign.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private OrderClient orderClient;

    @RequestMapping(value = "/commodity/{value}", method = RequestMethod.GET)
    public String commodity(@PathVariable String value) {
        return value;
    }

    @RequestMapping(value = "/orderFeign/{value}", method = RequestMethod.GET)
    public String orderFeign(@PathVariable String value) {
        return orderClient.orderTest(value);
    }

}
