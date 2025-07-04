package com.example.EcommerceApplication.gateway;

import com.example.EcommerceApplication.Mappers.CategoryResponseMapper;
//import com.example.EcommerceApplication.Mappers.ProductResponseMapper;
import com.example.EcommerceApplication.dtos.ProductDTO;
import com.example.EcommerceApplication.dtos.ProductResponseDTO;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@Component("RestTemplateClient")
public class FakeStoreProductGateway_RestTemplate implements  ProductGateway{



    @Override
    public Map<String, Object> getProductById(String id) throws IOException {
        String Resurl = "https://fakestoreapi.in/api/products/";
        Map<String, Object> nmap = new HashMap<>();
        RestTemplate restTemplate = new RestTemplate();
       ProductResponseDTO myObject = restTemplate.getForObject(Resurl + "/"+id, ProductResponseDTO.class);
        nmap.put("response", myObject);
        return nmap;
    }

    @Override
    public Map<String, Object> getProductByPage(String page) throws IOException {
        return null;
    }
}
