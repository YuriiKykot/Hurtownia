package com.example.Hurtownia.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@Data
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uniqueCode;

    private String productName;

    private double price;

    private String size;
    private float weight;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "inventories", nullable = true)
    private Warehouse warehouse;

    @ManyToMany(mappedBy = "inventories")
    private List<Plant> plants = new ArrayList<>();

    public Inventory(String productName, double price, String size, float weight, int quantity) {
        this.productName = productName;
        this.price = price;
        this.size = size;
        this.weight = weight;
        this.quantity = quantity;
    }
}
