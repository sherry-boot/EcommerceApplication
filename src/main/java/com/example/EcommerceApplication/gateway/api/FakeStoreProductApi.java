package com.example.EcommerceApplication.gateway.api;

import com.example.EcommerceApplication.dtos.*;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface FakeStoreProductApi {
    @GET("products/{id}")
    Call<ResponseProductDTO> listRepos(@Path("id") String id);

    @GET("products")
    Call<PageProductsDTO> listPageRepos(@Query("page") String page);
}
