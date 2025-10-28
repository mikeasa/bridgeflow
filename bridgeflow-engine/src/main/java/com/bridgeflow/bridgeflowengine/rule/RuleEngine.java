package com.bridgeflow.bridgeflowengine.rule;

import com.bridgeflow.bridgeflowcore.message.Message;
import groovy.lang.GroovyShell;

public class RuleEngine {
    private final GroovyShell shell = new GroovyShell();

    public Message execute(String script, Message msg) {
        shell.setVariable("msg", msg);
        shell.evaluate(script);
        System.out.println("Script executed"+script+"--"+msg);
        return msg;
    }
}

