package com.example.EcommerceApplication.gateway;

import com.example.EcommerceApplication.dtos.CategoryDTO;
import com.example.EcommerceApplication.dtos.FakeStoreResponseDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component

public interface CategoryGateway {


    List<CategoryDTO> getAllCategories() throws IOException;
}
