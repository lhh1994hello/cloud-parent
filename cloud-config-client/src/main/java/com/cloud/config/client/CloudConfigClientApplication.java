package com.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class CloudConfigClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(CloudConfigClientApplication.class, args);
  }
}
