package com.example.Hurtownia.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@Data
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_plant;

    private String name;

    private String species;

    @ManyToOne
    @JoinColumn(name = "id_breedingCharacteristics", nullable = true)
    private BreedingCharacteristics breedingCharacteristics;

    @ManyToMany(mappedBy = "plants")
    private List<Order> orders = new ArrayList<>();

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "plant_inventory",
            joinColumns = @JoinColumn(name = "id_plant"),
            inverseJoinColumns = @JoinColumn(name = "uniqueCode"))
    private List<Inventory> inventories = new ArrayList<>();

    public Plant(String name, String species) {
        this.name = name;
        this.species = species;
    }
}
