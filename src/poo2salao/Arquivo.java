/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author baroni
 */
public class Arquivo {
    private static String path;
    public Arquivo(String nome) {
        this.path = nome+".txt";
    }
    
    public void armazenarUsuarios(ArrayList<Usuario> lista) {
        try {  
            FileWriter escrita = new FileWriter(this.path);  
            BufferedWriter escritor = new BufferedWriter(escrita);  
  
            for(int i=0;i< lista.size();i++){  
                escritor.write(lista.get(i).get_id());
                escritor.newLine();
                escritor.write(lista.get(i).get_senha());
                escritor.newLine();
                escritor.write(lista.get(i).get_nome());
                escritor.newLine();
                escritor.write(lista.get(i).get_idade());
                escritor.newLine();
                escritor.write(lista.get(i).get_sexo());
                escritor.newLine();
                escritor.write(lista.get(i).get_endereco());
                escritor.newLine();
                escritor.write(lista.get(i).get_telefone());
                escritor.newLine();
                escritor.write(lista.get(i).get_nivel());
                escritor.newLine();
            }  
              
            escritor.flush();  
            escritor.close();  
            escrita.close();  
              
        } catch (Exception e) {  
            System.out.println("Erro ao criar arquivo!!");  
  
        }  
    }  
    
     public void armazenarClientes(ArrayList<Cliente> lista) {
        
    } 
     
     public void armazenarAgendas(ArrayList<Agenda> lista) {
        
    } 
     
     public void armazenarComandas(ArrayList<Comanda> lista) {
        
    } 
    /*
    public void armazenar(ArrayList<String> lista) {  
        try {  
            FileWriter escrita = new FileWriter(this.path);  
            BufferedWriter escritor = new BufferedWriter(escrita);  
  
            for(int i=0;i< lista.size();i++){  
                escritor.write(lista.get(i));  
                escritor.newLine();  
            }  
              
            escritor.flush();  
            escritor.close();  
            escrita.close();  
              
        } catch (Exception e) {  
            System.out.println("Erro ao criar arquivo!!");  
  
        }  
    }  */
      
    public ArrayList ler() {
        try{
            Scanner s = new Scanner(new File(this.path));
            ArrayList<String> list = new ArrayList<String>();
            while (s.hasNextLine()){
                list.add(s.nextLine());
            }
            s.close();
            return list;
        } catch (Exception e) {  
            System.out.println("Erro ao criar arquivo!!");  
            return null;
        }
    }
}
