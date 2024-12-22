package com.example.assignment.entity;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Table(name = "accounts")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account extends BaseEntity {
    @Column(unique = true, nullable = true)
    private String username;
    @Column(unique = true, nullable = true)
    private String email;
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_uuid")
    private Role role;
}
