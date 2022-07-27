package com.example.mobile_shop.entity;

import com.example.mobile_shop.dto.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;
    private String ram;
    private String hardDrive;
    private String screen;
    private String photo;
    private String cpu;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="brand_id")
    private BrandEntity brand;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "color_id")
    private ColorEntity color;

    public ProductDTO toDto(ProductEntity product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setCpu(product.getCpu());
        productDTO.setPhoto(product.getPhoto());
        productDTO.setRam(product.getRam());
        productDTO.setScreen(product.getScreen());
        productDTO.setHardDrive(product.getHardDrive());
        productDTO.setBrandDTO(product.getBrand().toDto(product.getBrand()));
        return productDTO;
    }

}
