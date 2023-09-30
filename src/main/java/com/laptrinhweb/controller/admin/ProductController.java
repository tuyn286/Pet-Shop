package com.laptrinhweb.controller.admin;

import com.laptrinhweb.Dto.ProductDto;
import com.laptrinhweb.service.CategoryService;
import com.laptrinhweb.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/admin/products")
@Controller
@RequiredArgsConstructor
public class ProductController {
    private final CategoryService categoryService;
    private final ProductService productService;
    @GetMapping({"/",""})
    public ModelAndView goAdd(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("categoryList",categoryService.getAll());
        modelAndView.setViewName("/admin/page/additionalProduct");
        return modelAndView;
    }
    @PostMapping({"/",""})
    public ModelAndView add(HttpServletRequest request, @RequestParam(name = "name") String name ,
                            @RequestParam(name = "date") String date,
                            @RequestParam(name ="idCategory") Long id,
                            @RequestParam(name = "quantity") Integer quantity,
                            @RequestParam(name="price") String price,
                            @RequestParam(name = "file") MultipartFile file){
        ProductDto productDto=ProductDto.builder()
                .productName(name)
                .categoryEntityCategoryId(String.valueOf(id))
                .price(Double.valueOf(price))
                .quantity(quantity)
                .build();
        productService.create(productDto, file,request);

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/admin/page/additionalProduct");
        return modelAndView;
    }


}
