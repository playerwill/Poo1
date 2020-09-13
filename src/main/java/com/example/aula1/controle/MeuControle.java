// Aula1 20/08/20

package com.example.aula1.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// RestControler é uma crontroladora do stringframewoek
@RestController
public class MeuControle {

    // GetMapping: Mapeia a transmissão de mensagem
    @GetMapping("/hello")
    // Metodo hello pertence a classe MeuControle
    public String hello(){
        return "Salve String Boot";
    }

}
