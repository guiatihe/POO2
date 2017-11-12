/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;

import java.io.Serializable;

/**
 *
 * @author baroni
 */
public class Usuario implements Serializable {
    protected String id; // CPF
    protected String senha;
    protected String nome;
    protected int idade;
    protected char sexo; // H - homem, M - mulher
    protected String endereco;
    protected String telefone;
    protected int nivel_acesso; // 1 - proprietario, 2 - atendente, 3 - funcionario
    
    public Usuario(String u_id, String s, String n, int i, String e, String t){
        this.id = u_id;
        this.senha = s;
        this.nome = n;
        this.idade = i;
        this.endereco = e;
        this.telefone = t;
        this.nivel_acesso = 0;
    }
    public void mensagem(){
        if(this.sexo == 'H'){
            System.out.printf("Bem vindo usuário %s!\n", this.nome);
        }
        else{
            System.out.printf("Bem vinda usuária %s!\n", this.nome);
        }
    }
    public boolean verificar_senha(String s){
        if(this.senha == s){
            return true;
        }
        else{
            return false;
        }
    }
    public String get_id(){
        return id;
    }
    public String get_nome(){
        return nome;
    }
    public int get_idade(){
        return idade;
    }
    public String get_endereco(){
        return endereco;
    }
    public String get_telefone(){
        return telefone;
    }
    public int get_nivel(){
        return nivel_acesso;
    }
    public char get_sexo(){
        return sexo;
    }
    public String get_senha(){
        return senha;
    }
}
