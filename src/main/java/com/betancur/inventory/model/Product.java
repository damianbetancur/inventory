package com.betancur.inventory.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Data
public class Product {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer id;

    @Column(nullable = false, length = 100, unique=true)
    private String description;

}
