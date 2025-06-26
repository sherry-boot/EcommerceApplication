package com.example.EcommerceApplication.dtos;

import com.google.gson.annotations.SerializedName;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponseDTO {

	@SerializedName("product")
	private ProductDTO productDTO;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private String status;
}