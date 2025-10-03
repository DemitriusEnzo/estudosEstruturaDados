package Checkpoint5ABB;

public class Cliente {
    private String nome;
    private String documento;
    private long numeroDaConta;
    private String tipoConta;
    private double saldoAplicacoes;

    public Cliente(String nome, String documento, long numeroDaConta, String tipoConta, double saldoAplicacoes) {
        this.nome = nome;
        this.documento = documento;
        this.numeroDaConta = numeroDaConta;
        this.tipoConta = tipoConta;
        this.saldoAplicacoes = saldoAplicacoes;
    }

    public void setSaldoAplicacoes(double saldoAplicacoes) {
        this.saldoAplicacoes = saldoAplicacoes;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldoAplicacoes() {
        return saldoAplicacoes;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", numeroDaConta=" + numeroDaConta +
                ", tipoConta='" + tipoConta + '\'' +
                ", saldoAplicacoes=" + saldoAplicacoes +
                '}';
    }
}
