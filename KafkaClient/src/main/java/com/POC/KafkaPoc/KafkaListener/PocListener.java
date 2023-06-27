package com.POC.KafkaPoc.KafkaListener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PocListener {
    @KafkaListener(topics = "poc-topic", groupId = "poc-group")
    public void listen(String message) {
        System.out.println("Received Messasge in group poc-group: " + message);
    }
}
