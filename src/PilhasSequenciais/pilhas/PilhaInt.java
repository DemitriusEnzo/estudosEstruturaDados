package PilhasSequenciais.pilhas;

public class PilhaInt {

    final int N = 8;
    int[] dados = new int[N];
    int topo;

    public void init() {
        topo = 0;
    }

    public boolean isFull() {
        return (topo == N);
    }

    public void push(int elem) {
        if (isFull())
            System.out.println("Stack overflow");
        else {
            dados[topo++] = elem;
        }
    }

    public boolean isEmpty() {
        return (topo==0);
    }

    public int pop() {
        return (dados[--topo]);
    }

    public int top() {
        return dados[topo-1];
    }

    public void esvazia() {
        while(!isEmpty()) {
            System.out.print("\t"+pop());
        }
    }



}
