package com.apirest.web.Cliente.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.web.Cliente.entity.Cliente;
import com.apirest.web.Cliente.repository.ClienteRepository;

@Service
public class ClienteService {

 @Autowired
 private ClienteRepository ClienteRepository;

 public Cliente salvar(Cliente cliente){
    return ClienteRepository.save(cliente);
 }
    public list<Cliente> listaCliente(){
        return clienteRepository.findAll();
    }

    public Optional<cliente> buscarPorId(Long id){
        return clienteRepository.findById(id);
    }
    public void removerPorId(Long id){
        clienteRepository.deleteById(id);
    }
}
