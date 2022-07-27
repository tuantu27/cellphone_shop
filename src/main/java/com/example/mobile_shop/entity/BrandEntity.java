package com.example.mobile_shop.entity;

import com.example.mobile_shop.dto.BrandDTO;
import com.example.mobile_shop.dto.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="brand")
@AllArgsConstructor
@NoArgsConstructor
public class BrandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public BrandDTO toDto(BrandEntity brand){
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setId(brand.getId());
        brandDTO.setName(brand.getName());
        List<ProductDTO> productDTOS = new ArrayList<>();
        brand.getListProduct().stream().forEach(e ->{
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(e.getId());
            productDTO.setName(e.getName());
            productDTO.setPrice(e.getPrice());
            productDTO.setCpu(e.getCpu());
            productDTO.setPhoto(e.getPhoto());
            productDTO.setRam(e.getRam());
            productDTO.setHardDrive(e.getHardDrive());
            productDTOS.add(productDTO);
        });
        brandDTO.setProductDTOList(productDTOS);
        return brandDTO;
    }

    @OneToMany(mappedBy = "brand",cascade = CascadeType.PERSIST)
    private List<ProductEntity> listProduct = new ArrayList<>();
}
