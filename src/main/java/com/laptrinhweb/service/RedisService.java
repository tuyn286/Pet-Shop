package com.laptrinhweb.service;

import org.springframework.stereotype.Service;


public interface RedisService {
    public void setValue(String key, Object value);

    public Object getValue(String key);

    public boolean hasKey(String key);

    public void removeKey(String key);

}
