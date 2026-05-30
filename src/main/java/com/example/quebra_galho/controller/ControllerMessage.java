package com.example.quebra_galho.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quebra_galho.service.ServiceMessage;

@RestController
@RequestMapping("/app")
public class ControllerMessage {

    private final ServiceMessage serviceMessage;

    public ControllerMessage(ServiceMessage serviceMessage) {
        this.serviceMessage = serviceMessage;

    }

    @GetMapping("/message")
    public String message() {
        return serviceMessage.obterMensagem();
    }

}
