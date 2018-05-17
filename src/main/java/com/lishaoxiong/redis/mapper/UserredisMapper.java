package com.lishaoxiong.redis.mapper;

import com.lishaoxiong.redis.entity.Userredis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Mapper
//有时候一个类中可能会有多个缓存操作，而这些缓存操作可能是重复的。这个时候可以使用@CacheConfig
//@CacheConfig是一个类级别的注解，允许共享缓存的名称、KeyGenerator、CacheManager 和CacheResolver。
//该操作会被覆盖。
@CacheConfig(cacheNames = "userredis")
public interface UserredisMapper {

    @Select("select name,age from userredis where id > #{id}")

    @Cacheable(key ="#p0")
    public List<Userredis> getRedisById(String id);

}
