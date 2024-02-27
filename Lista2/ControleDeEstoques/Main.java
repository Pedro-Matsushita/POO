package ControleDeEstoque;

public class Main {
    public static void main(String[] args) {
        ProdutoEstoque prod1 = new ProdutoEstoque();
        prod1.nome = "Miojo";
        prod1.quantidade = 13;
        prod1.precoUnitario = 1.40;

        ProdutoEstoque prod2 = new ProdutoEstoque();
        prod2.nome = "Biscoito";
        prod2.quantidade = 15;
        prod2.precoUnitario = 2;

        prod1.exibirProduto();
        prod1.adicionarEstoque(10);
        prod1.removerEstoque(2);
        prod1.atualizarPreco(1.60);
        prod1.exibirProduto();

        System.out.println();

        prod2.exibirProduto();
        prod2.adicionarEstoque(10);
        prod2.removerEstoque(2);
        prod2.atualizarPreco(2.20);
        prod2.exibirProduto();
    }
}
