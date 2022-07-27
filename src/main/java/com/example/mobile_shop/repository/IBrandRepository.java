package com.example.mobile_shop.repository;

import com.example.mobile_shop.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandRepository extends JpaRepository<BrandEntity,Long> {
}
