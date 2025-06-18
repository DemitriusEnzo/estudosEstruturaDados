package AlgoritmosRecursivos;

import java.util.Scanner;

public class Somatorio {
    public static int soma(int n) {
        if (n != 0) {
            return n + soma(n - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner on  = new Scanner(System.in);
        System.out.println("Insira o numero");
        int n = on.nextInt();
        System.out.println("O somatorio de " + n + " é de: " + soma(n));
    }
}
