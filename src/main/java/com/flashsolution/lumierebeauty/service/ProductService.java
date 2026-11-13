package com.flashsolution.lumierebeauty.service;

import com.flashsolution.lumierebeauty.entity.Product;
import com.flashsolution.lumierebeauty.repository.ProductRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}