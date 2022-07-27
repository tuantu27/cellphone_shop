package com.example.mobile_shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private Long price;
    private String ram;
    private String hardDrive;
    private String screen;
    private String photo;
    private String cpu;
    private Long brandId;
    private BrandDTO brandDTO;
    private Integer quantity;
    private Integer totalPages;
    private Long totalElements;
    private int currentPage;
    public ProductDTO(Long id, String name,String photo, Long price ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.photo = photo;
    }
}
