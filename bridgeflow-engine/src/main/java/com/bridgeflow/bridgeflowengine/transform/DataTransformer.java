package com.bridgeflow.bridgeflowengine.transform;

import com.bridgeflow.bridgeflowcore.message.Message;
import org.springframework.stereotype.Component;

@Component
public class DataTransformer {
    public Message transform(Message original) {
        // 示例：修改 type 字段
        original.setPayload("TRANSFORMED_" + original);
        return original;
    }
}
