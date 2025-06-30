package com.example.EcommerceApplication.services;

import com.example.EcommerceApplication.dtos.CategoryDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


public interface CategoryInterfaceService {

    public List<CategoryDTO> getAllCategories() throws IOException;

}
