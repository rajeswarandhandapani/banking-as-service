package com.rajeswaran.sagaorchestrator.service;

import com.rajeswaran.common.dto.SagaRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class SagaOrchestratorService {
    public void startSaga(SagaRequestDTO request) {
        // Stub: actual saga orchestration logic will go here
        System.out.println("Starting saga: " + request);
    }
}
