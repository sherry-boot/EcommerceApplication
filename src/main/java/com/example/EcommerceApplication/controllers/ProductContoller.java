package com.example.EcommerceApplication.controllers;


import com.example.EcommerceApplication.dtos.ProductDTO;
import com.example.EcommerceApplication.dtos.ProductResponseDTO;
import com.example.EcommerceApplication.services.ProductInterfaceService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class ProductContoller {

    private final ProductInterfaceService productInterfaceService;

    public ProductContoller(ProductInterfaceService productInterfaceService) {
        this.productInterfaceService = productInterfaceService;
    }

    @GetMapping("/{id}")
    public Map<String,Object> getProductById(@PathVariable("id") String id) throws IOException {
        //Map<String, Object> nmap = new HashMap<>();
        Map<String,Object> nmap = productInterfaceService.getProductById(id);

        return nmap;
    }

    @GetMapping
    public Map<String, Object> getProductByPage(@RequestParam("page") String page) throws IOException {
        Map<String, Object> nmap = productInterfaceService.getProductByPage(page);
        return nmap;
    }

}
