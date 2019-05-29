package com.chan.filter;

import com.netflix.zuul.ZuulFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyZuulFilter extends ZuulFilter {

    public String filterType() {
        return FilterConstants.ROUTE_TYPE;
    }

    public int filterOrder() {
        return 0;
    }

    public boolean shouldFilter() {
        log.info("Zuul Filter...");
        return true;
    }

    public Object run() {
        log.info("MyZuulFilter run...");
        return null;
    }
}
