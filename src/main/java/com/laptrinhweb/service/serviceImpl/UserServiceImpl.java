package com.laptrinhweb.service.serviceImpl;

import com.laptrinhweb.entity.UserEntity;
import com.laptrinhweb.repository.UserRepo;
import com.laptrinhweb.service.RedisService;
import com.laptrinhweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo repo;

    @Autowired
    private RedisService redisService;

    @Override
    public List<UserEntity> getAll() {
        if(!redisService.hasKey("users")){
            redisService.setValue("users",repo.findAll());
        }
        List<UserEntity> list = (List<UserEntity>) redisService.getValue("users");
        return list;
    }
}
