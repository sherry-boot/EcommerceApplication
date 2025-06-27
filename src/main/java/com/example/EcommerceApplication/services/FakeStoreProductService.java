package com.example.EcommerceApplication.services;

import com.example.EcommerceApplication.dtos.ProductDTO;
import com.example.EcommerceApplication.gateway.ProductGateway;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class FakeStoreProductService implements ProductInterfaceService{

    private final ProductGateway productGateway;

    public FakeStoreProductService(ProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public Map<String,Object> getProductById(String id) throws IOException {
        Map<String,Object>  nmap =  productGateway.getProductById(id);
        return  nmap;
    }

    @Override
    public Map<String, Object> getProductByPage(String page) throws IOException {
        Map<String, Object> nmap  = productGateway.getProductByPage(page);
        return nmap;
    }
}
