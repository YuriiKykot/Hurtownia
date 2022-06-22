package com.example.Hurtownia.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Data
@NoArgsConstructor
@DiscriminatorValue("individualClient")
public class IndividualClient extends Client {

    private String firstName;

    private String lastName;

    public IndividualClient(String contactNumber, String email, String firstName, String lastName) {
        super(contactNumber, email);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
