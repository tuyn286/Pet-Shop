package com.laptrinhweb.service.serviceImpl;

import com.laptrinhweb.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisServiceImpl implements RedisService {
    @Autowired
    private RedisTemplate template;


    @Override
    public void setValue(String key, Object value) {
        if(!template.hasKey(key)){
            template.opsForValue().set(key,value);
        }
    }

    @Override
    public Object getValue(String key) {
        return template.opsForValue().get(key);
    }
}
