/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;
import java.sql.Timestamp;
import java.util.ArrayList;
/**
 *
 * @author baroni
 */
public class Comanda {
    private long id;
    private String idCliente;
    private double valorFinal = 0;
    private ArrayList<String> produto = new ArrayList();
    private ArrayList<Long> valor = new ArrayList();
    
    public Comanda(String c){
        this.idCliente = c;
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	long x = timestamp.getTime();
        this.id = x;
    }
    
    public void incValorFinal (long v) {
        this.valorFinal += v;
    }
    
    public boolean add(String p, int q, long v){
        for(int i = 0; i < q; i++) {
            this.produto.add(p);
            this.valor.add(v);
            this.incValorFinal(v);
        }
        return true;
    }
    
    public boolean remove(int q, String p){
        int cont = 0;
        for(int i = 0; i < produto.size(); i++) {
            if(p.equals(produto.get(i))){
                cont++;
            }
        }
        if(cont > q){
            return false;
        } else {
            for(int i = 0; i < produto.size(); i++) {
                if(p.equals(produto.get(i)) && cont > 0){
                    produto.remove(i);
                    cont--;
                    this.incValorFinal(-1*valor.get(i));
                    valor.remove(i);
                }
            } 
        } 
        return true;
    }
    
    public boolean remove(String p){
        for(int i = 0; i < produto.size(); i++) {
            if(p.equals(produto.get(i))){
                this.incValorFinal((-1)*(valor.get(i)));
                valor.remove(i);
                produto.remove(i);
            }
        } return true;
    }
}
