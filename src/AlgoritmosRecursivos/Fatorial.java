package AlgoritmosRecursivos;

import java.util.Scanner;

public class Fatorial {
    public static int fatorial(int n){
        if (n != 0) {
            return n * fatorial(n-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        System.out.println("Insira o numero");
        int n = on.nextInt();
        System.out.println("Fatorial de " + n + ": " + fatorial(n));
    }
}
