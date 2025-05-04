package FilaEncadeada;

import java.util.Scanner;

public class Fila_INT {
    private static class NO {
        public int dado;
        public NO prox;
    }

    private static NO ini;
    private static NO fim;

    public void INIT() {
        ini = null;
        fim = null;
    }

    public boolean IsEmpty() {
        return (ini == null && fim == null);
    }

    public void ENQUEUE(int item) {
        NO novo = new NO();
        novo.dado = item;
        novo.prox = null;
        if (IsEmpty()) {
            ini = novo;
            fim = novo;
        } else {
            fim.prox = novo;
            fim = novo;
        }
    }

    private static class Retorno {
        public int item;
        public boolean ok;
    }

    public Retorno DEQUEUE() {
        Retorno saida = new Retorno();
        if (!IsEmpty()) {
            saida.item = ini.dado;
            ini = ini.prox;
            if (ini == null) {
                fim = null;
            }
            saida.ok = true;
        } else {
            saida.ok = false;
        }
        return saida;
    }

    public Retorno FIRST() {
        Retorno saida = new Retorno();
        if (!IsEmpty()) {
            saida.item = ini.dado;
            saida.ok = true;
        } else {
            saida.ok = false;
        }
        return saida;
    }

    public static void main(String[] args) {
        Fila_INT fila = new Fila_INT();
        Retorno resultado;
        int item, opcao;
        Scanner on  = new Scanner(System.in);

        fila.INIT();

        do {
            System.out.println("Digite valor inteiro para dado ");
            item = on.nextInt();
            fila.ENQUEUE(item);
            System.out.println("Digite 0 para encerrar insrrção de dados");
            opcao = on.nextInt();
        } while (opcao != 0);

        resultado = fila.FIRST();
        if(resultado.ok) {
            System.out.println("Execução do FIRST: " + resultado.item);
        }

        do {
            resultado = fila.DEQUEUE();
            if(resultado.ok) {
                System.out.println("Dado retirado: " + resultado.item);
            }
        } while(resultado.ok);
        on.close();
    }
}
