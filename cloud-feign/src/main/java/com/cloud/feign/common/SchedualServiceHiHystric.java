package com.cloud.feign.common;

import com.cloud.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author lihonghui
 * @Date 2019/12/26 19:13
 * @Description
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

  @Override
  public String sayHiFromClientOne(String name) {
    return "sorry " + name;
  }
}
