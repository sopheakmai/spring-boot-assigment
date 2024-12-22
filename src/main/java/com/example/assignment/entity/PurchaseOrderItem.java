package com.example.assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

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
}
