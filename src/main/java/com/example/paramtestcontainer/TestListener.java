package com.example.paramtestcontainer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestListener {

    @StreamListener("testStream")
    public void testListener(@Payload String message) {
        log.info("Message Received: {}", message);
    }

}
