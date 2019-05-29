package com.chan.model.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVo implements Serializable{

    private long id;

    private String name;

    private int age;

}
