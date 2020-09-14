// Aula2 27/08/2020

package com.example.aula1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public String getClientes(){
        return "Vai retornar um dia do BD todos os cliente!";
    }

    @GetMapping("/clientes/{codigo}")
    public String getCliente(@PathVariable int codigo){
        if(codigo>0)
            return "Vai retornar um cliente =    " + codigo;
        else
            return "Erro, Numero negativo";     
    }   

}
