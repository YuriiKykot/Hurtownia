package com.example.Hurtownia.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@Data
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_warehouse;

    private String name;

    private String address;

    private double size;

    @OneToMany(mappedBy = "warehouse")
    private List<Inventory> inventories;

    public Warehouse(String name, String address, double size) {
        this.name = name;
        this.address = address;
        this.size = size;
    }
}
