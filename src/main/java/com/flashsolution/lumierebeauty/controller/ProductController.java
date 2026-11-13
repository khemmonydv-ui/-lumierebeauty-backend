package com.flashsolution.lumierebeauty.controller;

import com.flashsolution.lumierebeauty.entity.Product;
import com.flashsolution.lumierebeauty.service.ProductService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}