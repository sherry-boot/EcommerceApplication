package com.example.EcommerceApplication.gateway;

import com.example.EcommerceApplication.dtos.CategoryDTO;
import com.example.EcommerceApplication.dtos.FakeStoreResponseDTO;
import com.example.EcommerceApplication.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FakeStoreCategoryGateway implements  CategoryGateway{

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO>   getAllCategories() throws IOException {
        FakeStoreResponseDTO response = this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();
        if(response == null)
        {
            throw  new IOException("Unable to fetch categories from fakestori API");
        }
        return response.getCategories().stream()
                .map(name -> new CategoryDTO(name)).collect(Collectors.toList());
    }
}
