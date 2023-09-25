package com.laptrinhweb.service.serviceImpl;

import com.laptrinhweb.entity.ProductEntity;
import com.laptrinhweb.repository.ProductRepo;
import com.laptrinhweb.service.ProductService;
import com.laptrinhweb.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo repo;
    @Autowired
    private RedisService redisService;
    @Override
    public List<ProductEntity> getAll() {
        if(!redisService.hasKey("products")){
            redisService.setValue("products",repo.findAll());
        }
        List<ProductEntity> list = (List<ProductEntity>) redisService.getValue("products");
        return list;
    }
}
