package com.example.EcommerceApplication.services;

import com.example.EcommerceApplication.dtos.CategoryDTO;
import com.example.EcommerceApplication.gateway.CategoryGateway;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Component()
public class FakeStoreCategoryApiService implements CategoryInterfaceService {

    private final CategoryGateway categoryGateway;

    public FakeStoreCategoryApiService(@Qualifier("fakeStoreOkHttp") CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }
    @PostConstruct
    public void init() {
        System.out.println(" Using gateway class: " + categoryGateway.getClass().getName());
    }


    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return  this.categoryGateway.getAllCategories();
    }


}