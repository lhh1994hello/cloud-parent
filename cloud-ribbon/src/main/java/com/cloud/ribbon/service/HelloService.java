package com.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author lihonghui
 * @Date 2019/12/26 12:25
 * @Description
 */
@Service
public class HelloService {
  @Autowired
  RestTemplate restTemplate;

  @HystrixCommand(fallbackMethod = "hiError")
  public String hiService(String name) {
    return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
  }

  public String hiError(String name) {
    return "hi," + name + ",sorry,error!";
  }
}
