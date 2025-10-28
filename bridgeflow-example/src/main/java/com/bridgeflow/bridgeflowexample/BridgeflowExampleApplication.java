package com.bridgeflow.bridgeflowexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.bridgeflow.bridgeflowexample",
        "com.bridgeflow.bridgeflowengine"
})
public class BridgeflowExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BridgeflowExampleApplication.class, args);
    }

}
