package com.chan.controller;

import com.chan.model.vo.UserVo;
import com.chan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findUserById/{userId}", method = RequestMethod.GET)
    public UserVo findUserById(@PathVariable long userId) {
        return userService.findUserById(userId);
    }

}
