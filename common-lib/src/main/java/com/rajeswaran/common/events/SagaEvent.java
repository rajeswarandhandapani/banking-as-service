package com.rajeswaran.common.events;

import com.rajeswaran.common.AppConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SagaEvent {
    private String userId;
    private String username;
    private String email;
    private String fullName;
    private LocalDateTime timestamp;
    private String details;
    private String correlationId;
    private AppConstants.ServiceName serviceName;
    private AppConstants.SagaEventType eventType;
}
