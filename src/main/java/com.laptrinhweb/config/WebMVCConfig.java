package com.laptrinhweb.config;

//import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@Log4j2
public class WebMVCConfig implements WebMvcConfigurer {

    public WebMVCConfig() {
        log.info("WebMVCConfig RUN!!!!!!!");
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
