package PilhasEncadeadas;

import java.util.Scanner;

public class Pilha_INT {

    public static class NO {
        public int dado;
        public NO prox;
    }

    public static NO topo;

    public void INIT() {
        topo = null;
    }

    public boolean IsEmpty() {
        return topo == null;
    }

    public void PUSH (int elem) {
        NO novo = new NO();
        novo.dado = elem;
        novo.prox = topo;
        topo = novo;
    }

    private static class Retorno {
        public int elem;
        public boolean ok;
    }

    public Retorno TOP() {
        Retorno saida = new Retorno();
        if(!IsEmpty()) {
            saida.elem = topo.dado;
            saida.ok = true;
        } else {
            saida.ok = false;
        }
        return saida;
    }

    public Retorno POP() {
        Retorno saida = new Retorno();
        if (!IsEmpty()) {
            saida.elem = topo.dado;
            topo = topo.prox;
            saida.ok = true;
        } else {
            saida.ok = false;
        }
        return saida;
    }

    public static void main(String[] args) {
        Pilha_INT s = new Pilha_INT();
        Retorno resultado = new Retorno();

        int elemento;
        int opcao;

        s.INIT();

        Scanner on = new Scanner(System.in);

        resultado = s.TOP();
        if(resultado.ok) {
            System.out.println("Execução do TOP: " + resultado.elem);
        } else {
            System.out.println("Execução do TOP: pilha VAZIA");
        }

        do {
            System.out.println("Digite valor inteiro para dado: ");
            elemento = on.nextInt();
            s.PUSH(elemento);
            System.out.println("Digite 0 para encerrar empilhamento de dados.");
            opcao = on.nextInt();
        } while(opcao != 0);

        resultado = s.TOP();
        if(resultado.ok) {
            System.out.println("Execução do TOP: " + resultado.elem);
        }

        do {
            resultado = s.POP();
            if(resultado.ok) {
                System.out.println("Dado retirado: " + resultado.elem);
            }
        } while (resultado.ok);
        on.close();
    }
}
