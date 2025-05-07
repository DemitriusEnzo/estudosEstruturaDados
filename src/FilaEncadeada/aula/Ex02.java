package FilaEncadeada.aula;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opcao;
        do {
            System.out.println("1 - Insere o processo na fila");
            System.out.println("2 - Retira o processo da fila para o execucao");
            System.out.println("3 - Shutdown");
            System.out.print("Opcao: ");
            opcao = le.nextInt();
            int pid;
            switch (opcao) {
                case 1 -> {
                    System.out.print("pid:");
                    pid = le.nextInt();
                    fila.enqueue(pid);
                }
                case 2 -> {
                    if (fila.isEmpty())
                        System.out.println("Nao ha processos na fila");
                    else {
                        pid = fila.dequeue();
                        System.out.println("Processo em execucao: " + pid);
                        System.out.print("... O processo foi concluido? (1-sim): ");
                        int resp = le.nextInt();
                        if (resp == 1)
                            System.out.println("Processo " + pid + " foi concluido com sucesso");
                        else {
                            fila.enqueue(pid);
                            System.out.println("Processo " + pid + " voltou para fila");
                        }
                    }
                }
                case 3 -> {
                    if (fila.isEmpty())
                        System.out.println("Sistema sera encerrado");
                    else {
                        System.out.println("Ainda ha processos na fila");
                        System.out.print("Deseja encerrar todos? (1-sim): ");
                        int resp = le.nextInt();
                        if (resp == 1) {
                            while (!fila.isEmpty()) {
                                System.out.println("Encerrado processo: " + fila.dequeue());
                            }
                        } else
                            opcao = -1;
                    }
                }
                default -> System.out.println("Opcao invalida");
            }
        } while (opcao != 3);
        System.out.println("Shutdown");

        le.close();
    }
}
