package com.example.mobile_shop.service;

import com.example.mobile_shop.dto.BrandDTO;

import java.util.List;

public interface IBrandService {
    List<BrandDTO> getAll();
    List<Long> getListProductId(Long id);

}
