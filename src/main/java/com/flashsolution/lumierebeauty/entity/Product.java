package com.flashsolution.lumierebeauty.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity 
@Table(name = "products")
public class Product {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (nullable = false)
    private String name;

    private String description;

    private BigDecimal price;

    // Getters and setters

    
}