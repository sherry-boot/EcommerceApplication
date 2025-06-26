package com.example.EcommerceApplication.config;


import com.example.EcommerceApplication.gateway.api.FakeStoreCategoryApi;
import com.example.EcommerceApplication.gateway.api.FakeStoreProductApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetroFitConfig {

    @Bean
    public FakeStoreCategoryApi fakeStoreApi(Retrofit retrofit){
        return retrofit.create(FakeStoreCategoryApi.class);
    }
    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit){
        return retrofit.create((FakeStoreProductApi.class));
    }

    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder()
       .baseUrl("https://fakestoreapi.in/api/")
        .addConverterFactory(GsonConverterFactory.create()).build();
    }

}
