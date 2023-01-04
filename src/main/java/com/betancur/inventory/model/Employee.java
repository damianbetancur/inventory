package com.betancur.inventory.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employees")
@Data
public class Employee {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Integer id;

    @Column(name = "user_name",nullable = false, length = 100, unique=true)
    private String userName;

    @Column(name = "password",nullable = false)
    private String password;
}
