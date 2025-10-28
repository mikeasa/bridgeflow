package com.bridgeflow.bridgeflowcore.message;

import java.util.Map;

public class MessageHeader {
    private String sourceSystem;
    private String targetSystem;
    private String messageType;
    private String traceId;
    private Map<String, String> metadata;
}
