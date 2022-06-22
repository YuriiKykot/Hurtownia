package com.example.Hurtownia.entity;

import com.example.Hurtownia.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "tb_order")
@Table
@NoArgsConstructor
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_order;

    private String address;

    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus = OrderStatus.SUBMITTED;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_deliverer")
    private Deliverer deliverer;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE})
    @JoinTable(name = "order_plant",
            joinColumns = @JoinColumn(name = "id_order"),
            inverseJoinColumns = @JoinColumn(name = "id_plant"))
    private List<Plant> plants = new ArrayList<>();

    public Order(String address, int quantity) {
        this.address = address;
        this.quantity = quantity;
    }
}
