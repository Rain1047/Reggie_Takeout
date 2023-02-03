package com.ali.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类
@Slf4j
@SpringBootApplication
public class ReggieApplication {
        public static void main(String[] args){
            SpringApplication.run(ReggieApplication.class, args);
            log.info("project build success!");
        }
    }

