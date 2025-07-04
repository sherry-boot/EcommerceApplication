package com.example.EcommerceApplication.services;

import com.example.EcommerceApplication.dtos.ProductDTO;
import com.example.EcommerceApplication.gateway.ProductGateway;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class FakeStoreProductService implements ProductInterfaceService{

    private final ProductGateway productGateway;

    public FakeStoreProductService(@Qualifier("RestTemplateClient") ProductGateway productGateway) {
        this.productGateway = productGateway;
    }
    @PostConstruct
    public void init() {
        System.out.println("Using gateway class(): " + productGateway.getClass().getName());
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
