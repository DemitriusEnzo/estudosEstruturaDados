package Introducao;

import java.util.Scanner;

public class Aluno {
    String nome;
    int rm;
    double nota1, nota2, media;

    public void leitura() {
        Scanner on = new Scanner(System.in);
        System.out.print("Nome: ");
        nome = on.next();
        System.out.print("RM: ");
        rm = on.nextInt();
        System.out.print("Nota1: ");
        nota1 = on.nextDouble();
        System.out.print("Nota2: ");
        nota2 = on.nextDouble();
    }

    public void calculaMedia() {
        media = (nota1 + nota2) / 2;
    }

    public void apresenta() {
        System.out.println("Aluno: "+ nome + "\t RM: "+ rm);
        System.out.println("Nota1: "+ nota1 + "\t Nota2:"+ nota2);
        System.out.println("\t Media: "+ media);
    }

}
