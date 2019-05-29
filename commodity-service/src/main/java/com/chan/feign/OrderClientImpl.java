package com.chan.feign;

import org.springframework.stereotype.Component;

@Component
public class OrderClientImpl implements OrderClient {

    public String orderTest(String value) {
        return "hystrix orderTest...";
    }

}
