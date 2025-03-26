# 🚀 Pilares da Programação Orientada a Objetos em Java

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![POO](https://img.shields.io/badge/Programa%C3%A7%C3%A3o%20Orientada%20a%20Objetos-4%20Pilares-green)
![DIO](https://img.shields.io/badge/Curso-DIO-yellow)

Este repositório contém meus aprendizados, códigos e reflexões sobre os conceitos fundamentais da Programação Orientada a Objetos (POO) em Java, com base no curso da DIO.

## 📚 Conteúdo do Curso

| Módulo            | Descrição                             | Conceitos-Chave            |
| ----------------- | ------------------------------------- | -------------------------- |
| 1️⃣ Pilares POO    | Introdução aos conceitos fundamentais | 4 Pilares da POO           |
| 2️⃣ Encapsulamento | Proteção dos dados internos           | `private`, getters/setters |
| 3️⃣ Herança        | Reutilização de código                | `extends`, `super`         |
| 4️⃣ Abstração      | Modelagem de classes genéricas        | `abstract`                 |
| 5️⃣ Polimorfismo   | Múltiplas formas de execução          | Sobrescrita, Sobrecarga    |
| 6️⃣ Interface      | Contratos de implementação            | `interface`, `implements`  |

## O que é POO?

A Programação Orientada a Objetos (POO) é um paradigma que organiza o código em torno de "objetos", promovendo reuso, modularidade e manutenção eficiente.

### 🏛️ Os 4 Pilares da POO

1. **Encapsulamento** → Protege os dados internos da classe e expõe apenas o necessário.
2. **Herança** → Permite que uma classe reutilize atributos e métodos de outra.
3. **Abstração** → Modela elementos do mundo real de forma genérica.
4. **Polimorfismo** → Permite que múltiplas classes compartilhem a mesma interface, variando o comportamento.

## 💻 Exemplos Práticos

### 🚗 Exemplo de Polimorfismo

```java
public class Autodromo {
  public static void main(String[] args) {
    Veiculo coringa = new Carro();
    coringa = new Moto();  // Polimorfismo em ação
    coringa.ligar();
  }
}
```

### 📱 Sistema de Mensagens

```java
public abstract class ServicoMensagemInstantanea {
  public abstract void enviarMensagem();
  public abstract void receberMensagem();

  protected void validarConectadoInternet() {
    System.out.println("Validando conexão...");
  }
}

public class Telegram extends ServicoMensagemInstantanea {
  @Override
  public void enviarMensagem() {
    System.out.println("Enviando pelo Telegram");
  }
  // ... outros métodos
}
```

### 🖨️ Sistema de Equipamentos (Interfaces)

```java
public interface Impressora {
  void imprimir();
}

public class EquipamentoMultifuncional implements Impressora, Copiadora {
  @Override
  public void imprimir() { /* implementação */ }

  @Override
  public void copiar() { /* implementação */ }
}
```

## 📂 Códigos das Aulas

Os exemplos práticos podem ser encontrados no seguinte repositório:

🔗 **Código-fonte**: [Acesse aqui](https://github.com/joaofelipegalvao/dio-trilha-java-basico/tree/main/programacao-orientada-a-objetos/pilares-poo/PilaresPooExemplo)

## 🎯 Aprendizados

1. Domínio dos 4 pilares da POO
2. Implementação de hierarquias de classes
3. Uso de classes abstratas vs interfaces
4. Aplicação de polimorfismo em cenários reais
5. Boas práticas de encapsulamento

## 🔍 Reflexões

A POO permite criar código mais organizado, reutilizável e fácil de manter. Compreender esses conceitos é essencial para quem deseja se tornar um programador Java eficiente.
