/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;
import java.util.ArrayList;

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
}
