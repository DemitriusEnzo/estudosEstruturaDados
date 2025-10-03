package Arvore.aplicacao;

import Arvore.arvores.ABBint;

import java.util.Scanner;

public class MenuAbb {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        ABBint abb = new ABBint();
        int opcao;
        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir valor na ABB");
            System.out.println("2 - Apresenta ABB (em ordem)");
            System.out.println("3 - Conta quantidade de nos na ABB");
            System.out.println("4 - Consulta existencia de valor na ABB");
            System.out.println("5 - Conta comparacoes na consulta de valor na ABB");
            System.out.println("6 - Remove nó escolhido por seu valor");
            System.out.println("7 - Apresenta maior valor da ABB");
            System.out.println("8 - Apresenta menor valor da ABB");
            System.out.print("Opcao: ");
            opcao = le.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Fechando a execucao");
                    break;
                case 1:
                    System.out.print("Informe valor a ser inserido: ");
                    int valor = le.nextInt();
                    abb.root = abb.inserir(abb.root, valor);
                    break;
                case 2:
                    System.out.println("Apresentando a ABB");
                    abb.show(abb.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Quantidade de nos na ABB: " + abb.contaNos(abb.root, 0));
                    break;
                case 4:
                    System.out.print("Informe valor a ser pesquisado: ");
                    valor = le.nextInt();
                    if (abb.consulta(abb.root, valor))
                        System.out.println("Valor encontrado na ABB");
                    else
                        System.out.println("Valor NAO encontrado na ABB");
                    break;
                case 5:
                    System.out.print("Informe valor a ser pesquisado: ");
                    valor = le.nextInt();
                    System.out.println("Quantidade de comparacoes: " + abb.contaConsulta(abb.root, 0, valor));
                    break;
                case 6:
                    System.out.print("Informe valor a ser removido: ");
                    valor = le.nextInt();
                    abb.root = abb.removeValor(abb.root, valor);
                    break;
                case 7:
                    if (abb.root != null)
                        System.out.println("Maior valor valor da ABB: " + abb.maximo());
                    else
                        System.out.println("ABB esta vazia");
                    break;
                case 8:
                    if (abb.root != null)
                        System.out.println("Menor valor valor da ABB: " + abb.minimo());
                    else
                        System.out.println("ABB esta vazia");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 0);

        le.close();

    }

}