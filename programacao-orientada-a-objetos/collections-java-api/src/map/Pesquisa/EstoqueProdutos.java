package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
   private Map<Long, Produto> estoqueProdutoMap;

   public EstoqueProdutos() {
      this.estoqueProdutoMap = new HashMap<>();
   }

   public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
      estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
   }

   public void exibirProduto() {
      System.out.println(estoqueProdutoMap);
   }

   public double calculaValorTotalEstoque() {
      double valorTotalEstoque = 0;
      if (!estoqueProdutoMap.isEmpty()) {
         for (Produto p : estoqueProdutoMap.values()) {
            valorTotalEstoque += p.getQuantidade() * p.getPreco();
         }
      }
      return valorTotalEstoque;
   }

   public Produto obterProdutoMaisCaro() {
      Produto produtoMaisCaro = null;
      double maiorPreco = Double.MIN_VALUE;
      if (!estoqueProdutoMap.isEmpty()) {
         for (Produto p : estoqueProdutoMap.values()) {
            if (p.getPreco() > maiorPreco) {
               produtoMaisCaro = p;
            }
         }
      }
      return produtoMaisCaro;
   }

   public static void main(String[] args) {
      EstoqueProdutos estoque = new EstoqueProdutos();
      estoque.exibirProduto();

      estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
      estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
      estoque.adicionarProduto(3L, "Produto C", 2, 15.0);
      estoque.adicionarProduto(8L, "Produto D", 2, 20.0);

      estoque.exibirProduto();

      System.out.println("Valor total do estoque: R$ " + estoque.calculaValorTotalEstoque());
      System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
   }
}
