package com.example.EcommerceApplication.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.*;
import org.springframework.lang.NonNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductsItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("color")
	private String color;

	@JsonProperty("price")
	private int price;

	@JsonProperty("description")
	private String description;

	@JsonProperty("discount")
	private int discount;

	@JsonProperty("model")
	private String model;

	@JsonProperty("id")
	private int id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("category")
	private String category;

	@JsonProperty("brand")
	private String brand;

	@JsonProperty("popular")
	private String popular;

	@JsonProperty("onSale")
	private String onSale;
}