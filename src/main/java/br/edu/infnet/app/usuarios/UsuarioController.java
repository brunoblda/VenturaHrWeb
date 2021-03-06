/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.app.usuarios;

import br.edu.infnet.infra.usuarios.UsuarioService;
import br.edu.infnet.domain.usuarios.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringUtils;
import java.lang.reflect.Field;
import java.time.Clock;
/**
 *
 * @author bruno
 */
@WebServlet(name = "UsuarioController", urlPatterns = {"/cadastrar","/confirmacao","/index"})
public class UsuarioController extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url;
        
        String userPath = request.getServletPath();
        
        if (userPath.equals("/index")){            
            url = userPath + ".jsp";
            
        }else {           
            url = "/usuarios" + userPath + ".jsp";           
            if (userPath.equals("/cadastrar")){                            
            }
            if (userPath.equals("/confirmacao")){            
                
            } 
            
        }   
        try{
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception ex){
            ex.printStackTrace();
        }       
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url;
        
        String userPath = request.getServletPath();
        
        if (userPath.equals("/cadastrar")){
            
            url = userPath + ".jsp";                
        
            List<String> principalStrings = new ArrayList<String>();

            String nome = request.getParameter("nome");
            String endereco = request.getParameter("endereco");
            String telefone = request.getParameter("telefone");
            String email = request.getParameter("email");
            String senha1 = request.getParameter("senha1");
            String senha2 = request.getParameter("senha2");
            String tipoDeConta = request.getParameter("tipoDeConta");
         
                 
            Collections.addAll(principalStrings, nome, endereco,telefone, email
            , senha1, senha2, tipoDeConta);
            
            String cpf = request.getParameter("cpf");
            String razaoSocial = request.getParameter("razaoSocial");
            String cnpj = request.getParameter("cnpj");
                        
            url = "/usuarios" + userPath + ".jsp";
            
            RequestDispatcher rd = request.getRequestDispatcher(url);
                     
            for (String principalString : principalStrings) {
                if (!StringUtils.isNotBlank(principalString)){
                                                                   
                    request.setAttribute("erro", "Algum campo n??o foi preenchido");
                    
                    rd.forward(request, response);
                }
            }
            
            if (!senha1.equals(senha2)){
                
                request.setAttribute("erro", "A palavra-chave escrita no campo confirma????o de senha deve ser igual ?? escrita no campo senha");
                    
                    rd.forward(request, response);            
                
            }

            if ("Empresa".equals(tipoDeConta)){

                if (!StringUtils.isNotBlank(razaoSocial) || !StringUtils.isNotBlank(cnpj) ){

                    request.setAttribute("erro"," Raz??o Social ou CNPJ n??o foram preenchidos");
                    
                    rd.forward(request, response);

                }                                    
            }

            if ("Candidato".equals(tipoDeConta)){

                if (!StringUtils.isNotBlank(cpf) ){

                    request.setAttribute("erro"," CPF n??o foi preenchido");
                    
                    rd.forward(request, response);
                }  
            }
            
            Usuario usuarioEscrito = new Usuario();
            
            usuarioEscrito.setNome(nome);          
            usuarioEscrito.setEndereco(endereco);
            usuarioEscrito.setTelefone(telefone);
            usuarioEscrito.setEmail(email);
            usuarioEscrito.setSenha(senha2);
            usuarioEscrito.setTipoDeConta(tipoDeConta);
            usuarioEscrito.setCpf(cpf);
            usuarioEscrito.setCnpj(cnpj);
            usuarioEscrito.setRazaoSocial(razaoSocial);

            UsuarioService us = new UsuarioService();
            us.CadastrarUsuario(usuarioEscrito);
            
            url = "/usuarios/confirmacao.jsp";       
            
            rd = request.getRequestDispatcher(url);
            rd.forward(request, response);                             
        }                               
    }
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}