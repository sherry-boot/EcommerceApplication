package com.example.EcommerceApplication.gateway;

import com.example.EcommerceApplication.Mappers.CategoryResponseMapper;
import com.example.EcommerceApplication.config.OkHttpCOnfig;
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

    private final OkHttpCOnfig okHttpCOnfig;

    public FakeStoreCategoryGateway_OKHttp(OkHttpCOnfig okHttpCOnfig) {
        this.okHttpCOnfig = okHttpCOnfig;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        Response response = okHttpCOnfig.getResponse();

        if (response.body() == null || !response.isSuccessful()) {
            throw new IOException("Unable to call OkHttp or failed to fetch category");
        }

        FakeStoreResponseDTO responseDTO = CategoryResponseMapper.FromResponseStringToObjectMapper(response);

        return CategoryResponseMapper.toCategoriesDTO(responseDTO);
    }
}