package com.bridgeflow.bridgeflowengine.rule.model

class SampleRule {
    def process(msg) {
        if (msg.payload.score > 90) {
            msg.payload.grade = "A"
        }
        return msg
    }
}
