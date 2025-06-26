package com.example.EcommerceApplication.dtos;

import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeStoreResponseDTO {
    private String status;
    private String message;

    private List<String> categories;
}
