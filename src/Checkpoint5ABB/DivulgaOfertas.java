package Checkpoint5ABB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivulgaOfertas {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        ABBClientes clientesFisicos = new ABBClientes();
        ABBClientes clientesJuridicos = new ABBClientes();

        // Clientes Físicos
        clientesFisicos.root = clientesFisicos.inserir(clientesFisicos.root, (new Cliente("João da Silva", "123.456.789-00", 1001, "Física", 2500.75)));
        clientesFisicos.root = clientesFisicos.inserir(clientesFisicos.root, (new Cliente("Maria Oliveira", "987.654.321-11", 1002, "Física", 5300.00)));
        clientesFisicos.root = clientesFisicos.inserir(clientesFisicos.root, (new Cliente("Carlos Souza", "456.789.123-22", 1003, "Física", 1500.50)));

        // Clientes Jurídicos
        clientesJuridicos.root = clientesJuridicos.inserir(clientesJuridicos.root, (new Cliente("Tech Solutions LTDA", "12.345.678/0001-90", 2001, "Jurídica", 105000.00)));
        clientesJuridicos.root = clientesJuridicos.inserir(clientesJuridicos.root, (new Cliente("AgroVale S.A.", "98.765.432/0001-10", 2002, "Jurídica", 320000.50)));
        clientesJuridicos.root = clientesJuridicos.inserir(clientesJuridicos.root, (new Cliente("Construtora Alpha", "11.222.333/0001-55", 2003, "Jurídica", 87000.30)));


        int opcao, op, numeroConta;
        String nome, cpfCnpj;
        String tipoConta = null;
        double saldo;

        do {
            System.out.println(" 0 - Encerrar o programa");
            System.out.println(" 1 - Inscrição cliente");
            System.out.println(" 2 - Oferta de novo serviço e/ou aplicação");
            System.out.println(" 3 – Entrar no Submenu ");
            System.out.println("Informe a opção desejada: ");
            opcao = le.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite nome: ");
                    nome = le.next();
                    System.out.print("Digite cpf: ");
                    cpfCnpj = le.next();
                    System.out.print("Digite numero da conta: ");
                    numeroConta = le.nextInt();

                    do {
                        System.out.print("Digite 1- Pessoa Física 2- Pessoa Jurídica: ");
                        op = le.nextInt();
                        switch (op) {
                            case 1:
                                tipoConta = "Física";
                                break;
                            case 2:
                                tipoConta = "Jurídica";
                                break;
                            default:
                                System.out.println("Opção inválida ");
                                op = -1;
                        }
                    } while (op == -1);
                    System.out.print("Informe saldo em aplicações R$: ");
                    saldo = le.nextDouble();
                    Cliente cliente = new Cliente(nome, cpfCnpj, numeroConta, tipoConta, saldo);
                    System.out.println("Cliente '" + cliente.getNome() + "' gerado");
                    if (tipoConta.equals("Física")) {
                        clientesFisicos.inserir(clientesFisicos.root, cliente);
                    } else {
                        clientesJuridicos.inserir(clientesJuridicos.root, cliente);
                    }
                    break;
                case 2:
                    System.out.print("Qual tipo de conta a oferta se destina? ");
                    do {
                        System.out.print("Digite 1- Pessoa Física 2- Pessoa Jurídica: ");
                        op = le.nextInt();
                        switch (op) {
                            case 1:
                                tipoConta = "Física";
                                break;
                            case 2:
                                tipoConta = "Jurídica";
                                break;
                            default:
                                System.out.println("Opção inválida ");
                                op = -1;
                        }
                    } while (op == -1);
                    System.out.print("Qual o valor de saldo mínimo exigido: R$ ");
                    saldo = le.nextDouble();
                    /*
                     * Fazendo uso de um método da classe ABB, desenvolvido para este
                     * problema, uma lista de clientes aptos para a oferta é gerada.
                     * Nesse trecho de programa que tentar fazer o contato com todos os
                     * clientes presente na lista.
                     */
                    List<Cliente> listaClientesContemplados = new ArrayList<>();

                    if (tipoConta.equals("Física")) {
                        listaClientesContemplados = clientesFisicos.geraClientesContemplados(clientesFisicos.root, listaClientesContemplados, saldo);
                    } else {
                        listaClientesContemplados = clientesJuridicos.geraClientesContemplados(clientesJuridicos.root, listaClientesContemplados, saldo);
                    }
                    for (int i = 0; i < listaClientesContemplados.size(); i++) {
                        System.out.println(listaClientesContemplados.get(i).getNome() + ", " + (i + 1) + "° cliente da lista aceitará a oferta?\n1. Sim\n2. Não");
                        int aceita = le.nextInt();
                        if (aceita == 1) {
                            System.out.println("O cliente '" + listaClientesContemplados.get(i).getNome() + "' aceitou a oferta! Contate-o(a)");
                            if (tipoConta.equals("Física")) {
                                System.out.println(listaClientesContemplados.get(i));
                                clientesFisicos.root = clientesFisicos.removerCliente(clientesFisicos.root, listaClientesContemplados.get(i));
                                clientesFisicos.show(clientesFisicos.root);
                            } else {
                                clientesJuridicos.root = clientesJuridicos.removerCliente(clientesJuridicos.root, listaClientesContemplados.get(i));
                            }
                        } else if (aceita == 2) {
                            System.out.println("O cliente '" + listaClientesContemplados.get(i).getNome() + "' recusou a oferta!");
                        } else {
                            System.out.println("Opção inválida");
                            i--;
                        }
                    }
                    System.out.println("Fim da lista de clientes compatíveis com a oferta");

                case 3:
                    int opt;
                    do {
                        System.out.println("\nSubmenu de Consultas:");
                        System.out.println("1 - Consulta cliente por CPF/CNPJ");
                        System.out.println("2 - Atualizar saldo do cliente pelo número da conta");
                        System.out.println("3 - Apresenta a quantidade de clientes armazenados na ABB");
                        System.out.println("4 - Apresenta a quantidade de clientes com saldo acima de um valor");
                        System.out.println("5 - Voltar ao menu principal");
                        System.out.print("Escolha: ");
                        opt = le.nextInt();
                        switch (opt) {
                            case 1:
                                System.out.print("Digite CPF ou CNPJ: ");
                                cpfCnpj = le.next();
                                Cliente encontradoF = clientesFisicos.buscaPorCpfCnpj(clientesFisicos.root, cpfCnpj);
                                Cliente encontradoJ = clientesJuridicos.buscaPorCpfCnpj(clientesJuridicos.root, cpfCnpj);
                                if (encontradoF != null) {
                                    System.out.println("Cliente encontrado: " + encontradoF);
                                } else if (encontradoJ != null) {
                                    System.out.println("Cliente encontrado: " + encontradoJ);
                                } else {
                                    System.out.println("Cliente não encontrado!");
                                }
                                break;
                            case 2:
                                System.out.print("Digite número da conta: ");
                                numeroConta = le.nextInt();
                                System.out.print("Digite novo saldo: ");
                                saldo = le.nextDouble();
                                boolean atualizado = clientesFisicos.atualizaSaldo(clientesFisicos.root, numeroConta, saldo)
                                        || clientesJuridicos.atualizaSaldo(clientesJuridicos.root, numeroConta, saldo);
                                if (atualizado) {
                                    System.out.println("Saldo atualizado com sucesso!");
                                } else {
                                    System.out.println("Conta não encontrada!");
                                }
                                break;
                            case 3:
                                System.out.println("Quantidade de clientes físicos: " + clientesFisicos.contaClientes(clientesFisicos.root, 0));
                                System.out.println("Quantidade de clientes jurídicos: " + clientesJuridicos.contaClientes(clientesJuridicos.root, 0));
                                break;
                            case 4:
                                System.out.print("Informe o valor mínimo: ");
                                double valorMin = le.nextDouble();
                                int qtdF = clientesFisicos.contaClientesAcimaDe(clientesFisicos.root, valorMin);
                                int qtdJ = clientesJuridicos.contaClientesAcimaDe(clientesJuridicos.root, valorMin);
                                System.out.println("Físicos acima de " + valorMin + ": " + qtdF);
                                System.out.println("Jurídicos acima de " + valorMin + ": " + qtdJ);
                                break;
                            case 5:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (opt != 5);
                    break;
            }
        } while (opcao != 0);
        System.out.println("Clientes que não aceitaram ou não estavam adequados para a oferta");
        /*
         * Esvazia as ABBs apresentando todos os clientes que aguardam nova portunidade
         */
        le.close();
    }
}
