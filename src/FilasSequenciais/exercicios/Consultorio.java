package FilasSequenciais.exercicios;

import FilasSequenciais.filas.FilaString;

import java.util.Scanner;

public class Consultorio {

    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        FilaString fila = new FilaString();
        fila.init();
        int opcao;
        do {
            System.out.println("1 - Insere o paciente na fila");
            System.out.println("2 - Retira o paciente da fila para o atendimento");
            System.out.println("3 - Encerra atendimento");
            System.out.print("Opcao: ");
            opcao = on.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.print("Informe o nome do paciente:");
                    String nome = on.next();
                    fila.enqueue(nome);
                }
                case 2 -> {
                    if (fila.isEmpty())
                        System.out.println("Nao ha pacientes aguardando na fila");
                    else
                        System.out.println("Paciente a ser atendido agora: " + fila.dequeue());
                }
                case 3 -> {
                    if (fila.isEmpty())
                        System.out.println("Atendimento encerrado");
                    else {
                        System.out.println("Ainda ha pacientes aguardando na fila");
                        opcao = -1;
                    }
                }
                default -> System.out.println("Opcao invalida");
            }
        } while (opcao != 3);

        on.close();
    }

}
