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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component("fakeStoreOkHttp")
public class FakeStoreCategoryGateway_OKHttp implements CategoryGateway {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final OkHttpClient okHttpClient;
    @Value("${external.base.url}")
    String url;

    public FakeStoreCategoryGateway_OKHttp(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response res = okHttpClient.newCall(request).execute();

        FakeStoreResponseDTO responseDTO = CategoryResponseMapper.FromResponseStringToObjectMapper(res);

        return CategoryResponseMapper.toCategoriesDTO(responseDTO);
    }
}