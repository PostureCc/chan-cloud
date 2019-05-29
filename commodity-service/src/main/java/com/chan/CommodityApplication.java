package com.chan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@ServletComponentScan
@SpringBootApplication
public class CommodityApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CommodityApplication.class).run(args);
    }

}
