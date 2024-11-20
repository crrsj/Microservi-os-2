package com.example.cliente.controle;

import com.example.cliente.dto.Cliente;
import com.example.cliente.servico.ClienteServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("buscarClientes")
public class ClienteControle {

    @Autowired
    private ClienteServico clienteServico;

    @GetMapping
    public ResponseEntity<List<Cliente>>buscarClientes(){
        var busca = clienteServico.buscarClientes();
        return new ResponseEntity<>(busca, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Cliente>buscarPorId(@PathVariable Long id){
        var buscar = clienteServico.buscarPorId(id);
        return new ResponseEntity<>(buscar,HttpStatus.OK);
    }
}
