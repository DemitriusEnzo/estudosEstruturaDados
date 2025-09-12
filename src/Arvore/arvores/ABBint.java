package Arvore.arvores;

public class ABBint {

    private class NO{
        int dado;
        NO esq, dir;
    }

    public NO root = null;

    public NO inserir(NO p, int info) {
        if (p==null) {
            p =  new NO();
            p.dado = info;
            p.esq = null;
            p.dir = null;
        }
        else if(info < p.dado)
            p.esq= inserir(p.esq, info);
        else
            p.dir = inserir(p.dir, info);
        return p;
    }
    public void show(NO p) {
        if (p!=null) {
            show(p.esq);
            System.out.println(p.dado);
            show(p.dir);
        }
    }
    public int contaNos(NO p, int cont) {
        if (p!=null) {
            cont++;
            cont = contaNos(p.esq, cont);
            cont = contaNos(p.dir, cont);
        }
        return cont;
    }
}
