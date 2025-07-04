package com.example.EcommerceApplication.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDTO {

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




}