/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2salao;

import java.util.Scanner;
import java.util.ArrayList;

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
        int escolha, i;
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
            scanner.next();
            String id = scanner.nextLine();
            System.out.println("Insira a senha: ");
            String novasenha = scanner.nextLine();
            System.out.print("Insira o nome do usuário: ");
            String nome = scanner.nextLine();
            System.out.print("Insira a idade do usuário: ");
            int idade = scanner.nextInt();
            System.out.print("Escolha o sexo do usuário: ");
            System.out.println("1. Masculino");
            System.out.println("2. Feminino");
            int respsexo = scanner.nextInt();
            char sexo = 'a';
            if(respsexo == 1){
                sexo = 'M';
            }
            else if(respsexo == 2){
                sexo = 'F';
            }
            System.out.print("Insira o endereço do usuário: ");
            scanner.next();
            String endereco = scanner.nextLine();
            System.out.print("Insira o telefone do usuário: ");
            String telefone = scanner.nextLine();
            System.out.print("Escolha o perfil do usuário: ");
            System.out.println("1. Proprietário. ");
            System.out.println("2. Atendente. ");
            System.out.println("3. Funcionário. ");
            int nivel_acesso = scanner.nextInt();
            if (nivel_acesso == 1){
                System.out.print("Insira o salário anual: ");
            float salario = scanner.nextFloat();
            controle.cadastrarProprietario(id,novasenha, nome,idade, endereco, telefone,salario);}
            else if (nivel_acesso == 2){
            System.out.print("Insira o salário mensal: ");
            float salario = scanner.nextFloat();
            controle.cadastrarAtendente(id,novasenha, nome,idade, endereco, telefone,salario);}
            else if (nivel_acesso == 3){
            System.out.print("Insira a porcentagem por servicos: ");
            float salario = scanner.nextFloat();
            controle.cadastrarFuncionario(id,novasenha, nome,idade, endereco, telefone,salario);}
        }
        else if(escolha == 2) {
            System.out.println("1. Proprietário");
            System.out.println("2. Outros usuários");
            int perfil = scanner.nextInt();
            if(perfil == 1){
                System.out.print("Insira o id: ");
                scanner.next();
                String idexcluido = scanner.nextLine();
                controle.excluirProprietario(idexcluido);
            }
            else if(perfil == 2){
                System.out.print("Insira o id: ");
                scanner.next();
                String idexcluido = scanner.nextLine();
                controle.excluirUsuario(idexcluido);}
        }
        else if (escolha == 3){}
        }
        
        else if(entrada == 2){
        System.out.println("1. Agendar serviço");
        System.out.println("2. Cancelar serviço");
        System.out.println("3. Voltar");
        escolha = scanner.nextInt();
        if(escolha == 1){
        System.out.print("Insira o id do funcionário: ");
        scanner.next();
        String idfuncionario = scanner.nextLine();
        System.out.print("Insira o dia do serviço: ");
        int dia = scanner.nextInt();
        System.out.print("Insira o mês do serviço: ");
        int mes = scanner.nextInt();
        System.out.print("Insira o ano do serviço: ");
        int ano = scanner.nextInt();
        System.out.print("Insira o horario do serviço: ");
        int hora = scanner.nextInt();
        System.out.print("Insira o nome do serviço: ");
        scanner.next();
        String nomeservico = scanner.nextLine();
        System.out.print("Insira o cpf do cliente: ");
        String cpfcliente = scanner.nextLine();
        
        
        controle.adicionarServico(idfuncionario, dia, mes, ano, hora, nomeservico, cpfcliente);
        
        }
        
        else if(escolha == 2){
        System.out.print("Insira o id do funcionário: ");
        scanner.next();
        String idfuncionario = scanner.nextLine();
        System.out.print("Insira o dia do serviço: ");
        long codigo = scanner.nextLong();
        
        controle.cancelarServico(idfuncionario, codigo);
        }
        else{}
        }
        else if(entrada == 3){
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Excluir cliente");
        System.out.println("3. Voltar");
        escolha = scanner.nextInt();
        if(escolha == 1){
        System.out.print("Insira o nome do cliente: ");
        scanner.next();
        String nomeCliente = scanner.nextLine();
        System.out.print("Insira o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();
        System.out.print("Escolha o sexo do cliente: ");
            System.out.println("1. Masculino");
            System.out.println("2. Feminino");
            int respsexocliente = scanner.nextInt();
            char sexocliente = 0;
            if(respsexocliente == 1){
                sexocliente = 'M';
            }
            else if(respsexocliente == 2){
                sexocliente = 'F';
            }
        System.out.print("Insira o endereço do cliente: ");
        scanner.next();
        String enderecoCliente = scanner.nextLine();
        System.out.print("Insira o email do cliente: ");
        String emailCliente = scanner.nextLine();
        System.out.print("Insira o telefone do cliente: ");
        String telefoneCliente = scanner.nextLine();
        
        controle.cadastrarCliente(nomeCliente, cpfCliente, sexocliente, enderecoCliente, emailCliente, telefoneCliente);
        }
        else if(escolha == 2){
        System.out.print("Insira o id do cliente: ");
        scanner.next();
        String idCliente = scanner.nextLine();
        controle.excluirCliente(idCliente);
        }
        else{}
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
        if(escolha == 1){
            System.out.println("Digite o CPF do cliente");
            scanner.next();
            String cpfCliente = scanner.nextLine(); 
            controle.adicionarComanda(cpfCliente);
        }
        else if(escolha == 2){
            System.out.println("Digite o iD da comanda");
            long id = scanner.nextLong();
            System.out.println("Digite o serviço:");
            scanner.next();
            String produto = scanner.nextLine();
            System.out.println("Digite a quantidade:");
            int qntd = scanner.nextInt();
            System.out.println("Digite o valor");
            double valor = scanner.nextDouble();
            controle.adicionarItemComanda(id, produto, qntd, valor);
        }
        else if(escolha == 3){
            System.out.printf("Digite o ID da comanda/n");
            long id = scanner.nextLong();
            System.out.println("Digite o serviço");
            scanner.next();
            String produto = scanner.nextLine();
            controle.removerItemComanda(id, produto);
            
        }
        else if(escolha == 4){
            System.out.println("Digite o ID da comanda");
            long id = scanner.nextLong();
            Comanda comanda = controle.exibirComanda(id);
            System.out.printf("CPF do cliente: %s - Valor: R$%lf\n",comanda.get_idCliente(),comanda.get_valorFinal());
            for(i=0;i<comanda.get_produtos().size();i++){
                System.out.printf("%s: R$%lf\n",comanda.get_produtos().get(i),comanda.get_valores().get(i));
            }
        }
        else if(escolha == 5){
            System.out.printf("Digite o ID da comanda/n");
            long id = scanner.nextLong();
            controle.excluirComanda(id);
        }
        else if(escolha == 6){
            //ArrayList<Comanda> comandas = new ArrayList();
            //comandas = controle.exibirComandas();
            for(i=0;i<controle.exibirComandas().size();i++){
                if(controle.exibirComandas().get(i).getStatus()){
                    System.out.printf("Código: %l - CPF do cliente: %s - Valor: R$%lf\n",controle.exibirComandas().get(i).get_id(),controle.exibirComandas().get(i).get_idCliente(),controle.exibirComandas().get(i).get_valorFinal());
                }
            }
        }
        else if(escolha == 7){}
        }
        
        else if(entrada == 5){
            controle.sair();
        menu = false;
        }
        
    }
    
}}
