package com.example.Hurtownia.repository;

import com.example.Hurtownia.entity.BreedingCharacteristics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreedingCharacteristicsRepository extends JpaRepository<BreedingCharacteristics,Long>{}
