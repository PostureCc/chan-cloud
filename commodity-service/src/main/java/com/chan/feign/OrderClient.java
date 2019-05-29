package com.chan.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "order-service/order", fallback = OrderClientImpl.class)
public interface OrderClient {

    @RequestMapping(value = "/order/{value}", method = RequestMethod.GET)
    String orderTest(@PathVariable("value") String value);

}
