package com.example.assignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Table(name = "sale_orders")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaleOrder extends BaseEntity {
    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "total_price", precision = 10, scale = 2)
    private BigDecimal totalPrice;

    @OneToMany(mappedBy = "saleOrder")
    private List<SaleOrderItem> saleOrderItems;
}
