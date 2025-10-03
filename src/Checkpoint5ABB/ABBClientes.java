package Checkpoint5ABB;

import java.util.List;

public class ABBClientes {
    private class NO {
        NO dir;
        NO esq;
        Cliente cliente;
    }

    public NO root = null;

    public ABBClientes() {
        this.root = null;
    }


    public NO inserir(NO p, Cliente cliente) {
        System.out.println("Dentro do método inserir");
        if (p == null) {
            p = new NO();
            p.cliente = cliente;
            p.esq = null;
            p.dir = null;
            System.out.println("Cliente inserido");
        } else if (cliente.getSaldoAplicacoes() < p.cliente.getSaldoAplicacoes()) {
            System.out.println("passei na esquerda");
            p.esq = inserir(p.esq, cliente);
        } else {
            System.out.println("passei na direita");
            p.dir = inserir(p.dir, cliente);
        }
        return p;
    }

    //public NO remover(NO p, )

    public void show(NO p) {
        if (p != null) {
            show(p.esq);
            System.out.println(p.cliente);
            show(p.dir);
        }
    }

    public int contaClientes(NO p, int cont) {
        if (p != null) {
            cont++;
            cont = contaClientes(p.esq, cont);
            cont = contaClientes(p.dir, cont);
        }
        return cont;
    }


   /* public boolean consulta(NO p, int valor) {
        if (p != null) {
            if (p.cliente == valor) {
                return true;
            } else if (p.cliente < valor) {
                return consulta(p.dir, valor);
            } else {
                return consulta(p.esq, valor);
            }
        }
        return false;
    }*/

    public List<Cliente> geraClientesContemplados(NO no, List<Cliente> lista, double saldoMin) {
        if (no != null) {
            if (no.dir != null) {
                geraClientesContemplados(no.dir, lista, saldoMin);
            }

            if (no.cliente.getSaldoAplicacoes() >= saldoMin) {
                lista.add(no.cliente);
                System.out.print(no.cliente + "\t");
            }

            if (no.esq != null) {
                geraClientesContemplados(no.esq, lista, saldoMin);
            }
        }

        return lista;
    }

    public NO removerCliente(NO no, Cliente cl) {
        if (no != null) {
            if (cl.getSaldoAplicacoes() == no.cliente.getSaldoAplicacoes()) {
                if (no.esq == null && no.dir == null) {
                    return null;
                }

                if (no.esq == null) {
                    return no.dir;
                } else {
                    if (no.dir == null) {
                        return no.esq;
                    } else {
                        NO aux, ref;
                        ref = no.dir;
                        aux = no.dir;

                        while (aux.esq != null) {
                            aux = aux.esq;
                            aux.esq = no.esq;
                            return ref;
                        }
                    }
                }
            } else {
                if (cl.getSaldoAplicacoes() < no.cliente.getSaldoAplicacoes()) {
                    no.esq = removerCliente(no.esq, cl);
                } else {
                    no.dir = removerCliente(no.dir, cl);
                }
            }
        }
        return no;
    }

    public Cliente buscaPorCpfCnpj(NO p, String cpfCnpj) {
        if (p != null) {
            if (p.cliente.getDocumento().equals(cpfCnpj)) {
                return p.cliente;
            }
            Cliente esq = buscaPorCpfCnpj(p.esq, cpfCnpj);
            if (esq != null) return esq;
            return buscaPorCpfCnpj(p.dir, cpfCnpj);
        }
        return null;
    }

    public boolean atualizaSaldo(NO p, int numeroConta, double novoSaldo) {
        if (p != null) {
            if (p.cliente.getNumeroDaConta() == numeroConta) {
                p.cliente.setSaldoAplicacoes(novoSaldo);
                return true;
            }
            return atualizaSaldo(p.esq, numeroConta, novoSaldo) || atualizaSaldo(p.dir, numeroConta, novoSaldo);
        }
        return false;
    }


    public int contaClientesAcimaDe(NO p, double valor) {
        if (p != null) {
            int cont = (p.cliente.getSaldoAplicacoes() > valor) ? 1 : 0;
            cont += contaClientesAcimaDe(p.esq, valor);
            cont += contaClientesAcimaDe(p.dir, valor);
            return cont;
        }
        return 0;
    }
}
