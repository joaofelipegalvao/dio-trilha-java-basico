# 📺 Smart TV - Simulação de Funcionalidades

Este repositório contém uma simulação básica de uma Smart TV implementada em Java. A classe `SmartTv` define atributos e
métodos para controlar uma TV fictícia, incluindo ligar/desligar, alterar volume e mudar canais. A classe `Usuario` atua
como um controlador para testar as funcionalidades da Smart TV.

Este exercício faz parte do curso da [DIO (Digital Innovation One)](https://www.dio.me/), onde pratiquei conceitos
fundamentais da programação orientada a objetos em Java.

## 📚 Aprendizados

Durante este exercício, pude consolidar os seguintes conceitos:

- 🖥️ Declaração de classes e atributos em Java.
- 🛠️ Implementação de métodos para manipular objetos.
- 🎮 Uso de instâncias de classes para simular funcionalidades.
- 📝 Impressão de dados no console para acompanhar a execução do programa.

## Funcionalidades Implementadas

### Classe `SmartTv`

A classe `SmartTv` define os seguintes atributos e métodos:

#### **Atributos**

- `ligada`: Indica se a TV está ligada ou desligada (inicialmente `false`).
- `canal`: Representa o canal atual da TV (inicialmente `1`).
- `volume`: Representa o volume atual da TV (inicialmente `25`).

#### **Métodos**

- ⚡ `ligar()`: Liga a TV.
- 🔌 `desligar()`: Desliga a TV.
- 📡 `mudarCanal(int novoCanal)`: Altera o canal para um novo valor.
- ⬆️ `aumentarCanal()`: Incrementa o canal em 1 unidade.
- ⬇️ `diminuirCanal()`: Decrementa o canal em 1 unidade.
- 🔊 `aumentarVolume()`: Aumenta o volume em 1 unidade e exibe a nova configuração.
- 🔈 `diminuirVolume()`: Diminui o volume em 1 unidade e exibe a nova configuração.

### Classe `Usuario`

A classe `Usuario` é utilizada para testar os métodos da `SmartTv`, realizando as seguintes operações:

1. Criar uma instância da `SmartTv`.
2. Diminuir e aumentar o volume.
3. Mudar o canal para um valor específico.
4. Verificar o estado inicial da TV (ligada/desligada).
5. Ligar e desligar a TV e exibir o status atualizado.

---
Desenvolvido com Java ☕