package com.saukes.bean;

import com.saukes.model.BaseModel;
import lombok.Data;

@Data
public class Employee extends BaseModel {

    private Integer deptId;

    private String name;

    private String position;

    private String email;

    private Double salary;

    private String gender;

    private Department department;

}
