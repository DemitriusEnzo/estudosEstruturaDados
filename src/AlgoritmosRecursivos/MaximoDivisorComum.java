package AlgoritmosRecursivos;

import java.util.Scanner;

public class MaximoDivisorComum {
    public static int mdc(int n, int m) {
        if (n > m) {
            return mdc(m, n);
        } else {
            if (n == 0) {
                return m;
            } else {
                return mdc(n, m % n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        System.out.println("Insira o maior numero");
        int m = on.nextInt();
        System.out.println("Insira o menor numero");
        int n = on.nextInt();
        int x = mdc(m, n);
        System.out.println("MDC entre " + m + " e " + n + " é: " + x);
    }
}
