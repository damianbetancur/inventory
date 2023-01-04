package com.betancur.inventory.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
public class User {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;

    @Column(name = "user_name",nullable = false, length = 100, unique=true)
    private String userName;

    @Column(name = "password",nullable = false)
    private String password;
}
