package com.raiink.feignapi.api.hystrix;
import com.raiink.feignapi.api.InvApi;

/**
 * @description: 库存服务熔断实现
 * @author: hulei
 * @create: 2020-05-18 10:18:46
 */
public class InvApiHystrix implements InvApi {
  @Override
  public Integer updateCountById(String goodNo) {
    return null;
  }

  @Override
  public boolean preDeductInv(String goodNo, Integer preDeductCount) {
    return false;
  }
}
