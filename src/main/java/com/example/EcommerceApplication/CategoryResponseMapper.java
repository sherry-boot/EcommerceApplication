package com.example.EcommerceApplication;

import com.example.EcommerceApplication.dtos.CategoryDTO;
import com.example.EcommerceApplication.dtos.FakeStoreResponseDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CategoryResponseMapper {


    public static FakeStoreResponseDTO FromResponseStringToObjectMapper(Response response) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
      FakeStoreResponseDTO responseDTO =   objectMapper.readValue(response.body().string()
                , FakeStoreResponseDTO.class);

        return responseDTO;
    }

    public static List<CategoryDTO> toCategoriesDTO(FakeStoreResponseDTO responseDTO){
        return responseDTO.getCategories().stream()
                .map(CategoryDTO::new)
                .collect(Collectors.toList());
    }
}
