package com.rajeswaran.account.service;

import com.rajeswaran.common.dto.SagaEventDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.function.Consumer;

@Service
public class SagaEventListener {
    @Bean
    public Consumer<SagaEventDTO> sagaEvents() {
        return event -> {
            System.out.println("Received saga event: " + event);
            // TODO: Implement account creation logic based on eventType and payload
        };
    }
}
