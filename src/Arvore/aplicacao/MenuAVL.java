package Arvore.aplicacao;

import Arvore.arvores.AVLint;

import java.util.Scanner;

public class MenuAVL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        AVLint avl = new AVLint();

        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir");
            System.out.println("2 - Mostrar FB");
            opcao = sc.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Encerrando o programa");
                    break;
                case 1:
                    System.out.println("Informe o valor a ser inserido:");
                    int valor = sc.nextInt();
                    avl.root = avl.inserirH(avl.root, valor);
                    break;
                case 2:
                    System.out.println("Apresentação AVL");
                    avl.showFB(avl.root);
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
        } while (opcao != 0);
    }
}
