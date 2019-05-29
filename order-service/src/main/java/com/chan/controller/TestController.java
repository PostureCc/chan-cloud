package com.chan.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/order/{value}", method = RequestMethod.GET)
    public String order(@PathVariable String value) {
        return value;
    }

//    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)

    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("key1", "value1");
        json.put("key2", null);
        System.out.println(json);

        if(json.containsKey("key2")){
            json.put("key2", "");
        }
        System.out.println(json);
    }

}
