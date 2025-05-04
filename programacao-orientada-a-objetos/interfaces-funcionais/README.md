# 🧠 Estudando Interfaces Funcionais em Java

Este é meu repositório de estudos sobre Interfaces Funcionais em Java, conteúdo fundamental do módulo **Dominando Interfaces e Lambda** no curso de Orientação a Objetos da plataforma DIO.

## 📚 O que aprendi

Nesta aula, aprendi a:

- 🔌 Utilizar **interfaces funcionais** como `Function<T, R>` para representar comportamentos de forma funcional
- 🧠 Aplicar **method references** (`Record::toString`) para tornar o código mais limpo e expressivo
- ♻️ Passar funções como argumento para métodos, explorando programação funcional em Java
- 🧩 Compreender como interfaces funcionais são a base para o uso de **lambdas**

## 💡 Conceitos-chave

### 🔧 Interfaces Funcionais
Interfaces com apenas um método abstrato, usadas com expressões lambda ou referências de método.

Exemplo: `Function<User, String>`, onde `User` é o tipo de entrada e `String` é o tipo de retorno.

### 🧬 Function<T, R>
Permite transformar um tipo em outro. No exemplo abaixo, transformamos `User` em `String`.

```java
private static void printStringValue(Function<User, String> callback, List<User> users) {
    users.forEach(u -> System.out.println(callback.apply(u)));
}
````

### 🔁 Method Reference

Forma mais concisa de passar métodos como argumentos:

```java
printStringValue(Record::toString, users);
```

## 🔍 Exemplo Prático

```java
public record User(String name, int age) {
}

import java.util.List;
import java.util.function.Function;

public class Main {
   public static void main(String[] args) {
      List<User> users = List.of(
         new User("Maria", 21),
         new User("João", 22),
         new User("Eduardo", 40),
         new User("Ana", 19)
      );

      printStringValue(Record::toString, users);
   }

   private static void printStringValue(Function<User, String> callback, List<User> users) {
      users.forEach(u -> System.out.println(callback.apply(u)));
   }
}
```

Neste código, `printStringValue` recebe uma função como parâmetro e aplica essa função a cada item da lista. Utilizei a referência `Record::toString` para imprimir a representação de cada `User`.

## 📝 Minhas Observações

Esse exercício me ajudou a:

* Consolidar a ideia de **funções como cidadãos de primeira classe** em Java
* Ver como interfaces funcionais tornam o código mais reutilizável e elegante
* Entender a importância de separar lógica e comportamento através de abstrações
* Perceber como lambdas e method references tornam o código mais expressivo

Estou vendo como o paradigma funcional complementa a POO e traz muita flexibilidade ao Java moderno!