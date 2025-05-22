package com.rajeswaran.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SagaEventDTO {
    private String sagaId;
    private String sagaType;
    private String eventType; // e.g., START, STEP_COMPLETED, FAILED
    private String payload;   // JSON or other serialized data
}
