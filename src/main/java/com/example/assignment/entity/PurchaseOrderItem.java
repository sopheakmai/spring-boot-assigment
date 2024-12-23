package com.example.assignment.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Table(name = "purchase_order_items")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderItem extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "product_uuid")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "purchase_order_uuid")
    private PurchaseOrder purchaseOrder;

    @Column(precision = 10, scale = 2)
    private BigDecimal cost;
    @Column(precision = 10, scale = 2)
    private BigDecimal price;
    private int qty;
}
