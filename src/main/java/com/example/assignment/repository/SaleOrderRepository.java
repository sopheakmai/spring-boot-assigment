package com.example.assignment.repository;

import com.example.assignment.entity.SaleOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SaleOrderRepository extends JpaRepository<SaleOrder, UUID> {
}
