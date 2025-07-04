package com.example.EcommerceApplication.gateway;

import com.example.EcommerceApplication.dtos.*;
import com.example.EcommerceApplication.gateway.api.FakeStoreCategoryApi;
import com.example.EcommerceApplication.gateway.api.FakeStoreProductApi;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
@Primary
public class FakeStoreProductGateway implements ProductGateway{

    private final FakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi  = fakeStoreProductApi;

    }

    @Override
    public Map<String,Object> getProductById(String  id) throws IOException {
        Map<String,Object> nmap = new HashMap<>();
        ResponseProductDTO res = fakeStoreProductApi.listRepos(id).execute().body();
       if(res == null){
           throw  new IOException("Unable to fetch products");
       }
        nmap.put("response",res);
       return nmap;

    }

    @Override
    public Map<String, Object> getProductByPage(String page) throws IOException {
        Map<String, Object> nmap = new HashMap<>();
        PageProductsDTO res = fakeStoreProductApi.listPageRepos(page).execute().body();
        if(res == null){
            throw new IOException("Unable to fetch the page requested");
        }
        nmap.put("response", res);
        return  nmap;

    }
}
