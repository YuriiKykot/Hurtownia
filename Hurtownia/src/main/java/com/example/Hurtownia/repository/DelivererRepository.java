package com.example.Hurtownia.repository;

import com.example.Hurtownia.entity.Deliverer;
import com.example.Hurtownia.enums.DelivererStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DelivererRepository extends JpaRepository<Deliverer,Long> {
    List<Deliverer> findAllByDelivererStatus(DelivererStatus delivererStatus);
}
