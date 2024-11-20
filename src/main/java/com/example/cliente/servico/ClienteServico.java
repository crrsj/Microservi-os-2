package com.example.cliente.servico;

import com.example.cliente.dto.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "cliente-service",url = "http://localhost:8080/cliente")
public interface ClienteServico {

    @GetMapping()
    List<Cliente>buscarClientes();

    @GetMapping("{id}")
    Cliente buscarPorId(@PathVariable Long id);
}
