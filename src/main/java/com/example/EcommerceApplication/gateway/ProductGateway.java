package com.example.EcommerceApplication.gateway;

import com.example.EcommerceApplication.dtos.ProductDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component
public interface ProductGateway {
    Map<String,Object> getProductById(String id) throws IOException;

    Map<String, Object> getProductByPage(String page) throws IOException;
}
