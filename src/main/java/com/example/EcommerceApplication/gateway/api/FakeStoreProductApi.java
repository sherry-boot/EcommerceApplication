package com.example.EcommerceApplication.gateway.api;

import com.example.EcommerceApplication.dtos.FakeStoreResponseDTO;
import com.example.EcommerceApplication.dtos.ProductDTO;
import com.example.EcommerceApplication.dtos.ProductResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface FakeStoreProductApi {
    @GET("products/{id}")
    Call<ProductResponseDTO> listRepos(@Path("id") String id);
}
