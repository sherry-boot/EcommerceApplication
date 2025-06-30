package com.example.EcommerceApplication.gateway;

import com.example.EcommerceApplication.CategoryResponseMapper;
import com.example.EcommerceApplication.dtos.CategoryDTO;
import com.example.EcommerceApplication.dtos.FakeStoreResponseDTO;
import com.example.EcommerceApplication.gateway.CategoryGateway;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component("fakeStoreOkHttp")
public class FakeStoreCategoryGateway_OKHttp implements CategoryGateway {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        OkHttpClient client = new OkHttpClient();

        String url = "https://fakestoreapi.in/api/products/category";
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();

        if (response.body() == null || !response.isSuccessful()) {
            throw new IOException("Unable to call OkHttp or failed to fetch category");
        }

        FakeStoreResponseDTO responseDTO = CategoryResponseMapper.FromResponseStringToObjectMapper(response);

        return CategoryResponseMapper.toCategoriesDTO(responseDTO);
    }
}
