package com.raiink.feignapi.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data // 父类必须提供set，get方法；或者属性定义为public；否则子类不能访问父类的任何属性
public class BaseInfoDto implements Serializable {

  private String createBy;

  private Date createTime;

  private String updateBy;

  private Date updateTime;
}
