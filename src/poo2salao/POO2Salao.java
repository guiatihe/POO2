/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;

import java.util.Scanner;

/**
 *
 * @author baroni
 */
public class POO2Salao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Controle controle = new Controle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo(a)");
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();


        // chamar funcao de autenticacao
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        int escolha;
        boolean menu = true;
        while(menu == true){
        
        
        System.out.println("Menu: ");
        System.out.println("1. Usuários");
        System.out.println("2. Serviços");
        System.out.println("3. Clientes");
        System.out.println("4. Comandas");
        System.out.println("5. Sair");
        int entrada = scanner.nextInt();
        
        if(entrada == 1){
        System.out.println("1. Criar novo usuário");
        System.out.println("2. Excluir usuário");
        System.out.println("3. Voltar");
        escolha = scanner.nextInt();
        if(escolha == 1){
            System.out.print("Insira o CPF do usuário: ");
            int id = scanner.nextInt();
            System.out.print("Insira o nome do usuário: ");
            String nome = scanner.nextLine();
            System.out.print("Insira a idade do usuário: ");
            int idade = scanner.nextInt();
            System.out.print("Escolha o sexo do usuário: ");
            System.out.println("1. Masculino");
            System.out.println("2. Feminino");
            int respsexo = scanner.nextInt();
            char sexo;
            if(respsexo == 1){
                sexo = 'M';
            }
            else if(respsexo == 2){
                sexo = 'F';
            }
            System.out.print("Insira o endereço do usuário: ");
            String endereco = scanner.nextLine();
            System.out.print("Insira o telefone do usuário: ");
            int telefone = scanner.nextInt();
            System.out.print("Escolha o perfil do usuário: ");
            System.out.println("1. Proprietário. ");
            System.out.println("2. Atendente. ");
            System.out.println("3. Funcionário. ");
            int nivel_acesso = scanner.nextInt();
            controle.cadastrarUsuario(id, nome, idade, sexo, endereco, telefone, nivel_acesso);
        }
        
        
        }
        else if(entrada == 2){
        System.out.println("1. Agendar serviço");
        System.out.println("2. Cancelar serviço");
        escolha = scanner.nextInt();
        }
        else if(entrada == 3){
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Excluir cliente");
        escolha = scanner.nextInt();
        }
        else if(entrada == 4){
        System.out.println("1. Criar nova comanda");
        System.out.println("2. Adicionar item à comanda");
        System.out.println("3. Remover item de uma comanda");
        System.out.println("4. Listar itens da comanda");
        System.out.println("5. Fechar comanda");
        System.out.println("6. Listar comandas abertas");
        System.out.println("7. Voltar");
        escolha = scanner.nextInt();
        
        
        }
        else if(entrada == 5){
        menu = false;
        }
        }
        
        
    }
    
}
