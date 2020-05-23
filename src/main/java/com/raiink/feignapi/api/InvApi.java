package com.raiink.feignapi.api;

import com.raiink.feignapi.api.hystrix.InvApiHystrix;
import com.raiink.feignapi.configure.FeignConfiguration;
import org.dromara.hmily.annotation.Hmily;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
    value = InvApi.inv_host_port, // spring.application.name
    path = InvApi.inv_context_path, // context-path
    configuration = FeignConfiguration.class,
    fallback = InvApiHystrix.class)
public interface InvApi {
  public final static String inv_host_port = "inv-service:8060";
  public final static String inv_context_path = "/inv";
  public final static String inv_feign = "/inv-feign";
  public final static String update_count_by_id_url = "/update-count/{goodNo}";
  public final static String pre_deduct_inv_url = "/pre-deduct-inv/{goodNo}/{preDeductCount}";

  @GetMapping(inv_feign+update_count_by_id_url) // class + method 上定义的完整路径
  Integer updateCountById(@PathVariable String goodNo);

  @Hmily
  @GetMapping(inv_feign+pre_deduct_inv_url)
  boolean preDeductInv(@PathVariable String goodNo, @PathVariable Integer preDeductCount);
}
