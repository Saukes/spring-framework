package com.saukes.model;

import lombok.Data;

import java.util.Date;

@Data
public class BaseModel {
    //主键id
    private Integer id;

    //状态
    private Integer status;

    //版本
    private Integer version;

    //创建人
    private String createBy;

    //创建时间
    private Date createTime;

    //创建人
    private String updateBy;

    //创建时间
    private Date updateTime;

}
