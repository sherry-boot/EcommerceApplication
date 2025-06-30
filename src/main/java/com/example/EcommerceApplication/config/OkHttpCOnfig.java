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
    public  Response getResponse() throws IOException {

        OkHttpClient client = new OkHttpClient();
        String url = "https://fakestoreapi.in/api/products/category";
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response res = client.newCall(request).execute();
        return res;
//         (Response response = client.newCall(request).execute())
//            return response.body().string();
    }


}
