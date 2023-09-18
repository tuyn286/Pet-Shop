package com.laptrinhweb.service;

import com.laptrinhweb.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserEntity> getAll();
}
