/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;

/**
 *
 * @author Gustavo
 */
public class Funcionario extends Usuario{
    private float porcentagem;
    
    public Funcionario(String u_id, String s, String n, int i, String e, String t, int na, float p){
        super(u_id, s, n, i, e, t, na);
        this.porcentagem = p;
    }
    
}
