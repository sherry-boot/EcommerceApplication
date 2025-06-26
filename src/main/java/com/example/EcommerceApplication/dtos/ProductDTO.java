package com.example.EcommerceApplication.dtos;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {

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
}