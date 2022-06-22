package com.example.Hurtownia.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Data
@NoArgsConstructor
@DiscriminatorValue("Firm")
public class Firm extends Client{

    private String name;

    private String NIP;

    private String address;

    public Firm(String contactNumber, String email, String name, String NIP, String address) {
        super(contactNumber, email);
        this.name = name;
        this.NIP = NIP;
        this.address = address;
    }
}
