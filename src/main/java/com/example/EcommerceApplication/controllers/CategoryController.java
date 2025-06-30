package com.example.EcommerceApplication.controllers;

import com.example.EcommerceApplication.dtos.CategoryDTO;
import com.example.EcommerceApplication.services.CategoryInterfaceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products/category")
public class CategoryController{


    private final CategoryInterfaceService categoryInterfaceService;


    CategoryController(CategoryInterfaceService _categoryService){
        this.categoryInterfaceService = _categoryService;
    }

    @GetMapping()
    public List<CategoryDTO> getAllCategories() throws IOException {
       List<CategoryDTO> result  = categoryInterfaceService.getAllCategories();
       return result;
    }
}
