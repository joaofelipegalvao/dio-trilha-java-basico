# Fundamentos da Programação Orientada a Objetos com Java - Aula: Visibilidade dos Recursos

## 📌 Sobre o Módulo

Neste módulo do curso **Fundamentos da Programação Orientada a Objetos com Java** da DIO, estudei sobre **visibilidade dos recursos** em Java. A visibilidade é essencial para definir quais partes do código podem ser acessadas dentro e fora das classes e pacotes, garantindo encapsulamento e segurança.

## 🔍 O que Aprendi

1. **Modificadores de Acesso**:

   - `public`: Acesso irrestrito a partir de qualquer lugar do código.
   - `private`: Acesso restrito apenas dentro da própria classe.
   - `default` (sem especificação): Acesso permitido apenas dentro do mesmo pacote.

2. **Exemplo Prático - Lanchonete**
   Para praticar, trabalhei com um sistema de uma lanchonete fictícia, onde cada classe representa um papel dentro do estabelecimento. A organização dos pacotes e classes permitiu aplicar corretamente os modificadores de acesso.

## 🏗 Estrutura do Código

### 🔹 Pacote `lanchonete`

- **Classe `Estabelecimento`**: Responsável por simular a interação entre os funcionários e clientes.

### 🔹 Pacote `lanchonete.atendimento`

- **Classe `Atendente`**:
  - Pode **servir mesas** (`public`).
  - Pode **receber pagamentos** (`public`).
  - Pode **trocar o gás** (`default`, visível apenas dentro do pacote `atendimento`).
  - **Não pode pegar pedidos do balcão diretamente** (`private`).

### 🔹 Pacote `lanchonete.atendimento.cozinha`

- **Classe `Cozinheiro`**:
  - Pode **adicionar lanche no balcão** (`public`).
  - **Prepara alimentos internamente** (`private`).
  - **Não pode trocar o gás diretamente**, deve pedir ao `Almoxarife` (`private`).
- **Classe `Almoxarife`**:
  - Controla **entrada e saída de ingredientes** (`private`).
  - **Entrega ingredientes apenas dentro do pacote** (`default`).
  - **Pode trocar o gás apenas dentro do pacote** (`default`).

### 🔹 Pacote `lanchonete.area.cliente`

- **Classe `Cliente`**:
  - Pode **escolher lanche, fazer pedido e pagar conta** (`public`).
  - **Não pode acessar informações sensíveis como saldo do aplicativo** (`private`).

## 🚀 Reflexão

Essa aula foi essencial para compreender como organizar a visibilidade dos recursos dentro de um sistema. Aprendi que **encapsular corretamente as funcionalidades evita acessos indevidos** e melhora a **manutenção e segurança do código**. O exemplo prático da lanchonete ajudou bastante na fixação dos conceitos.

---

📌 **Próximos passos**: Continuar estudando encapsulamento e boas práticas na POO com Java!
