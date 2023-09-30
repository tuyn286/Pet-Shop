package com.laptrinhweb.service.serviceImpl;

import com.laptrinhweb.Dto.CategoryDto;
import com.laptrinhweb.Dto.ProductDto;
import com.laptrinhweb.entity.ProductEntity;
import com.laptrinhweb.repository.CategoryRepository;
import com.laptrinhweb.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;
    @Override
    public List<CategoryDto> getAll() {
        var categories=categoryRepository.findAll();
        return categories.stream().map(categoryEntity -> modelMapper.map(categoryEntity,CategoryDto.class)).toList();
    }


}
