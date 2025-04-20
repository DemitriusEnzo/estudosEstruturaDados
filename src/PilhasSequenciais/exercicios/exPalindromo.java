package PilhasSequenciais.exercicios;

import PilhasSequenciais.pilhas.PilhaInt;

import java.util.Scanner;

public class exPalindromo {

    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt();
        pilha.init();
        int digito = 0;
        int[] leitura = new int[8];
        int n=0;

        while (digito >=0 && n < leitura.length) {
            System.out.print("Informe digito (0..9): ");
            digito = on.nextInt();

            if (digito >= 0 && digito <= 9) {
                leitura[n++] = digito;
                pilha.push(digito);
            }
        }

        boolean palindromo = true;

        for(int i = 0; i < n && palindromo; i++) {
            if (leitura[i] != pilha.pop())
                palindromo = false;
        }

        if (palindromo)
            System.out.println("E' palindromo");
        else
            System.out.println("NAO e' palindromo");

        on.close();

    }

}
