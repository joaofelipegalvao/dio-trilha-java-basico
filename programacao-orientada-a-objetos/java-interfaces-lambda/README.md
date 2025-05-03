# 🧠 Estudando Interfaces e Lambda em Java

Este é meu repositório de estudos sobre **Interfaces e Expressões Lambda em Java**, temas fundamentais para aplicar **abstração, polimorfismo** e **programação funcional**. Este conteúdo faz parte do meu aprendizado pela plataforma **DIO** no curso de Programação Orientada a Objetos.

## 📚 O que aprendi

Nesta aula, aprendi a:

- 🎛️ Criar interfaces para definir contratos de comportamento
- 🧩 Implementar múltiplas interfaces em uma mesma classe
- 🔁 Utilizar polimorfismo com base em interfaces
- 🧠 Compreender como as interfaces ajudam na flexibilidade e organização do código
- 💡 Preparar a base para usar expressões lambda (tema das próximas aulas)

## 💡 Conceitos-chave

### 🔌 Interfaces

- Definem um conjunto de métodos que devem ser implementados por qualquer classe que as utilize.
- Não possuem corpo nos métodos (até Java 7), servem apenas como contratos.
- Uma classe pode implementar várias interfaces, o que permite simular herança múltipla.

```java
public interface MusicPlayer {
    void playMusic();
    void pauseMusic();
    void stopMusic();
}
```

### 🛠️ Implementações

- Criei classes como `Computer`, `Smartphone` e `Musicbox` que implementam `MusicPlayer` e/ou `VideoPlayer`.
- Isso mostra como diferentes objetos podem compartilhar comportamentos comuns de forma desacoplada.

```java
public class Computer implements MusicPlayer, VideoPlayer {
    @Override
    public void playMusic() {
        System.out.println("O computador está tocando a música");
    }
    // ... outros métodos
}
```

### 🔁 Polimorfismo com Interfaces

- Permite usar objetos diferentes de forma genérica através dos tipos de interface.

```java
public static void runMusic(MusicPlayer player) {
    player.playMusic();
}
```

- Mesmo sem saber se o objeto é `Computer`, `Smartphone` ou `Musicbox`, o método funciona para todos, pois todos implementam `MusicPlayer`.

### 💻 Separação de Responsabilidades

- A lógica de vídeo e música foi separada em interfaces diferentes (`VideoPlayer` e `MusicPlayer`), promovendo coesão e clareza no código.
- Facilita a manutenção e a adição de novos dispositivos.

## 🔍 Exemplo Prático

```java
public static void main(String[] args) {
    runMusic(new Computer());
    runVideo(new Computer());
}
```

Esse exemplo mostra como podemos passar um objeto que implementa múltiplas interfaces e tratá-lo conforme o contexto — seja como tocador de vídeo ou de música.

## 📝 Minhas Observações

Esse exercício me ajudou a:

- Entender como interfaces aumentam a flexibilidade e a reutilização de código
- Perceber a importância da separação de responsabilidades em sistemas maiores
- Praticar polimorfismo de forma clara e direta com métodos genéricos
- Me preparar para usar expressões lambda, que frequentemente usam interfaces funcionais como base

Estou percebendo como essas práticas contribuem para um código mais limpo, organizado e fácil de evoluir. 🚀
