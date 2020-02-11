package com.example.paramtestcontainer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Streams {

    @Input("testStream")
    SubscribableChannel testStreamChannel();

}
