/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
/**
 * Classe com atributos de Comanda
 * @author Matheus Baroni
 */
public class Comanda implements Serializable {
    private boolean status;
    private long id;
    private String idCliente;
    private double valorFinal;
    private ArrayList<String> produtos = new ArrayList();
    private ArrayList<Double> valores = new ArrayList<Double>();
    
    public boolean getStatus(){
        return status;
    }
    public long get_id(){
        return id;
    }
    public String get_idCliente(){
        return idCliente;
    }
    public double get_valorFinal(){
        return valorFinal;
    }
    public ArrayList<String> get_produtos(){
        return produtos;
    }
    public ArrayList<Double> get_valores(){
        return valores;
    }
    public Comanda(String c){
        this.idCliente = c;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	long x = timestamp.getTime();
        this.id = x;
        this.valorFinal = 0;
        this.status = true;
    }
    public void fechar_comanda(){
        this.status = false;
    }
    public void incValorFinal (double v) {
        this.valorFinal += v;
    }
    public boolean add(String p, int q, double v){
        for(int i = 0; i < q; i++) {
            this.produtos.add(p);
            this.valores.add(v);
            this.incValorFinal(v);
        }
        return true;
    }
    public boolean remove(int q, String p){
        int cont = 0;
        for(int i = 0; i < produtos.size(); i++) {
            if(p.equals(produtos.get(i))){
                cont++;
            }
        }
        if(cont > q){
            return false;
        } else {
            for(int i = 0; i < produtos.size(); i++) {
                if(p.equals(produtos.get(i)) && cont > 0){
                    produtos.remove(i);
                    cont--;
                    this.incValorFinal(-1*valores.get(i));
                    valores.remove(i);
                }
            } 
        } 
        return true;
    }
    public boolean remove(String p){
        for(int i = 0; i < produtos.size(); i++) {
            if(p.equals(produtos.get(i))){
                this.incValorFinal((-1)*(valores.get(i)));
                valores.remove(i);
                produtos.remove(i);
            }
        } return true;
    }
}
