/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.infra.usuarios;

import br.edu.infnet.domain.usuarios.Usuario;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author bruno
 */
public class UsuarioService {
    
    private final String REST_URI = "http://localhost:8081/";
    private final Client client = ClientBuilder.newClient();
    
    public Usuario obterUsuario(int id){
        return client
                .target(REST_URI)
                .path(Integer.toString(id))
                .path("json")
                .request(MediaType.APPLICATION_JSON)
                //.post(Entity.json(Endereco.class), Endereco.class);
                .get(Usuario.class);
    }
    
     public void CadastrarUsuario(Usuario usuario) throws JsonProcessingException{
         
        ObjectMapper mapper = new ObjectMapper();
         
        String usuarioJson = mapper.writeValueAsString(usuario);
        
        client.target(REST_URI)                
              .path("usuarios/cadastro")
              .request(MediaType.APPLICATION_JSON)
              .post(Entity.json(usuarioJson), Usuario.class);
        
       /** 
        * 
        *####   Testes    ####
        *
        *System.out.println("teste2");
        *
        *System.out.println(json);
        *
        *System.out.println(Entity.json(usuarioJson));
        * 
        *System.out.println(client
        *        .target(REST_URI)                
        *        .path("usuarios/cadastro")
        *        .request(MediaType.APPLICATION_JSON)
        *        .post(Entity.json(usuarioJson), Usuario.class));
        * 
        *System.out.println("teste2");
        */
        /*
        return client
                .target(REST_URI)                
                .path("usuarios/cadastro")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.json(usuarioJson), Usuario.class);
                //.post(Entity.json(Usuario.class), Usuario.class);
        */       
        
        
                //.post(Entity.json(Usuario.class), Usuario.class);
            
    }
                       
    
}
