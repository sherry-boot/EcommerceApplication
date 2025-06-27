package com.example.EcommerceApplication.dtos;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageProductsDTO{

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private String status;

	@SerializedName("products")
	private List<ProductsItem> products;
}