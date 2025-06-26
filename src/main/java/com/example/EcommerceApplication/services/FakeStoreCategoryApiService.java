package com.example.EcommerceApplication.services;

import com.example.EcommerceApplication.dtos.CategoryDTO;
import com.example.EcommerceApplication.gateway.CategoryGateway;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryApiService implements CategoryInterfaceService {

    private final CategoryGateway categoryGateway;

    public FakeStoreCategoryApiService(CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return  this.categoryGateway.getAllCategories();
    }


}
