package com.example.assignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Table(name = "category")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseEntity {
    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private Set<Product> products;
}
