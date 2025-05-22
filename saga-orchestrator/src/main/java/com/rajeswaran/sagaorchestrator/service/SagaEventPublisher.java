package com.rajeswaran.sagaorchestrator.service;

import com.rajeswaran.common.dto.SagaEventDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.cloud.stream.function.StreamBridge;

@Service
public class SagaEventPublisher {
    @Autowired
    private StreamBridge streamBridge;

    public void publishSagaEvent(SagaEventDTO event) {
        streamBridge.send("sagaEvents-out-0", event);
    }
}
