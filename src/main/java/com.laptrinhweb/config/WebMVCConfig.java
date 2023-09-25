package com.laptrinhweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMVCConfig implements WebMvcConfigurer {

    public WebMVCConfig() {

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**")
                .addResourceLocations(
                        "/WEB-INF/views/assets/",
                        "classpath:/static/assets/",
                        "/WEB-INF/views/admin/page/assets/");
    }

}
