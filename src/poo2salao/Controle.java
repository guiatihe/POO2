/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;
import java.util.ArrayList;
import java.util.Scanner;  

/**
 *
 * @author Gustavo
 */
public class Controle {
    private ArrayList<Usuario> usuarios = new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Comanda> comandas = new ArrayList();
    private ArrayList<Agenda> agendas = new ArrayList();
    
    public Controle(){
        String ad = "admin";
        cadastrarProprietario(ad,ad,ad,0,ad,ad,0);
        
        ArrayList<String> listaUsuarios = new ArrayList();
        ArrayList<String> listaClientes = new ArrayList();
        ArrayList<String> listaAgendas = new ArrayList();
        ArrayList<String> listaComandas = new ArrayList();
        ArrayList<Arquivo> arq = new ArrayList();
        arq.add(new Arquivo("usuarios"));
        arq.add(new Arquivo("clientes"));
        arq.add(new Arquivo("comandas"));
        arq.add(new Arquivo("agendas"));
        listaUsuarios = arq.get(0).ler();
        listaClientes = arq.get(1).ler();
        listaComandas = arq.get(2).ler();
        listaAgendas = arq.get(3).ler();
        // Falta implementar funções que cadastram todos os objetos a partir do material presenta nas listas
    }
    
    public boolean login(String usuario, String senha){
        Arquivo usr = new Arquivo("usuarios");
        ArrayList<String> arq = usr.ler();
        for(int i = 0; i < arq.size(); i+=8){
            if(arq.get(i).equals(usuario) && arq.get(i+1).equals(senha)){
                return true;
            }
        }
        return false;
    }
    public int quantProprietarios(){
        int n=0;
        int cont;
        for(cont=0;cont<usuarios.size();cont++){
            if(usuarios.get(cont).get_nivel() == 1){
                n++;
            }
        }
        return n;
    }
    public boolean cadastrarProprietario(String u_id, String s, String n, int i, String e, String t, float si){
        int cont;
        for(cont=0;cont<usuarios.size();cont++){
            if(u_id.equals(usuarios.get(cont).get_id())){
                return false;
            }
        }
        Proprietario novo_u = new Proprietario(u_id, s, n, i, e, t, si);
        usuarios.add(novo_u);
        return true;
    }
    public boolean excluirProprietario(String id){
        if(quantProprietarios()==1){
            return false;
        }
        int cont;
        for(cont=0;cont<usuarios.size();cont++){
            if(id.equals(usuarios.get(cont).get_id())){
                usuarios.remove(usuarios.get(cont));
                return true;
            }
        }
        return false;
    }
    public boolean cadastrarAtendente(String u_id, String s, String n, int i, String e, String t, float sm){
        int cont;
        for(cont=0;cont<usuarios.size();cont++){
            if(u_id.equals(usuarios.get(cont).get_id())){
                return false;
            }
        }
        Atendente novo_u = new Atendente(u_id, s, n, i, e, t, sm);
        usuarios.add(novo_u);
        return true;
    }
    public boolean cadastrarFuncionario(String u_id, String s, String n, int i, String e, String t, float p){
        int cont;
        for(cont=0;cont<usuarios.size();cont++){
            if(u_id.equals(usuarios.get(cont).get_id())){
                return false;
            }
        }
        Funcionario novo_u = new Funcionario(u_id, s, n, i, e, t, p);
        usuarios.add(novo_u);
        return true;
    }
    public boolean excluirUsuario(String id){
        int cont;
        for(cont=0;cont<usuarios.size();cont++){
            if(id.equals(usuarios.get(cont).get_id())){
                usuarios.remove(usuarios.get(cont));
                return true;
            }
        }
        return false;
    }
    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
    public boolean cadastrarCliente(String n, String id, char s, String end, String e, String t){
        int cont;
        for(cont=0;cont<clientes.size();cont++){
            if(id.equals(clientes.get(cont).getCPF())){
                return false;
            }
        }
        Cliente novo_c = new Cliente(n, id, s, end, e, t);
        clientes.add(novo_c);
        return true;
    }
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    public boolean excluirCliente(String id){
        int cont;
        for(cont=0;cont<clientes.size();cont++){
            if(id.equals(clientes.get(cont).getCPF())){
                clientes.remove(clientes.get(cont));
                return true;
            }
        }
        return false;
    }
    public boolean adicionarAgenda(String idFuncionario){
        int cont;
        for(cont=0;cont<clientes.size();cont++){
            if(idFuncionario.equals(agendas.get(cont).getFuncionario())){
                return false;
            }
        }
        Agenda nova_a = new Agenda(idFuncionario);
        agendas.add(nova_a);
        return true;
    }
    public ArrayList<Servico> exibirAgenda(String idFuncionario, int d, int m, int a){
        int cont;
        ArrayList<Servico> serv_diarios = new ArrayList();
        for(cont=0;cont<agendas.size();cont++){
            if(idFuncionario.equals(agendas.get(cont).getFuncionario())){
                serv_diarios = agendas.get(cont).exibir_agenda(d, m, a);
            }
        }
        return serv_diarios;
    }
    public boolean excluirAgenda(String idFuncionario){
        int cont;
        for(cont=0;cont<agendas.size();cont++){
            if(idFuncionario.equals(agendas.get(cont).getFuncionario())){
                agendas.remove(agendas.get(cont));
                return true;
            }
        }
        return false;
    }
    public boolean adicionarServico(String func, int d, int m, int a, int h, String serv, String cpf){
        int cont;
        for(cont=0;cont<agendas.size();cont++){
            if(func.equals(agendas.get(cont).getFuncionario())){
                if(agendas.get(cont).adicionarServico(func, d, m, a, h, serv, cpf)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean cancelarServico(String func, long cod){
        int cont;
        for(cont=0;cont<agendas.size();cont++){
            if(func.equals(agendas.get(cont).getFuncionario())){
                if(agendas.get(cont).remover_servico(cod)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean adicionarComanda(String cpfCliente){
        comandas.add(new Comanda(cpfCliente));
        return true;
    }
    public boolean adicionarItemComanda(long id, String produto, int qtd, double valor){
        int cont;
        for(cont=0;cont<comandas.size(); cont++){
            if(comandas.get(cont).get_id() == id){
                comandas.get(cont).add(produto, qtd, valor);
                return true;
            }
        }
        return false;
    }
    public boolean removerItemComanda(long id, String produto){
        int cont;
        for(cont=0;cont<comandas.size(); cont++){
            if(comandas.get(cont).get_id() == id){
                if(comandas.get(cont).remove(produto))
                    return true;
            }
        }
        return false;
    }
    public Comanda exibirComanda(long id){
        int n=0;
        int cont;
        for(cont=0;cont<comandas.size(); cont++){
            if(comandas.get(cont).get_id() == id){
                n = cont;
                break;
            }
        }
        return comandas.get(n);
    }
    public ArrayList<Comanda> exibirComandas(){
        return comandas;
    }
    public boolean fecharComanda(long id){
        int cont;
        for(cont=0;cont<comandas.size(); cont++){
            if(comandas.get(cont).get_id() == id){
                comandas.get(cont).fechar_comanda();
                return true;
            }
        }
        return false;
    }
    public boolean excluirComanda(long id){
        int cont;
        for(cont=0;cont<comandas.size(); cont++){
            if(comandas.get(cont).get_id() == id){
                comandas.remove(comandas.get(cont));
                return true;
            }
        }
        return false;
    }
    public void sair(){
        // Por enquanto salva apenas os usuários
        ArrayList<Arquivo> arq = new ArrayList();
        arq.add(new Arquivo("usuarios"));
        arq.add(new Arquivo("clientes"));
        arq.add(new Arquivo("comandas"));
        arq.add(new Arquivo("agendas"));
        arq.get(0).armazenarUsuarios(usuarios);
        arq.get(1).armazenarClientes(clientes);
        arq.get(2).armazenarComandas(comandas);
        arq.get(3).armazenarAgendas(agendas);
    }
}
