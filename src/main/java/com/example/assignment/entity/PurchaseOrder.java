package com.example.assignment.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Table(name = "purchase_orders")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseOrder extends BaseEntity {
    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "total_price", precision = 10, scale = 2)
    private BigDecimal totalPrice;

    @OneToMany(mappedBy = "purchaseOrder")
    private List<PurchaseOrderItem> purchaseOrderItems;
}
