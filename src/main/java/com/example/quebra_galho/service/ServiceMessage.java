package com.example.quebra_galho.service;

import org.springframework.stereotype.Service;

import com.example.quebra_galho.repository.RepositoryMessage;

@Service
public class ServiceMessage {

    private final RepositoryMessage repositoryMessage;

    public ServiceMessage(RepositoryMessage repositoryMessage) {
        this.repositoryMessage = repositoryMessage;
    }

    public String obterMensagem() {
        return repositoryMessage.obterMensagem();
    }

}
