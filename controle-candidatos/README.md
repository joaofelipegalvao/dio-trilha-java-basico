# Criando Um Pequeno Sistema Para Validação de Processo Seletivo

Nesta aula, desenvolvi um pequeno sistema em Java para simular um processo seletivo. O objetivo foi praticar conceitos
como controle de fluxo, loops, métodos e manipulação de arrays. Abaixo, descrevo os principais pontos abordados e como
os códigos foram utilizados.

## Códigos Desenvolvidos

### Case 01: Análise de Salário Pretendido

No primeiro caso, criei um método chamado `analisarCandidato` que recebe o salário pretendido de um candidato e o
compara com o salário base oferecido pela empresa. Dependendo do valor, o sistema decide se deve ligar para o candidato,
fazer uma contraproposta ou aguardar o resultado dos demais candidatos.

```java
static void analisarCandidato(double salarioPretendido) {
   double salarioBase = 2000.0;

   if (salarioBase > salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO");
   } else if (salarioBase == salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
   } else {
      System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
   }
}
```

### Case 02: Seleção de Candidatos

No segundo caso, implementei o método `selecaoCandidatos`, que seleciona até 5 candidatos com base no salário
pretendido. O salário pretendido é gerado aleatoriamente para cada candidato, e o sistema verifica se ele é compatível
com o salário base.

```java
static void selecaoCandidatos() {
   String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
   int candidatosSelecionados = 0;
   int candidatosAtual = 0;
   double salarioBase = 2000.0;

   while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
      String candidato = candidatos[candidatosAtual];
      double valorPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " solicitou este valor de salário " + valorPretendido);

      if (salarioBase >= valorPretendido) {
         System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
         candidatosSelecionados++;
      }
      candidatosAtual++;
   }
}
```

### Case 03: Impressão de Candidatos Selecionados

No terceiro caso, criei o método `imprimirSelecionados`, que imprime a lista de candidatos selecionados. Utilizei tanto
um loop `for` tradicional quanto um `for-each` para percorrer o array de candidatos.

```java
static void imprimirSelecionados() {
   String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

   System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

   for (int indice = 0; indice < candidatos.length; indice++) {
      System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]);
   }

   System.out.println("===== Exemplo utilizando for each =====");
   for (String candidato : candidatos) {
      System.out.println("O candidato selecionando foi: " + candidato);
   }
}
```

### Case 04: Simulação de Contato com Candidatos

No quarto caso, desenvolvi o método `entrandoEmContato`, que simula tentativas de contato com os candidatos
selecionados. O sistema tenta entrar em contato até três vezes ou até conseguir falar com o candidato.

```java
static void entrandoEmContato(String candidato) {
   int tentativasRealizadas = 1;
   boolean continuarTentando = true;
   boolean atendeu = false;

   do {
      atendeu = atender();
      continuarTentando = !atendeu;
      if (continuarTentando) {
         tentativasRealizadas++;
      } else {
         System.out.println("CONTATO REALIZADO COM SUCESSO!");
      }
   } while (continuarTentando && tentativasRealizadas < 3);

   if (atendeu) {
      System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
   } else {
      System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
   }
}

static boolean atender() {
   return new Random().nextInt(3) == 1;
}
```

## Conclusão

Esta aula foi muito enriquecedora, pois pude aplicar diversos conceitos de programação em Java para criar um sistema
funcional de validação de processo seletivo. Aprendi a trabalhar com arrays, loops, métodos e controle de fluxo, além de
praticar a lógica de programação para resolver problemas reais.

Estou ansioso para aplicar esses conhecimentos em projetos futuros e continuar aprimorando minhas habilidades como
desenvolvedor Java.