package com.example.Hurtownia.repository;

import com.example.Hurtownia.entity.IndividualClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividualClientRepository extends JpaRepository<IndividualClient,Long>{}
