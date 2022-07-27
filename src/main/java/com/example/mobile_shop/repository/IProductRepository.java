package com.example.mobile_shop.repository;

import com.example.mobile_shop.dto.ProductDTO;
import com.example.mobile_shop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<ProductEntity,Long> {
//    @Query("select new com.example.mobile_shop.dto.ProductDTO(p.id,p.name,p.photo,p.price) from ProductEntity p where p.name like '%:name%' ")
//    List<ProductDTO> searchByName(@Param("name") String name);
    List<ProductEntity> findAllByOrderByPriceDesc();
    List<ProductEntity> findProductEntitiesByNameContainingIgnoreCase(String name);

    List<ProductEntity> findAllByOrderByPriceAsc();
    List<ProductEntity> findByPriceBetween(Long from , Long to);
}
