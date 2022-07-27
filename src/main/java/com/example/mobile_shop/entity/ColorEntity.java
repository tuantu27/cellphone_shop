package com.example.mobile_shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="color")
@AllArgsConstructor
@NoArgsConstructor
public class ColorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "color",cascade = CascadeType.PERSIST)
    private List<ProductEntity> listProduct = new ArrayList<>();
}
