// Aula2 27/08/2020 e Aula3 03/09/2020

package com.example.aula1.controller;

import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    List <Clientee> clientes;
//  List <Clientee> clientes = new ArrayList<Clientee>();

//  Anotação do JAVA para chamar o método, assim que ele contruir o objeto  
    @PostConstruct
    public void criarClientes(){
        Clientee c1 = new Clientee();
        Clientee c2 = new Clientee();
        Clientee c3 = new Clientee();

        c1.codigo = 1;
        c1.end = "Rua, 0";
        c1.nome = "a";
        c1.saldo = 75;

        c2.codigo = 2;
        c2.end = "Rua, 1";
        c2.nome = "b";
        c2.saldo = 76;

        c3.codigo = 1;
        c3.end = "Rua, 2";
        c3.nome = "c";
        c3.saldo = 77;

        clientes = Arrays.asList(c1, c2, c3);
    } 

    @GetMapping("/clientes")
    public List<Clientee> getClientes(){
        return clientes;
    }

    @GetMapping("/clientes/{codigo}")
    public Clientee getCliente(@PathVariable int codigo) {
        Clientee cli = null;

//  For para varrer todo o vetor de clientes, ele salva o clinte na variável aux do tipo Clientee        
        for(Clientee aux:  clientes){
            if(aux.codigo == codigo){
                cli = aux;
                break;
            }
        }
/*  For raiz
        for(i=0; i<clientes.size(); i++){
            Clientee aux = cliente.get(i)
            if(aux.codigo == codigo){
                cli = aux;
                break;
            }
        }
*/
        return cli;
    }   

}
