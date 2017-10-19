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
public class Proprietario extends Usuario implements Assalariado{
    private float salario_anual;
    
    public Proprietario(String u_id, String s, String n, int i, String e, String t, int na, float si){
        super(u_id, s, n, i, e, t, na);
        this.salario_anual = si;
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
    public float get_salario_anual(){
        return salario_anual;
    }
    @Override
    public String get_salario(){
        return salario_anual + " reais por ano";
    }
}
