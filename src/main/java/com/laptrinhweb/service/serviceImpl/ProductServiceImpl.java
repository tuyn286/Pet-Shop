package com.laptrinhweb.service.serviceImpl;

import com.laptrinhweb.Dto.ProductDto;
import com.laptrinhweb.entity.ProductEntity;
import com.laptrinhweb.repository.ProductRepo;
import com.laptrinhweb.service.ProductService;
import com.laptrinhweb.service.RedisService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo repo;
    @Autowired
    private RedisService redisService;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<ProductEntity> getAll() {
        if(!redisService.hasKey("products")){
            redisService.setValue("products",repo.findAll());
        }
        List<ProductEntity> list = (List<ProductEntity>) redisService.getValue("products");
        return list;
    }

    @Override
    public List<ProductDto> getProducts() {
        return repo.findAll().stream().map(productEntity -> modelMapper.map(productEntity, ProductDto.class)).toList();
    }
}
