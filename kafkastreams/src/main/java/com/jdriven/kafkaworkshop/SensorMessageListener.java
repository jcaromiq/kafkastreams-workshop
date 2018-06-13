package com.jdriven.kafkaworkshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SensorMessageListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SensorMessageListener.class);

    @KafkaListener(topics = TopicNames.RECEIVED_SENSOR_DATA)
    protected void listen(SensorData sensorData) {
        LOGGER.info("Incoming sensor data {}", sensorData);
    }
}
