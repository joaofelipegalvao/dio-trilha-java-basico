# ⏰ Sistema de Relógios com Herança e Polimorfismo

![Java](https://img.shields.io/badge/Java-17%2B-blue)

Este repositório contém a minha solução para o exercício proposto no curso **DIO - Pilares da Programação Orientada a Objetos em Java**, na aula _"Explorando Herança e Polimorfismo"_.

<p align="center" dir="auto">
  <a href="#user-content--sobre-o-exercício">📒 Sobre o Exercício</a> |
  <a href="#user-content-️-regras-implementadas">⚙️ Regras Implementadas</a> |
  <a href="#user-content-️-estrutura-do-código">🏗️ Estrutura do Código</a> |
  <a href="#user-content--aprendizados">📚 Aprendizados</a>
</p>

![screenshot](https://i.postimg.cc/PrwS2Tfb/68747470733a2f2f692e706f7374696d672e63632f434c594c715a374c2f73637265656e73686f742d30323034323032352d.png)

<p align="center" dir="auto"><em>Conversão entre formatos 24h e 12h com AM/PM em ação!</em> 🚀<p>

## 📒 Sobre o Exercício

O desafio foi desenvolver uma hierarquia de classes que representa **relógios de diferentes regiões do mundo**, utilizando **herança, encapsulamento e polimorfismo**.

A proposta incluía:

- Criar uma **superclasse abstrata** com os atributos básicos de um relógio;
- Criar subclasses para representar **Relógio Brasileiro (24h)** e **Relógio Americano (12h com AM/PM)**;
- Implementar a **conversão de hora** entre os diferentes formatos.

## ⚙️ Regras Implementadas

- A hora deve ser válida (máximo 23 para BR e 12 para US);
- O formato brasileiro aceita horas entre 0 e 23;
- O formato americano transforma horas maiores que 12 em PM;
- A conversão entre relógios atualiza todos os valores (`hora`, `minuto`, `segundo`);
- O método `getTempo()` formata corretamente o tempo como `HH:MM:SS`;
- O relógio americano exibe `AM` ou `PM` ao final da hora.

## 🏗️ Estrutura do Código

O sistema foi dividido nas seguintes classes:

### 1. `Relogio.java`

Classe abstrata que define os atributos comuns (`hora`, `minuto`, `segundo`) e métodos:

- `getTempo()`: retorna o tempo formatado;
- `convert(Relogio)`: método abstrato implementado nas subclasses.

### 2. `RelogioBR.java`

Implementa o relógio no formato 24 horas (padrão brasileiro). Sua conversão:

- Transforma horário americano em 24h (somando 12 se for PM);
- Copia os dados se já for um `RelogioBR`.

### 3. `RelogioUS.java`

Representa o relógio no formato 12 horas com indicadores de período (`AM` ou `PM`). A lógica de `setHora()` adapta o valor para o modelo americano, e o `getTempo()` inclui o sufixo.

### 4. `Main.java`

Classe principal que demonstra o uso do sistema. Cria um `RelogioBR`, define a hora como 13h, e converte para `RelogioUS`. Saída esperada:

```bash
13:00:00
01:00:00 PM
```

## 📚 Aprendizados

Com esse exercício, eu pratiquei e aprofundei os seguintes conceitos:

- ✔️ Herança e especialização de classes;
- ✔️ Polimorfismo com sobrescrita de métodos;
- ✔️ Uso de `switch` com pattern matching;
- ✔️ Encapsulamento com validações em setters;
- ✔️ Manipulação de tempo e lógica de conversão entre formatos.

---

Fiquei satisfeito com o resultado, que atende ao proposto e me ajudou a entender como aplicar herança de forma prática em Java. Também vi como organizar bem o código para reaproveitamento e expansão futura. 🚀
