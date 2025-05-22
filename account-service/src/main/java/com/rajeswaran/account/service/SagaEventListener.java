package com.rajeswaran.account.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rajeswaran.account.entity.Account;
import com.rajeswaran.common.dto.AccountDTO;
import com.rajeswaran.common.dto.SagaEventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.function.Consumer;

@Service
public class SagaEventListener {
    @Autowired
    private AccountService accountService;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Bean
    public Consumer<SagaEventDTO> sagaEvents() {
        return event -> {
            System.out.println("Received saga event: " + event);
            if ("START".equals(event.getEventType()) && "ACCOUNT_CREATION".equals(event.getSagaType())) {
                try {
                    AccountDTO accountDTO = objectMapper.readValue(event.getPayload(), AccountDTO.class);
                    Account account = new Account(
                        accountDTO.getAccountId(),
                        accountDTO.getAccountNumber(),
                        accountDTO.getAccountType(),
                        accountDTO.getUserId(),
                        accountDTO.getBalance(),
                        accountDTO.getStatus()
                    );
                    accountService.createAccount(account);
                    System.out.println("Account created as part of saga: " + account);
                } catch (Exception e) {
                    System.err.println("Failed to process saga event for account creation: " + e.getMessage());
                }
            }
        };
    }
}
