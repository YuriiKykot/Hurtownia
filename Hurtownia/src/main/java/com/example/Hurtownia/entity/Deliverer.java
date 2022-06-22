package com.example.Hurtownia.entity;

import com.example.Hurtownia.enums.DelivererStatus;
import com.example.Hurtownia.enums.TransportType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table
@NoArgsConstructor
@Data
public class Deliverer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_deliverer;

    private String name;

    private String email;

    private double pricePerHour;

    @Enumerated(EnumType.STRING)
    private TransportType transportType = TransportType.TRUCK;

    @Enumerated(EnumType.STRING)
    private DelivererStatus delivererStatus = DelivererStatus.FREE;

    @JsonIgnore
    @OneToMany(mappedBy = "deliverer")
    private List<Order> orders;

    public Deliverer(String name, String email, double pricePerHour) {
        this.name = name;
        this.email = email;
        this.pricePerHour = pricePerHour;
    }
}
