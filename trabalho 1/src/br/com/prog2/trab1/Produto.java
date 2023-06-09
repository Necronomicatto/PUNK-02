package br.com.prog2.trab1;

public class Produto {
    int codigo;
    String descricao;
    Double valorCompra;
    Double valorVenda;
    public Produto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorVenda = 20.00;
        this.valorCompra = 15.00;
    }
    public Produto(int codigo, String descricao, Double valorCompra, Double valorVenda){
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;

    }

    public static double grossProfit(Double sellValor, Double buyValor) {
        return sellValor - buyValor;
    }
}

