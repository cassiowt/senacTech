package com.senac.bd.apl;

import com.senac.bd.controller.JDBCClienteDao;
import com.senac.bd.model.Cliente;


import java.util.List;
import java.util.Scanner;


/*
Classe exeplo de ua aplicação CRUD usando o output do console da IDE
*/
public class aplicacao {
static Scanner  sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean sair = true;        
        
        while (sair) {
            System.out.println("Escolha a opção: ");
            System.out.println("(L) - Listar");
            System.out.println("(C) - Cadastrar");
            System.out.println("(A) - Alterar");
            System.out.println("(E) - Exluir");
            System.out.println("Digite (S) - para sair");
            
            String op = sc.next();

            switch (op) {
                case "L" ->
                    listarClientes();
                case "C" ->
                    cadastrarCliente();
                case ("A") ->
                    alterarCliente();
                default ->
                    sair = false;
            }

        }
    }
    
    /*
     método para lista os clientes do Banco
    */
    private static void listarClientes() {
        JDBCClienteDao op = new JDBCClienteDao();
        List<Cliente> lst = op.listar();
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));

        }
    }

    /*
    Método para cadastrar um novo cliente.
    */
    private static void cadastrarCliente() {       
         System.out.println("Digite o nome do Cliente");
         String nommeCliente = sc.next();
         
         System.out.println("Digite o CPF do Cliente");
         String cpfCliente = sc.next();
        
         Cliente c = new Cliente(0, nommeCliente, cpfCliente);
         JDBCClienteDao op = new JDBCClienteDao();
         op.gravar(c);
         System.out.println("Gravado o Cliente " + c);
    }
    
    /*
    Método para alterar  cliente.
    */
    private static void alterarCliente() {   
         JDBCClienteDao op = new JDBCClienteDao();
         System.out.println("Digite o ID do cliente a ser alterado");
         long idCliente = sc.nextLong();
         Cliente ClienteAlterado =  op.consultar(idCliente);
         System.out.println("O Cliente " + ClienteAlterado + "sera ALTERADO");
         
         System.out.println("Digite o novo nome do Cliente");
         String nommeCliente = sc.next();
         
         System.out.println("Digite o novo CPF do Cliente");
         String cpfCliente = sc.next();
        
         Cliente c = new Cliente(idCliente, nommeCliente, cpfCliente);
         JDBCClienteDao op1 = new JDBCClienteDao();
         op1.gravar(c);
         System.out.println("Gravado o Cliente " + c);
    }


}
