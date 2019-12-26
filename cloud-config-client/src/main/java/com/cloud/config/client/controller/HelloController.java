package com.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lihonghui
 * @Date 2019/12/26 19:31
 * @Description
 */
@RestController
public class HelloController {
  @Value("${foo}")
  String foo;
  @RequestMapping(value = "/hi")
  public String hi(){
    return foo;
  }
}
