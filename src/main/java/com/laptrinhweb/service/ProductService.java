package com.laptrinhweb.service;

import com.laptrinhweb.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    public List<ProductEntity> getAll();
}
