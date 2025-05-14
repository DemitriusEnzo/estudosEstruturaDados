package ListaEncadeadaGenerica.testes;

import ListaEncadeadaGenerica.listas.ListaIntCrescente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        ListaIntCrescente lista = new ListaIntCrescente();

        System.out.println("Informe valor positivo para inserir, negativo para encerrar.");
        int valor = on.nextInt();

        while (valor >= 0) {
            lista.insere(valor);
            lista.mostra();
            System.out.println("Informe valor positivo para inserir, negativo para encerrar.");
            valor = on.nextInt();
        }
        System.out.println("LISTA FINAL:");
        lista.mostra();
        on.close();
    }
}
