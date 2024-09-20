package com.ujiuye;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.ujiuye.context.dao"})
@EnableDiscoveryClient
public class ContextApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContextApplication.class, args);
    }
}
