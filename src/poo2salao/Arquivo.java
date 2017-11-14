/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;

import java.io.*;
import java.util.ArrayList;
/**
 * Manipulador de arquivos para a persistnecia de objetos
 * @author Matheus Baroni
 */
public class Arquivo {

    /**
     * Leitura dos Objetos tipo Usuario
     * @param path - caminho do arquivo
     * @return ArrayList contendo os objetos deserializados
     */
    public ArrayList lerUsuarios(String path) {
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Usuario> lista = (ArrayList<Usuario>) ois.readObject();
            ois.close();
            return lista;
        } catch (Exception e) {  
            System.out.println("Erro ao ler usuarios. Se esta for a primeira execução, ignore este erro!");  
            return new ArrayList();
        }
    }
    /**
     * Leitura dos Objetos tipo Cliente
     * @param path - caminho do arquivo
     * @return ArrayList contendo os objetos deserializados
     */
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
    /**
     * Leitura dos Objetos tipo Comanda
     * @param path - caminho do arquivo
     * @return ArrayList contendo os objetos deserializados
     */
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
    /**
     * Leitura dos Objetos tipo Agenda
     * @param path - caminho do arquivo
     * @return ArrayList contendo os objetos deserializados
     */
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
    /**
     * Armazenamento dos Objetos Serializados tipo Usuario
     * @param lista - Lista de Objetos a ser gravada
     * @param path - Caminho do arquivo
     */
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
    /**
     * Armazenamento dos Objetos Serializados tipo Cliente
     * @param lista - Lista de Objetos a ser gravada
     * @param path - Caminho do arquivo
     */
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
    /**
     * Armazenamento dos Objetos Serializados tipo Comanda
     * @param lista - Lista de Objetos a ser gravada
     * @param path - Caminho do arquivo
     */
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
    /**
     * Armazenamento dos Objetos Serializados tipo Agenda
     * @param lista - Lista de Objetos a ser gravada
     * @param path - Caminho do arquivo
     */
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