# Construtores em Java - Aprendizados e Prática

Este é um resumo do que aprendi no módulo **Construtores** do curso **Fundamentos da Programação Orientada a Objetos com Java** da DIO. Aqui, compartilho meus códigos, explicações e reflexões sobre como os construtores funcionam em Java.

## O que são Construtores?

Construtores são métodos especiais em Java que são chamados automaticamente quando um objeto é criado. Eles são usados para **inicializar os atributos** de um objeto, ou seja, definir valores iniciais para esses atributos.

### Características dos Construtores:

1. **Nome igual ao da classe**: O construtor tem exatamente o mesmo nome da classe em que está definido.
2. **Sem tipo de retorno**: Diferente de métodos comuns, o construtor não tem um tipo de retorno (nem mesmo `void`).
3. **Chamado automaticamente**: Quando você cria um objeto usando a palavra-chave `new`, o construtor é chamado automaticamente.
4. **Pode ter parâmetros**: Você pode criar construtores que recebem parâmetros para inicializar os atributos do objeto com valores específicos.

## Código utilizado na aula

📂 Os códigos desenvolvidos nesta aula estão disponíveis no diretório do projeto:

🔗 **Código-fonte**: [Acesse o código completo](https://github.com/joaofelipegalvao/dio-trilha-java-basico/tree/main/programacao-orientada-a-objetos/ConstrutoresJava/src/construtores)

Neste diretório, estão implementadas as classes `Pessoa` e `SistemaCadastro`, onde apliquei os conceitos de construtores para inicializar atributos de objetos.

## O que Aprendi?

1. **Inicialização de Objetos**:

   - Construtores permitem inicializar os atributos de um objeto de forma prática e organizada.
   - Eles são chamados automaticamente quando um objeto é criado.

2. **Uso do `this`**:

   - A palavra-chave `this` é usada para referenciar os atributos da classe dentro dos métodos.
   - Ela é especialmente útil quando o nome do parâmetro é o mesmo que o nome do atributo.

3. **Encapsulamento**:

   - Atributos privados e métodos públicos (getters e setters) ajudam a proteger os dados e controlar como eles são acessados ou modificados.

4. **Boas Práticas**:
   - Usar construtores e métodos getters/setters torna o código mais organizado e fácil de manter.

---

## Reflexão

Aprendi que os construtores são fundamentais para a criação de objetos em Java. Eles não apenas simplificam a inicialização dos atributos, mas também ajudam a garantir que os objetos sejam criados em um estado válido. Além disso, o uso do `this` e a separação entre atributos privados e métodos públicos são práticas essenciais para escrever código limpo e seguro.

---

## Próximos Passos

Agora que entendi o básico de construtores, quero explorar:

1. **Sobrecarga de Construtores**: Criar múltiplos construtores na mesma classe.
2. **Construtores Padrão**: Entender como o Java cria um construtor padrão quando nenhum é definido.
3. **Outros Conceitos de POO**: Aprofundar-me em herança, polimorfismo e encapsulamento.

---

🔗 **Código-fonte**: [Acesse o código completo no GitHub](https://github.com/joaofelipegalvao/dio-trilha-java-basico/tree/main/programacao-orientada-a-objetos/ConstrutoresJava/src/construtores)

---

📌 _Curso: Fundamentos da Programação Orientada a Objetos com Java - DIO_

---

Espero que este README.md seja útil para revisar meus aprendizados e compartilhar conhecimentos com outras pessoas. Se tiver dúvidas ou sugestões, é só entrar em contato! 😊

---

Feito com ❤️ por [Seu Nome].  
📧 [Seu e-mail]  
🌐 [Seu site ou perfil no GitHub]

---

Esse `README.md` é pessoal e explicativo, escrito em primeira pessoa para transmitir uma abordagem mais amigável e didática. Você pode personalizá-lo com suas informações e detalhes adicionais conforme necessário! 😊
