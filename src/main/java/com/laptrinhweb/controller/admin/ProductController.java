package com.laptrinhweb.controller.admin;

import com.laptrinhweb.Dto.ProductDto;
import com.laptrinhweb.controller.controllerImpl.BaseHomeController;
import com.laptrinhweb.service.CategoryService;
import com.laptrinhweb.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/admin/products")
@Controller
@RequiredArgsConstructor
public class ProductController extends BaseHomeController {
    private final CategoryService categoryService;
    private final ProductService productService;
    @GetMapping({"/",""})
    public ModelAndView goAdd(){
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
    @RequestMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable int id){
        modelAndView.setView(new RedirectView("/admin/tables"));
        productService.deleteById(id);
        return modelAndView;
    }


}
