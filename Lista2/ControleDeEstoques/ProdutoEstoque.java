package ControleDeEstoque;

import java.util.*;

public class ProdutoEstoque {

    String nome;
    int quantidade;
    double precoUnitario;

    void adicionarEstoque(int quantidade){
        quantidade += this.quantidade;
    }
    void removerEstoque(int quantidade){
        if(quantidade <= this.quantidade){
        quantidade -= this.quantidade;
        }
        else{
            System.out.println("Quantidade insuficiente para remoção.");
        }
    }
    void atualizarPreco(double novoPreco){
        this.precoUnitario = novoPreco;
    }
    void exibirProduto(){
        System.out.println("\nProduto: "+ nome +
                            "\nQuantidade: "+ quantidade +
                            "\nPreço unitário: "+ precoUnitario);
    }
}
