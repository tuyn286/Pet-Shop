package com.laptrinhweb.service;

public interface RedisService {
    public void setValue(String key, Object value);

    public Object getValue(String key);

}
