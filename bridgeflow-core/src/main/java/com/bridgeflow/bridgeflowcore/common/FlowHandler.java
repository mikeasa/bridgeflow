package com.bridgeflow.bridgeflowcore.common;

import com.bridgeflow.bridgeflowcore.message.Message;

public interface FlowHandler {
    void handle(Message message);
}
