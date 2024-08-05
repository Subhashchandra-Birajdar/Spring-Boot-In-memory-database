package com.example.spring.web.without.database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// 1 : Create Model - Product.java
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product
{
    private int id;
    private String name;
    private int quantity;
    private double price;
}