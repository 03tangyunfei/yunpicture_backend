package com.tyf.yunpicturebacked;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.tyf.yunpicturebacked.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class YunPictureBackedApplication {

    public static void main(String[] args) {
        SpringApplication.run(YunPictureBackedApplication.class, args);
    }

}
