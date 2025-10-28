package com.bridgeflow.bridgeflowcore.common;

import com.bridgeflow.bridgeflowcore.message.Message;

public interface Adapter {
    void send(Message message);
    Message receive();
}

