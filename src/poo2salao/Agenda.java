/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;
import java.util.ArrayList;

/**
 *
 * @author baroni
 */
public class Agenda {
    
    private ArrayList<Servico> servicos = new ArrayList();
    private int funcionario;
    
    public Agenda(int func){
        this.funcionario = func;
    }
    
    public boolean adicionar_servico(int func, int d, int m, int a, int h, String serv, String cpf){
        if(this.status_horario(d, m, a, h)){
            Servico novo_serv = new Servico(func, d, m, a, h, serv, cpf);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean remover_servico(long cod_servico){
        int i;
        int tam = this.servicos.size();
        for(i=0;i<tam;i++){
            if(this.servicos.get(i).get_codigo() == cod_servico){
                if(this.servicos.get(i).get_status() == true){
                    this.servicos.get(i).excluir_servico();
                    return true;
                }
            }
        }
        return false;
    }
    public ArrayList exibir_agenda(int dia, int mes, int ano){
        ArrayList<Servico> serv_diarios = new ArrayList();
        
        int i;
        int tam = this.servicos.size();
        for(i=0;i<tam;i++){
            if(this.servicos.get(i).get_dia() == dia){
                if(this.servicos.get(i).get_mes() == mes){
                    if(this.servicos.get(i).get_ano() == ano){
                        serv_diarios.add(this.servicos.get(i));
                    }
                }
            }
        }
        
        return serv_diarios;
    }
    public boolean status_horario(int d, int m, int a, int h){
        int i;
        int tam = this.servicos.size();
        for(i=0;i<tam;i++){
            if(this.servicos.get(i).get_dia() == d){
                if(this.servicos.get(i).get_mes() == m){
                    if(this.servicos.get(i).get_ano() == a){
                        if(this.servicos.get(i).get_hora() == h){
                            if(this.servicos.get(i).get_status() == true){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
}
