package com.chan.service;

import com.chan.dao.UserDao;
import com.chan.model.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserVo findUserById(long userId) {
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(userDao.findUserById(userId), userVo);
        return userVo;
    }

}
