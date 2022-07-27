package com.example.mobile_shop.controller;

import com.example.mobile_shop.dto.BrandDTO;
import com.example.mobile_shop.dto.ProductDTO;
import com.example.mobile_shop.service.IBrandService;
import com.example.mobile_shop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ShopController {
    @Autowired
    IProductService iProductService;

    @Autowired
    IBrandService iBrandService;

    @GetMapping(value = "/shop")
    public String viewPage(Model model){
        List<ProductDTO> listpro = iProductService.pagingProduct(1,6);
        ProductDTO productDTO = listpro.get(1);
        List<BrandDTO> lstBrand = iBrandService.getAll();
        model.addAttribute("lstBrand",lstBrand);
        model.addAttribute("lstProduct",listpro);
        model.addAttribute("currentPage",productDTO.getCurrentPage());
        model.addAttribute("totalPages",productDTO.getTotalPages());
        return "shop_page";
    }
    @GetMapping(value = "/pagingProduct/{pageNo}")
    public ResponseEntity<List<ProductDTO>> findPaginated(@PathVariable("pageNo")int pageNo, Model model){
        int pageSize = 6;
        List<ProductDTO> listpro = iProductService.pagingProduct(pageNo,pageSize);
//        ProductDTO productDTO = listpro.get(1);
//        List<BrandDTO> lstBrand = iBrandService.getAll();
//        model.addAttribute("lstBrand",lstBrand);
//        model.addAttribute("currentPage",pageNo);
//        model.addAttribute("totalPages",productDTO.getTotalPages());
        return new ResponseEntity<List<ProductDTO>>(listpro, HttpStatus.OK);
    }


}
