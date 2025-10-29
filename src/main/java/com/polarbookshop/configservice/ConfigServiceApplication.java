package com.polarbookshop.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: WangZhenqi
 * @Description: 在 Spring Boot 应用中启用配置服务器
 * @Date: Created in 2025-10-23 19:41
 * @Modified By:
 */
@SpringBootApplication
// 在 Spring Boot 应用中激活配置服务器的实现
@EnableConfigServer
public class ConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApplication.class, args);
    }

}
