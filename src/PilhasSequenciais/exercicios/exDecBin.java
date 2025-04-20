package PilhasSequenciais.exercicios;

import PilhasSequenciais.pilhas.PilhaInt;

import java.util.Scanner;

public class exDecBin {

    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        int decimal, resto;
        System.out.print("Informe valor inteiro positivo em decimal: ");
        decimal = on.nextInt();
        PilhaInt pilha = new PilhaInt();
        pilha.init();

        while (decimal != 0) {
            resto = decimal % 2;
            pilha.push(resto);
            decimal = decimal / 2;
        }

        System.out.print("Valor em binario: ");
        pilha.esvazia();
        on.close();
    }

}
