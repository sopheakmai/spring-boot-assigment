package com.example.assignment.repository;

import com.example.assignment.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
    Account findByUsernameOrEmail(String value);
}
