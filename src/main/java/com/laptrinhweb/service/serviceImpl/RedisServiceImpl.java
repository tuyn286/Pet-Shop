package com.laptrinhweb.service.serviceImpl;

import com.laptrinhweb.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
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

    @Override
    public boolean hasKey(String key) {
        if(template.hasKey(key))
            return true;
        else
            return false;
    }

    @Override
    public void removeKey(String key) {
        template.delete(key);
    }
}
