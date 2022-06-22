package com.example.Hurtownia.repository;

import com.example.Hurtownia.entity.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends JpaRepository<Plant,Long>{}
