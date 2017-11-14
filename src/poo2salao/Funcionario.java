/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;

/**
 * Classe com atributos de Funcionario (herda Usuario)
 * @author Gustavo Batistic
 */
public class Funcionario extends Usuario implements Assalariado{
    private float porcentagem;
    
    public Funcionario(String u_id, String s, String n, int i, String e, String t, float p){
        super(u_id, s, n, i, e, t);
        this.nivel_acesso = 3;
        this.porcentagem = p;
    }
    public float get_porcentagem(){
        return porcentagem;
    }
    @Override
    public String get_salario(){
        return porcentagem + "% do valor dos serviços realizados";
    }
    
}
