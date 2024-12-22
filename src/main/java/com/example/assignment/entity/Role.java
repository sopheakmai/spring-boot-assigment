package com.example.assignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Table(name = "roles")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Role extends BaseEntity {
    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "role")
    private Set<Account> accounts;
}
