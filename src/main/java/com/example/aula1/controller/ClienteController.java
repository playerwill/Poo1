// Aula2 27/08/2020 e Aula3 03/09/2020 e Aula4 10/09/2020 

package com.example.aula1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.aula1.controle.repository.ClienteRopository;
import com.example.aula1.model.Clientee;

@RestController
public class ClienteController {

//  injeta o objeto que ele gerencia
    @Autowired
    private ClienteRopository repository;

//  Get recupera dados
    @GetMapping("/clientes")
    public List<Clientee> getClientes() {
        return repository.getAllClientees();
    }

    @GetMapping("/clientes/{codigo}")
    public Clientee getCliente(@PathVariable final int codigo){
        return repository.getAllClienteeByCodigo(codigo);
    }   

//  Post salva dados
    @PostMapping
    public Clientee salvar(@RequestBody Clientee clientee){ //RequestBody direciona onde será guardado
        return repository.save(clientee);
    }
    
}
