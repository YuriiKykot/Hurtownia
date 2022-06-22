package com.example.Hurtownia.repository;

import com.example.Hurtownia.entity.Firm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmRepository extends JpaRepository<Firm,Long>{}
