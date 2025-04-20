package FilasSequenciais.exercicios;

import FilasSequenciais.filas.FilaInt;

import java.util.Scanner;



public class AtendimentoAlunos {

    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opcao;
        do {
            System.out.println("1 - Insere o aluno na fila");
            System.out.println("2 - Retira o aluno da fila para o atendimento");
            System.out.println("3 - Encerra atendimento");
            System.out.print("Opcao: ");
            opcao = on.nextInt();

            switch (opcao) {
                case 1 -> {
                        System.out.print("informa RM do aluno:");
                    int rm = on.nextInt();
                    fila.enqueue(rm);
                }
                case 2 -> {
                    if (fila.isEmpty())
                        System.out.println("Nao ha alunos aguardando na fila");
                    else
                        System.out.println("Aluno a ser atendido agora: " + fila.dequeue());
                }
                case 3 -> {
                    if (fila.isEmpty())
                        System.out.println("Atendimento encerrado");
                    else {
                        System.out.println("Ainda ha alunos aguardando na fila");
                        opcao = -1;
                    }
                }
                default -> System.out.println("Opcao invalida");
            }
        } while (opcao != 3);

        on.close();
    }

}
