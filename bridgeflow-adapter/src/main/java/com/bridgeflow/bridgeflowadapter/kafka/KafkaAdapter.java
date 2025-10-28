package com.bridgeflow.bridgeflowadapter.kafka;

import com.bridgeflow.bridgeflowcore.common.Adapter;
import com.bridgeflow.bridgeflowcore.message.Message;

public class KafkaAdapter implements Adapter {
    @Override
    public void send(Message message) {

    }

    @Override
    public Message receive() {
        return null;
    }
}
