package com.example.EcommerceApplication.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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

	@SerializedName("image")
	private String image;

	@SerializedName("color")
	private String color;

	@SerializedName("price")
	private int price;

	@SerializedName("description")
	private String description;

	@SerializedName("discount")
	private int discount;

	@SerializedName("model")
	private String model;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("category")
	private String category;

	@SerializedName("brand")
	private String brand;

	@SerializedName("popular")
	private String popular;

	@SerializedName("onSale")
	private String onSale;
}