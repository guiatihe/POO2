/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;

/**
 * Classe com atributos de Atendente (herda Usuario)
 * @author baroni
 */
public class Atendente extends Usuario implements Assalariado{
    private float salario_mensal;
    
    public Atendente(String u_id, String s, String n, int i, String e, String t, float sm){
        super(u_id, s, n, i, e, t);
        this.nivel_acesso = 2;
        this.salario_mensal = sm;
    }
    @Override
    public void mensagem(){
        if(this.sexo == 'H'){
            System.out.printf("Bem vindo proprietário %s!\n", this.nome);
        }
        else{
            System.out.printf("Bem vinda proprietária %s!\n", this.nome);
        }
    }
    public float get_salario_mensal(){
        return this.salario_mensal;
    }
    @Override
    public String get_salario(){
        return salario_mensal + " reais por mês";
    }
}
