package com.raiink.feignapi.dto.inv;

import com.raiink.feignapi.dto.BaseInfoDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @description: 商品库存数量，数据持久化对象
 * @author: hulei
 * @create: 2020-05-15 18:57:02
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GoodInvDto extends BaseInfoDto {

  private String id;

  private String factoryCode;

  private String goodNo;

  private String goodName;

  private Integer goodCount;

  private String unit;

  private Double goodInitPrice;

  private Double goodSalePrice;

  private String currency;
}
