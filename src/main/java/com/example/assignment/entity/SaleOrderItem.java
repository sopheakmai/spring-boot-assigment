package com.example.assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

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
}
