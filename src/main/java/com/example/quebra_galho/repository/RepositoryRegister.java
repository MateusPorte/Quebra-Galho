package com.example.quebra_galho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quebra_galho.model.Register;

@Repository
public interface RepositoryRegister extends JpaRepository<Register, Long> {

}
