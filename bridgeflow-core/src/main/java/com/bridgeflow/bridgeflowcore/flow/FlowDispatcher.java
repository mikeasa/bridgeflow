package com.bridgeflow.bridgeflowcore.flow;

import com.bridgeflow.bridgeflowcore.message.Message;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FlowDispatcher {
    private final ExecutorService executor = Executors.newFixedThreadPool(8);

    public void dispatch(Message message) {
        executor.submit(() -> {
            // 模拟消息处理逻辑
            System.out.println("Dispatching: " + message.getHeader());
        });
    }
}