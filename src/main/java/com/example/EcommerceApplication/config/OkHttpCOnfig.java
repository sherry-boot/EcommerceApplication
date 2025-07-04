package com.example.EcommerceApplication.config;

import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration

public class OkHttpCOnfig {




        @Bean
        public OkHttpClient okHttpClient() {
            return new OkHttpClient.Builder()
                    .retryOnConnectionFailure(true)
                    .build();
    }


}