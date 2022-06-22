package com.example.Hurtownia.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "client")
public abstract class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_client;

    private String contactNumber;

    private String email;

    @OneToMany(mappedBy = "client", cascade=CascadeType.ALL)
    private List<Order> orders;

    public Client(String contactNumber, String email) {
        this.contactNumber = contactNumber;
        this.email = email;
    }
}
