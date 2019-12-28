package com.gmul.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DevSecurityApplication {
    private static ConfigurableApplicationContext configurableApplicationContext;

    public static ApplicationContext getApplicationContext() {
        return DevSecurityApplication.configurableApplicationContext;
    }

    public static void main(String[] args) {
        configurableApplicationContext = SpringApplication.run(DevSecurityApplication.class, args);
    }
}
