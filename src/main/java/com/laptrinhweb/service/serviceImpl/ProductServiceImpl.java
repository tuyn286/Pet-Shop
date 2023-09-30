package com.laptrinhweb.service.serviceImpl;

import com.laptrinhweb.Dto.ProductDto;
import com.laptrinhweb.entity.ProductEntity;
import com.laptrinhweb.repository.CategoryRepository;
import com.laptrinhweb.repository.ProductRepo;
import com.laptrinhweb.service.ProductService;
import com.laptrinhweb.service.RedisService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo repo;
    @Autowired
    private RedisService redisService;

    @Autowired
    private CategoryRepository categoryRepository;
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

    @Override
    public void create(ProductDto productDto, MultipartFile file,HttpServletRequest request) {
        ProductEntity productEntity=modelMapper.map(productDto,ProductEntity.class);
        productEntity.setCategoryEntity(categoryRepository.getReferenceById(Integer.valueOf(productDto.getCategoryEntityCategoryId())));
        String imgUrl=saveImg(file,request);
        productEntity.setImage(imgUrl);
        double randomNumber = Math.random();
        int min = 1;
        int max = 100;
        int randomInt = (int) (randomNumber * (max - min + 1)) + min;
        productEntity.setProductId(randomInt);
        repo.save(productEntity);
    }

    private String saveImg(MultipartFile file, HttpServletRequest request){
        String name = null;
        // Thư mục gốc upload file.
        String uploadRootPath = request.getServletContext().getRealPath("/WEB-INF/views/assets/img/product");
//		String uploadRootPath = new File("src/main/resource/assets/images/").getAbsolutePath();
//        System.out.println("uploadRootPath=" + uploadRootPath);

        File uploadRootDir = new File(uploadRootPath);

        // Tạo thư mục gốc upload nếu nó không tồn tại.
        if (!uploadRootDir.exists()) {
            uploadRootDir.mkdirs();
        }

        try {
            // Lấy tên file gốc.
            String fileName = file.getOriginalFilename();
            System.out.println("Client File Name = " + fileName);

            if (fileName != null && fileName.length() > 0) {
                // Tạo file tại Server.
                File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + fileName);

                // Ghi file vào folder trên server.
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(file.getBytes());
                stream.close();
                System.out.println("Write file: " + serverFile);
                name = fileName;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return name;
    }

}
