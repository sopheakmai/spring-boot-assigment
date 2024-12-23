package com.example.assignment.service.impl;

import com.example.assignment.repository.AccountRepository;
import com.example.assignment.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private static AccountRepository accountRepository;
}
