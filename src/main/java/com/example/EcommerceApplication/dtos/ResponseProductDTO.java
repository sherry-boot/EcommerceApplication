package com.example.EcommerceApplication.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseProductDTO{

	@JsonProperty("product")
	private Product product;

	@JsonProperty("message")
	private String message;

	@JsonProperty("status")
	private String status;

	public Product getProduct(){
		return product;
	}

	public String getMessage(){
		return message;
	}

	public String getStatus(){
		return status;
	}
}