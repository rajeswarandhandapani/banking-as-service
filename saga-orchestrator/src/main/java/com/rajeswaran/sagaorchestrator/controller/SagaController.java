package com.rajeswaran.sagaorchestrator.controller;

import com.rajeswaran.common.dto.SagaRequestDTO;
import com.rajeswaran.sagaorchestrator.service.SagaOrchestratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sagas")
public class SagaController {
    @Autowired
    private SagaOrchestratorService sagaOrchestratorService;

    @PostMapping("/start")
    public ResponseEntity<String> startSaga(@RequestBody SagaRequestDTO request) {
        // For now, just call the stub service
        sagaOrchestratorService.startSaga(request);
        return ResponseEntity.ok("Saga started (stub)");
    }
}
