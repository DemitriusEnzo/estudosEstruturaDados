package FilaEncadeada.aula;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        System.out.println("Informe valor positivo para inserir na fila ou 0 para cancelar");
        int valor = on.nextInt();
        while (valor > 0) {
            fila.enqueue(valor);
            System.out.println("Informe valor positivo para inserir na fila ou 0 para cancelar");
            valor = on.nextInt();
        }
        System.out.println("Esvaziando a fila...");
        while (!fila.isEmpty()) {
            System.out.println("Retirado valor: " + fila.dequeue());
        }
        on.close();
    }
}
