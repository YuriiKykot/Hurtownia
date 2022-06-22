package com.example.Hurtownia.entity;

import com.example.Hurtownia.enums.HydrationLevel;
import com.example.Hurtownia.enums.InsolationLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@Data
public class BreedingCharacteristics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_breedingCharacteristics;

    @Enumerated(EnumType.STRING)
    private InsolationLevel insolationLevel;

    @Enumerated(EnumType.STRING)
    private HydrationLevel hydrationLevel;

    private String growingSeason;

    private double airTemperature;

    private double humidity;

    @OneToMany(mappedBy = "breedingCharacteristics")
    private List<Plant> plants;

    public BreedingCharacteristics(InsolationLevel insolationLevel, HydrationLevel hydrationLevel, String growingSeason, double airTemperature, double humidity) {
        this.insolationLevel = insolationLevel;
        this.hydrationLevel = hydrationLevel;
        this.growingSeason = growingSeason;
        this.airTemperature = airTemperature;
        this.humidity = humidity;
    }
}
