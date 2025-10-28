package com.bridgeflow.bridgeflowexample.demo;

import com.bridgeflow.bridgeflowcore.message.Message;
import com.bridgeflow.bridgeflowengine.MqAdapter;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MqConsumer {
    @Autowired
    private MqAdapter mqAdapter;

    @PostConstruct
    public void start() {
        System.out.println("Starting MQ consumer...");
        new Thread(() -> {
            while (true) {
                try {
                    Message msg = mqAdapter.consume();
                    System.out.println("Consumed message: " + msg);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
}

