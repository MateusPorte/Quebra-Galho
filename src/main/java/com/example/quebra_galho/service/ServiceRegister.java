package com.example.quebra_galho.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.quebra_galho.model.Register;
import com.example.quebra_galho.repository.RepositoryRegister;

@Service
public class ServiceRegister {

    private final RepositoryRegister repositoryRegister;

    public ServiceRegister(RepositoryRegister repositoryRegister) {
        this.repositoryRegister = repositoryRegister;
    }

    public List<Register> getAllRegisters() {
        return repositoryRegister.findAll();
    }

}
