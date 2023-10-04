package com.laptrinhweb.service;

import com.laptrinhweb.Dto.ProductDto;
import com.laptrinhweb.entity.ProductEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface ProductService {
    public List<ProductEntity> getAll();

    public List<ProductDto> getProducts();

    void create(ProductDto productDto, MultipartFile file, HttpServletRequest request);

    void deleteById(int id);
}
