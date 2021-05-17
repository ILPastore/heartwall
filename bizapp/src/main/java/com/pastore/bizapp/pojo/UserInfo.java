package com.pastore.bizapp.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class UserInfo {

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 登录时间
     */
    private Date time;
}
