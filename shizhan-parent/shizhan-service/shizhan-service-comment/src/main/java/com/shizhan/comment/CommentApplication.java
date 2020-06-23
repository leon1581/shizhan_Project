package com.shizhan.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author:AlexLeon
 * @Date: 2020/6/22
 * @Package: com.shizhan.comment
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.shizhan.comment.dao")
public class CommentApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommentApplication.class, args);
    }
}
