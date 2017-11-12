/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 *
 * @author baroni
 */
public class Servico implements Serializable{

    private long codigo;
    private boolean status;
    private String idFuncionario;
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private String servico;
    private String cpf_cliente;
    
    public Servico(){
        this.status = false;
    }
    
    public Servico(String func, int d, int m, int a, int h, String serv, String cpf){
        this.status = true;
        this.idFuncionario = func;
        this.dia = d;
        this.mes = m;
        this.ano = a;
        this.hora = h;
        this.servico = serv;
        this.cpf_cliente = cpf;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	long x = timestamp.getTime();
        this.codigo = x;
    }
    
    public void excluir_servico(){
        this.status = false;
    }
    
    public String get_funcionario(){
        return idFuncionario;
    }
    
    public int get_dia(){
        return dia;
    }
    
    public int get_mes(){
        return mes;
    }
    
    public int get_ano(){
        return ano;
    }
    
    public int get_hora(){
        return hora;
    }
    
    public String get_servico(){
        return servico;
    }
    
    public boolean get_status(){
        return status;
    }
    
    public long get_codigo(){
        return codigo;
    }
}