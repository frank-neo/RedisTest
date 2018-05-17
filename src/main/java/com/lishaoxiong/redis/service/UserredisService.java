package com.lishaoxiong.redis.service;

import com.lishaoxiong.redis.entity.Userredis;
import com.lishaoxiong.redis.mapper.UserredisMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserredisService {

    @Resource
    private UserredisMapper userredisMapper;

    public List<Userredis> getRedisById(String id){
        return userredisMapper.getRedisById(id);
    }
}
