/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;

/**
 *
 * @author baroni
 */
public class Atendente extends Usuario{
    private float salario_mensal;
    
    public Atendente(String u_id, String s, String n, int i, String e, String t, int na, float sm){
        super(u_id, s, n, i, e, t, na);
        this.salario_mensal = sm;
    }
}
