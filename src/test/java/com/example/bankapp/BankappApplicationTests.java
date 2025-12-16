package com.example.bankapp;

import com.example.bankapp.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class BankappApplicationTests {

    @MockBean
    private AccountRepository accountRepository;

    @Test
    void contextLoads() {
    }
}
