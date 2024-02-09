package com.apirest.web.Cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.web.cliente.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}