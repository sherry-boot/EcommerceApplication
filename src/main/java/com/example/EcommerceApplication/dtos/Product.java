package com.example.EcommerceApplication.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product{

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

	public String getImage(){
		return image;
	}

	public String getColor(){
		return color;
	}

	public int getPrice(){
		return price;
	}

	public String getDescription(){
		return description;
	}

	public int getDiscount(){
		return discount;
	}

	public String getModel(){
		return model;
	}

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public String getCategory(){
		return category;
	}

	public String getBrand(){
		return brand;
	}
}