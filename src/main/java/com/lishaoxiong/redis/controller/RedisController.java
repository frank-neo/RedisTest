package com.lishaoxiong.redis.controller;

import com.lishaoxiong.redis.entity.Userredis;
import com.lishaoxiong.redis.service.UserredisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class RedisController {

    @Autowired
    private UserredisService userredisService;

    @RequestMapping(value = "/testRedis",method = RequestMethod.GET)
    public List<Userredis> getRedisById(int id){
        return userredisService.getRedisById(id);
    }
}

