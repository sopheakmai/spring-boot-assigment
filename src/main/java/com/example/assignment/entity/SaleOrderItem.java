package com.example.assignment.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Table(name = "sale_order_items")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaleOrderItem extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "product_uuid")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "sale_order_uuid")
    private SaleOrder saleOrder;

    @Column(precision = 10, scale = 2)
    private BigDecimal cost;
    @Column(precision = 10, scale = 2)
    private BigDecimal price;
    private int qty;
}
