package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
   private Map<String, Integer> agendaContatoMap;

   public AgendaContatos() {
      this.agendaContatoMap = new HashMap<>();
   }

   public void adicionarContato(String nome, Integer telefone) {
      agendaContatoMap.put(nome, telefone);
   }

   public void removerContato(String nome) {
      if (!agendaContatoMap.isEmpty()) {
         agendaContatoMap.remove(nome);
      }
   }

   public void exibirContatos() {
      System.out.println(agendaContatoMap);
   }

   public Integer pesquisarPorNome(String nome) {
      Integer numeroPorNome = null;
      if (!agendaContatoMap.isEmpty()) {
         numeroPorNome = agendaContatoMap.get(nome);
      }
      return numeroPorNome;
   }

   public static void main(String[] args) {
      AgendaContatos agendaContatos = new AgendaContatos();

      agendaContatos.adicionarContato("João", 123456);
      agendaContatos.adicionarContato("João", 5665);
      agendaContatos.adicionarContato("João Felipe", 1111111);
      agendaContatos.adicionarContato("João DIO", 654987);
      agendaContatos.adicionarContato("Maria Silva", 1111111);
      agendaContatos.adicionarContato("João", 44444);

      agendaContatos.exibirContatos();

      agendaContatos.removerContato("Maria Silva");
      agendaContatos.exibirContatos();

      System.out.println("O número é: " + agendaContatos.pesquisarPorNome("João DIO"));
   }
}
