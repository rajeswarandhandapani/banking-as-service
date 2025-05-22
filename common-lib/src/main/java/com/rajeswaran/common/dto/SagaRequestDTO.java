package com.rajeswaran.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SagaRequestDTO {
    private String sagaType;
    private String referenceId;
    private String payload; // JSON or other serialized data for the saga
}
