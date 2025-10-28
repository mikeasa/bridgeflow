package com.bridgeflow.bridgeflowengine;

import com.bridgeflow.bridgeflowcore.message.Message;
import org.springframework.stereotype.Component;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Component
public class MqAdapter {
    private final BlockingQueue<Message> queue = new LinkedBlockingQueue<>();

    public void publish(Message message) {
        queue.offer(message);
    }

    public Message consume() throws InterruptedException {
        return queue.take();
    }
}
