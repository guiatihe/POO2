/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;

import java.io.Serializable;

/**
 * Classe com atributos de Cliente
 * @author Matheus Baroni
 */
public class Cliente implements Serializable {
    private String id; //CPF
    private String nome;
    private char sexo;
    private String status;
    private String endereco;
    private String email;
    private String telefone;
    
    public Cliente(String n, String id, char s, String end, String e, String t){
        this.id = id;
        this.nome = n;
        this.sexo = s;
        this.endereco = end;
        this.email = e;
        this.telefone = t;
        this.status = "Ativo";
    }
    
    public boolean inativar(){
        this.status = "Inativo";
        return true;
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public char getSexo (){
        return this.sexo;
    }
    
    public String getStatus (){
        return this.status;
    }
    
    public String getEndereco (){
        return this.endereco;
    }
    
    public String getEmail (){
        return this.email;
    }
    
    public String getTelefone (){
        return this.telefone;
    }
    
    public String getCPF (){
        return this.id;
    }
}
