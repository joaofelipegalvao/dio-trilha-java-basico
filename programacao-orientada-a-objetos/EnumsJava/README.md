# Enums em Java - Aprendizados e Prática

Este é um resumo do que aprendi no módulo **Enums** do curso **Fundamentos da Programação Orientada a Objetos com Java** da DIO. Aqui, compartilho meus códigos, explicações e reflexões sobre como os enums funcionam em Java.

## O que são Enums?

Enums (tipos enumerados) são estruturas especiais em Java que representam um conjunto fixo de constantes relacionadas. Eles são usados quando sabemos todos os valores possíveis que uma variável pode ter, como dias da semana, estados brasileiros, categorias de produtos etc.

### Características dos Enums:

1. **Coleção de constantes**: Cada valor enum é uma instância imutável do tipo enum.
2. **Podem ter atributos e métodos**: Assim como classes, enums podem ter campos e comportamentos.
3. **Construtores implícitamente privados**: Só podem ser chamados internamente para criar as constantes.
4. **Segurança de tipos**: O compilador verifica os valores usados, prevenindo erros.

## Código utilizado na aula

📂 Os códigos desenvolvidos nesta aula estão disponíveis no diretório do projeto:

🔗 **Código-fonte**: [Acesse o código completo](https://github.com/joaofelipegalvao/dio-trilha-java-basico/tree/main/programacao-orientada-a-objetos/EnumsJava/src/enums)

Neste diretório, estão implementados o enum `EstudoBrasileiro` e a classe `SistemaIbge`, onde apliquei os conceitos de enums para representar estados brasileiros.

## O que Aprendi?

1. **Organização de constantes**:

   - Enums agrupam valores relacionados de forma organizada e segura.
   - Substituem com vantagem o uso de constantes numéricas ou strings soltas.

2. **Comportamentos personalizados**:

   - Enums podem ter métodos próprios, como o `getNomeMaiusculo()` que criamos.
   - Podemos adicionar lógica específica para cada constante enum.

3. **Iteração sobre valores**:

   - O método `values()` permite acessar todas as constantes do enum.
   - Podemos percorrer os valores facilmente com um loop for-each.

4. **Padrões de design**:
   - Enums são úteis para implementar padrões como Singleton e State Machine.

## Reflexão

Aprendi que enums são muito mais poderosos do que simples listas de constantes. Eles permitem:

- Criar código mais legível e seguro em tempo de compilação
- Agrupar dados e comportamentos relacionados
- Implementar lógica específica para cada caso
- Substituir antigos padrões de constantes estáticas

Além disso, descobri que enums são amplamente utilizados em APIs Java e frameworks modernos, tornando essencial seu domínio para desenvolvimento profissional.

## Próximos Passos

Agora que entendi o básico de enums, quero explorar:

1. **Enums com métodos abstratos**: Para implementar comportamentos diferentes em cada constante.
2. **Enums em estruturas de controle**: Como usar em switch statements de forma eficiente.
3. **Padrões de projeto com enums**: Implementar soluções como Strategy Pattern usando enums.
4. **Enums em coleções**: Como usar eficientemente com Mapas e Conjuntos.

---

📌 _Curso: Fundamentos da Programação Orientada a Objetos com Java - DIO_

_"O conhecimento compartilhado cresce quando dividido"_ - Este README foi criado para ajudar outros aprendizes de Java. Sinta-se à vontade para contribuir ou sugerir melhorias!
