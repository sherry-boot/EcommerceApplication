package com.example.EcommerceApplication.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageProductsDTO{

	@JsonProperty("message")
	private String message;

	@JsonProperty("status")
	private String status;

	@JsonProperty("products")
	private List<ProductsItem> products;
}