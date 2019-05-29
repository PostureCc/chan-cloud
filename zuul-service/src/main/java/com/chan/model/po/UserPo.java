package com.chan.model.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
public class UserPo implements Serializable{

    private long id;
    private String name;
    private int age;
    private Date createTime;

}
