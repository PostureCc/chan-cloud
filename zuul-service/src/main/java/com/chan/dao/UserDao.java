package com.chan.dao;

import com.chan.model.po.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    UserPo findUserById(@Param("id") long id);

    List<UserPo> search(UserPo userPo);

}
