package com.example.mobile_shop.controller;

import com.example.mobile_shop.dto.BrandDTO;
import com.example.mobile_shop.dto.ProductDTO;
import com.example.mobile_shop.repository.IBrandRepository;
import com.example.mobile_shop.service.IBrandService;
import com.example.mobile_shop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    IProductService iProductService;
    @Autowired
    IBrandService iBrandService;

    @GetMapping(value = "/home")
    public String viewPage(Model model){
        List<ProductDTO> listpro = iProductService.getAll();
        List<BrandDTO> lstBrand = iBrandService.getAll();
        model.addAttribute("lstBrand",lstBrand);
        model.addAttribute("lstProduct",listpro);
        return "home_page";
    }


}
