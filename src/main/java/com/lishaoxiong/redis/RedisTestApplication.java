package com.lishaoxiong.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//计划任务
@EnableScheduling
//开启缓存功能
@EnableCaching
public class RedisTestApplication {

    //入口
    public static void main(String[] args) {
        //这个LingFengApplication就是你启动类的名字
        SpringApplication.run(RedisTestApplication.class, args);
    }
}
