package br.com.prog2.trab1;

public class CadastraProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto(16,"Tower");
        Produto produto2 = new Produto(13, "Death", 6.11, 1.06);

        Double lucroBruto1 = Produto.grossProfit(produto1.valorVenda, produto1.valorCompra);
        Double lucroBruto2 = Produto.grossProfit(produto2.valorVenda, produto2.valorCompra);

        System.out.println("Codigo 1:"+produto1.codigo+"\nDescricao 1:"+produto1.descricao+"\nValor de venda 1:"+produto1.valorVenda+"\nValor de compra 1:"+produto1.valorCompra);
        System.out.println("Codigo 2:"+produto2.codigo+"\nDescricao 2:"+produto2.descricao+"\nValor de venda 2:"+produto2.valorVenda+"\nValor de compra 2:"+produto2.valorCompra);
        System.out.println("Lucro bruto 1:"+lucroBruto1);
        System.out.println("Lucro bruto 2:"+lucroBruto2);
    }
}
