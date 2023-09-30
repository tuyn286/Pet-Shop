package com.laptrinhweb.service;

import com.laptrinhweb.Dto.CategoryDto;
import com.laptrinhweb.Dto.ProductDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAll();


}
