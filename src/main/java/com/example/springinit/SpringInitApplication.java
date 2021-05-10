package com.example.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringInitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringInitApplication.class, args);
    }

}
