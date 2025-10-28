package com.bridgeflow.bridgeflowcore.message;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Message {
    private String id;
    private MessageHeader header;
    private Object payload; // 可以是JSON、POJO、二进制
    private LocalDateTime timestamp;
}
