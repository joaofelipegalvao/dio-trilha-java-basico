package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
   public static void main(String[] args) {
      // Desenvolvido no Case 04: Simulação de contato com candidatos selecionados
      String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
      for (String candidato : candidatos) {
         entrandoEmContato(candidato); // Tenta entrar em contato com cada candidato
      }
   }

   // Desenvolvido no Case 04: Método para simular tentativas de contato com um candidato
   static void entrandoEmContato(String candidato) {
      int tentativasRealizadas = 1; // Contador de tentativas de contato
      boolean continuarTentando = true; // Flag para continuar tentando
      boolean atendeu = false; // Flag para verificar se o candidato atendeu

      do {
         atendeu = atender(); // Simula se o candidato atendeu a chamada
         continuarTentando = !atendeu; // Se não atendeu, continua tentando
         if (continuarTentando) {
            tentativasRealizadas++; // Incrementa o número de tentativas
         } else {
            System.out.println("CONTATO REALIZADO COM SUCESSO!"); // Mensagem de sucesso
         }
      } while (continuarTentando && tentativasRealizadas < 3); // Tenta até 3 vezes ou até conseguir contato

      // Exibe o resultado final das tentativas de contato
      if (atendeu) {
         System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
      } else {
         System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
      }
   }

   // Desenvolvido no Case 04: Método para simular se o candidato atendeu a chamada
   static boolean atender() {
      return new Random().nextInt(3) == 1; // Retorna true com probabilidade de 1/3
   }

   // Desenvolvido no Case 03: Método para imprimir a lista de candidatos selecionados
   static void imprimirSelecionados() {
      String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

      System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

      // Imprime os candidatos com seus respectivos índices
      for (int indice = 0; indice < candidatos.length; indice++) {
         System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]);
      }

      System.out.println("===== Exemplo utilizando for each =====");
      // Imprime os candidatos utilizando for-each
      for (String candidato : candidatos) {
         System.out.println("O candidato selecionando foi: " + candidato);
      }
   }

   // Desenvolvido no Case 02: Método para selecionar candidatos com base no salário pretendido
   static void selecaoCandidatos() {
      String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
      int candidatosSelecionados = 0; // Contador de candidatos selecionados
      int candidatosAtual = 0; // Índice do candidato atual
      double salarioBase = 2000.0; // Salário base oferecido pela empresa

      // Loop para selecionar até 5 candidatos ou até percorrer todos os candidatos
      while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
         String candidato = candidatos[candidatosAtual];
         double valorPretendido = valorPretendido(); // Gera um valor de salário pretendido aleatório

         System.out.println("O candidato " + candidato + " solicitou este valor de salário " + valorPretendido);

         // Verifica se o salário pretendido é compatível com o salário base
         if (salarioBase >= valorPretendido) {
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++; // Incrementa o contador de selecionados
         }
         candidatosAtual++; // Passa para o próximo candidato
      }
   }

   // Método para gerar um valor de salário pretendido aleatório entre 1800 e 2200
   static double valorPretendido() {
      return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }

   // Desenvolvido no Case 01: Método para analisar o salário pretendido de um candidato
   static void analisarCandidato(double salarioPretendido) {
      double salarioBase = 2000.0; // Salário base oferecido pela empresa

      // Compara o salário pretendido com o salário base e toma uma decisão
      if (salarioBase > salarioPretendido) {
         System.out.println("LIGAR PARA O CANDIDATO"); // Candidato com salário abaixo do base
      } else if (salarioBase == salarioPretendido) {
         System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA"); // Candidato com salário igual ao base
      } else {
         System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS"); // Candidato com salário acima do base
      }
   }
}