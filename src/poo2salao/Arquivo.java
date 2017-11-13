/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author baroni
 */
public class Arquivo {
    //private static String path;
    public Arquivo() {
        //Arquivo.path = nome+".txt";
    }
    
    public ArrayList lerUsuarios(String path) {
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Usuario> lista = (ArrayList<Usuario>) ois.readObject();
            ois.close();
            return lista;
        } catch (Exception e) {  
            System.out.println("Erro ao ler arquivo. Se esta for a primeira execução, ignore este erro!");  
            return new ArrayList();
        }
    }
    
    public ArrayList lerClientes(String path) {
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Cliente> lista = (ArrayList<Cliente>) ois.readObject();
            ois.close();
            return lista;
        } catch (Exception e) {  
            System.out.println("Erro ao ler arquivo. Se esta for a primeira execução, ignore este erro!");  
            return new ArrayList();
        }
    }
    
    public ArrayList lerComandas(String path) {
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Comanda> lista = (ArrayList<Comanda>) ois.readObject();
            ois.close();
            return lista;
        } catch (Exception e) {  
            System.out.println("Erro ao ler arquivo. Se esta for a primeira execução, ignore este erro!");  
            return new ArrayList();
        }
    }
    
    public ArrayList lerAgendas(String path) {
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Agenda> lista = (ArrayList<Agenda>) ois.readObject();
            ois.close();
            return lista;
        } catch (Exception e) {  
            System.out.println("Erro ao ler arquivo. Se esta for a primeira execução, ignore este erro!");  
            return new ArrayList();
        }
    }

    void armUsuarios(ArrayList<Usuario> lista, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
        } catch (Exception e) {  
            System.out.println("Erro ao aramzenar arquivo!!");
        } 
    }

    void armClientes(ArrayList<Cliente> lista, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
        } catch (Exception e) {  
            System.out.println("Erro ao aramzenar arquivo!!");
        } 
    }

    void armComandas(ArrayList<Comanda> lista, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
        } catch (Exception e) {  
            System.out.println("Erro ao aramzenar arquivo!!");
        } 
    }

    void armAgendas(ArrayList<Agenda> lista, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
        } catch (Exception e) {  
            System.out.println("Erro ao aramzenar arquivo!!");
        } 
    }
}