package ListaEncadeada;

public class Ex1_ListaEncadeada {
    public static void main(String[] args) {
        NO lista = new NO();
        lista.dado = 1;
        lista.prox = null;

        NO novo = new NO();
        novo.dado = 2;
        novo.prox = null;

        lista.prox = novo;

        NO novo2 = new NO();
        novo2.dado = 3;
        novo2.prox = null;

        novo.prox = novo2;

        System.out.println("lista: " + lista + "\t dado: " + lista.dado + "\t prox: " + lista.prox);
        System.out.println("novo: " + novo + "\t dado: " + novo.dado + "\t prox: " + novo.prox);
        System.out.println("novo2: " + novo2 + "\t dado: " + novo2.dado + "\t prox: " + novo2.prox);

        System.out.println(lista.prox.prox.dado);

        System.out.println("Apresentado nos da lista: ");
        NO aux = lista;
        while(aux != null) {
            System.out.println(aux.dado);
            aux = aux.prox;
        }
    }
}
