package com.example.aula1.controle.repository;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import com.example.aula1.model.Clientee;

import org.springframework.stereotype.Component;

// Faz com que o String controle a classe ClienteRepository
@Component
public class ClienteRopository {

//  List <Clientee> clientes = new ArrayList<Clientee>();
    private List <Clientee> clientes;
    
//  Anotação do JAVA para chamar o método, assim que ele contruir o objeto  
    @PostConstruct
    public void criarClientes(){
        final Clientee c1 = new Clientee();
        final Clientee c2 = new Clientee();
        final Clientee c3 = new Clientee();
    
        c1.setCodigo(1);
        c1.setEnd("Rua, 0");
        c1.setNome("a");
        c1.setSaldo(75);
    
        c2.setCodigo(2);
        c2.setEnd("Rua, 1");
        c2.setNome("b");
        c2.setSaldo(76);
    
        c3.setCodigo(3);
        c3.setEnd("Rua, 2");
        c3.setNome("c");
        c3.setSaldo(77);
 
//      clientes = Arrays.asList(c1, c2, c3); array de tamanho fixo 
        clientes = new ArrayList<Clientee>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
    }
        
    public List<Clientee> getAllClientees(){
        return clientes;
    }
    
    public Clientee getAllClienteeByCodigo(final int codigo) {
        for(final Clientee aux: clientes){
            if(aux.getCodigo() == codigo) {
                return aux;        
            }
        }
        
        return null;
    }

    public Clientee save(Clientee clientee){
        clientee.setCodigo(clientes.size() +1);
        clientes.add(clientee);
        return clientee;   
    }

}
