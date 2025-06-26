package com.example.EcommerceApplication.gateway.api;

import com.example.EcommerceApplication.dtos.FakeStoreResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;


@Component
public interface FakeStoreCategoryApi {


    @GET("products/category")
    Call<FakeStoreResponseDTO> getAllFakeCategories();
}
