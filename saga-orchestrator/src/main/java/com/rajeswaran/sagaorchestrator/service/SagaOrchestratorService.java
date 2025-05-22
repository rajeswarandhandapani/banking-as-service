package com.rajeswaran.sagaorchestrator.service;

import com.rajeswaran.common.dto.SagaEventDTO;
import com.rajeswaran.common.dto.SagaRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SagaOrchestratorService {
    @Autowired
    private SagaEventPublisher sagaEventPublisher;

    public void startSaga(SagaRequestDTO request) {
        // Publish a saga start event
        SagaEventDTO event = new SagaEventDTO(
            request.getReferenceId(),
            request.getSagaType(),
            "START",
            request.getPayload()
        );
        sagaEventPublisher.publishSagaEvent(event);
        System.out.println("Published saga start event: " + event);
    }
}
