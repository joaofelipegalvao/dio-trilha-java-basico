# 🧠 Estudando Herança e Polimorfismo em Java

E este é meu repositório de estudos sobre **Herança e Polimorfismo em Java**, dois pilares fundamentais da **Programação Orientada a Objetos (POO)**. Este conteúdo faz parte do meu aprendizado pela plataforma **DIO**.

## 📚 O que aprendi

Nesta aula, aprendi a:

- 🏛️ Criar uma **classe base abstrata** (`Funcionario`) que serve como modelo para outras classes
- 🧬 Usar **herança** para criar classes especializadas (`Vendedor` e `Gerente`)
- 🔁 Aplicar **polimorfismo** para que métodos se comportem de forma diferente em cada subclasse
- 🔒 Utilizar modificadores como `abstract`, `sealed` e `non-sealed` para controlar a herança e manter o código seguro

## 💡 Conceitos-chave

### 🧬 Herança

- Permite que uma classe filha herde atributos e métodos da classe pai.
- Exemplo: `Vendedor` e `Gerente` herdam de `Funcionario`.
- Sintaxe: usamos `extends` para estabelecer essa relação.

### 🔁 Polimorfismo

#### 🔸 Sobrescrita (Override)

Permite que uma subclasse forneça sua própria implementação de um método da superclasse:

```java
@Override
public double getSalarioIntegral() {
    return this.salario + this.comissao; // Para Gerente
    // ou
    return this.salario + (valorVendido * porcentagemPorVenda / 100); // Para Vendedor
}
```

#### 🔸 Sobrecarga (Overload)

Mesma função com parâmetros diferentes, fornecendo múltiplas formas de uso:

```java
public double getSalarioIntegral() { ... }
public double getSalarioIntegral(double extra) { ... }
```

### 🧱 Classes Abstratas

- Não podem ser instanciadas diretamente.
- Servem como base para outras classes.
- Podem conter métodos abstratos (sem corpo) e concretos (com implementação).
- Usamos `abstract class` para declarar.

## 🔍 Exemplo Prático de Polimorfismo

No método `printFuncionario`, temos um ótimo exemplo de polimorfismo em ação:

```java
public static void printFuncionario(Funcionario funcionario) {
    System.out.println(funcionario.getSalarioIntegral());
}
```

Mesmo recebendo um `Funcionario`, esse método consegue lidar com `Gerente` ou `Vendedor` — cada um com sua própria versão do método `getSalarioIntegral()`.

✨ Isso torna o código mais flexível, reutilizável e organizado!

## 📝 Minhas Observações

Esse exercício me ajudou a:

- Reforçar o conceito de herança e evitar duplicação de código
- Entender o poder do polimorfismo para tratar objetos de forma genérica
- Compreender como `sealed` pode ser usado para limitar a hierarquia de herança
- Usar `@Override` para deixar explícita a especialização de comportamento nas subclasses

Estou vendo como a POO ajuda a construir sistemas mais **robustos**, **seguros** e **escaláveis**. 🚀
