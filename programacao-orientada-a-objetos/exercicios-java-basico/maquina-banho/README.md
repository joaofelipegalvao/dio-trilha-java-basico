# 🐶 Controle de Banho de um Petshop

![Java](https://img.shields.io/badge/Java-17%2B-blue)

Este repositório contém a minha solução para o exercício proposto no curso **DIO - Java e a Arte da Abstração com Classes e Encapsulamento**.

<!-- [📒 Sobre o Exercício](#📒-sobre-o-exercício) | [⚙️ Regras Implementadas](#️-regras-implementadas) | [🏗️ Estrutura do Código](#🏗️-estrutura-do-código) | [📚 Aprendizados](#📚-aprendizados) -->

<p align="center" dir="auto">
  <a href="#%F0%9F%93%92-sobre-o-exerc%C3%ADcio">📒 Sobre o Exercício<a/> |
  <a href="#%E2%9A%99%EF%B8%8F-regras-implementadas">⚙️ Regras Implementadas<a/> |
  <a href="#%F0%9F%8F%97%EF%B8%8F-estrutura-do-c%C3%B3digo">🏗️ Estrutura do Código</a> |
  <a href="#%F0%9F%93%9A-aprendizados">📚 Aprendizados</a>
</p>

![Demostração do Exercício](https://i.ibb.co/HLPZyYvX/screenshot-31032025-030249.png)

## 📒 Sobre o Exercício

O desafio consistiu em criar um sistema que simula o funcionamento de uma máquina de banho de petshop, implementando diversas operações e seguindo regras de negócio especificadas. As funcionalidades incluem:

- 🛁 Dar banho no pet;
- 💧 Abastecer com água;
- 🧴 Abastecer com shampoo;
- 🔍 Verificar o nível de água e shampoo;
- 🐕 Verificar se há um pet na máquina;
- 🔄 Colocar e retirar um pet da máquina;
- 🧼 Limpar a máquina.

### ⚙️ Regras Implementadas

- Apenas um pet pode ser banhado por vez;
- Cada banho consome **10 litros de água** e **2 litros de shampoo**;
- A capacidade máxima da máquina é de **30 litros de água** e **10 litros de shampoo**;
- Se um pet for retirado sem estar limpo, a máquina deve ser limpa antes de aceitar outro pet;
- A limpeza da máquina consome **3 litros de água** e **1 litro de shampoo**;
- O reabastecimento ocorre em incrementos de **2 litros**.

## 🏗️ Estrutura do Código

A solução foi dividida em três classes principais:

### 1. `Pet.java`

Esta classe representa um animal de estimação e contém informações básicas, como nome e estado de limpeza.

### 2. `PetMachine.java`

A classe `PetMachine` gerencia o funcionamento da máquina de banho, incluindo:

- Controle de recursos (níveis de água e shampoo);
- Estado de limpeza da máquina;
- Adição e remoção de pets;
- Regras de negócio do banho.

### 3. `Main.java`

A classe principal que permite a interação com o sistema via terminal. Um menu de opções foi criado para facilitar o uso.

## 📚 Aprendizados

Este exercício reforçou conceitos importantes da Programação Orientada a Objetos (POO) em Java, incluindo:

- Encapsulamento e acesso a atributos privados;
- Abstração de comportamentos em classes separadas;
- Validação de regras de negócio dentro dos métodos;
- Manipulação de objetos e interação entre classes.

##

Fiquei satisfeito com o resultado final, que atende completamente aos requisitos propostos enquanto aplica boas práticas de programação orientada a objetos
