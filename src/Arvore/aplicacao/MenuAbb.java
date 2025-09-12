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
            System.out.println("1 - Inserir 1 valor na ABB");
            System.out.println("2 - Apresenta ABB (em ordem");
            System.out.println("3 - Conta nos da ABB");
            System.out.print("Opcao: ");
            opcao = le.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Fechando a execucao");
                    break;
                case 1:
                    System.out.print("Valor a ser inserido: ");
                    int valor = le.nextInt();
                    abb.root = abb.inserir(abb.root, valor);
                    break;
                case 2:
                    System.out.println("\t Apresentacao da ABB");
                    abb.show(abb.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("qtd de nos: "+abb.contaNos(abb.root, 0));
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while (opcao!=0);
        le.close();
    }
}
