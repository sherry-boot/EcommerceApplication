package com.example.EcommerceApplication.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponseDTO {

	@JsonProperty("product")
	private ProductDTO productDTO;

	@JsonProperty("message")
	private String message;

	@JsonProperty("status")
	private String status;
}