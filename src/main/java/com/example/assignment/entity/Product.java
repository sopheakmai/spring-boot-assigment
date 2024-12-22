package com.example.assignment.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Table(name = "products")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity {
    @Column(unique = true, nullable = false)
    private String name;

    @Column(precision = 10, scale = 2)
    private BigDecimal cost;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    private int qty;

    @ManyToOne
    @JoinColumn(name = "category_uuid")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<PurchaseOrderItem> PurchaseOrderItems;

    @OneToMany(mappedBy = "product")
    private List<SaleOrderItem> saleOrderItems;
}
