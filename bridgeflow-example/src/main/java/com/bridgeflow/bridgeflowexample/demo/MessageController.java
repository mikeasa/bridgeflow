package com.bridgeflow.bridgeflowexample.demo;

import com.bridgeflow.bridgeflowcore.message.Message;
import com.bridgeflow.bridgeflowengine.MqAdapter;
import com.bridgeflow.bridgeflowengine.transform.DataTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MqAdapter mqAdapter;

    private final DataTransformer transformer;

    @Autowired
    public MessageController(MqAdapter mqAdapter, DataTransformer transformer) {
        this.mqAdapter = mqAdapter;
        this.transformer = transformer;
    }
    @PostMapping("/send")
    public String send(@RequestBody Message message) {
        mqAdapter.publish(transformer.transform(message));
        return "Message sent";
    }
}

