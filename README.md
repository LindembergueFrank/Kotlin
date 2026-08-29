# Kotlin — Estudos, Exercícios e Desafios

Repositório dedicado ao estudo contínuo de **Kotlin**, com uma trilha autoral de exercícios progressivos, soluções documentadas e desafios práticos organizados para registrar a evolução técnica ao longo do tempo.

O objetivo é avançar dos fundamentos da linguagem até orientação a objetos, programação funcional, coleções, coroutines, testes, princípios de engenharia de software, arquitetura e pequenos projetos, mantendo um histórico de commits claro e rastreável.

## 🚀 Desafio Kotlin — 2 meses de evolução

A partir de **29 de agosto de 2026**, este repositório recebe uma trilha contínua de exercícios por **2 meses**, com encerramento em **29 de outubro de 2026**.

A dificuldade é **cumulativa e adaptativa**: um novo dia nunca reinicia a trilha. Antes de criar cada exercício, o conteúdo existente deve ser analisado para que o próximo desafio avance de forma coerente e evite repetições.

### Rotina de segunda a sexta

Execuções dentro da janela de **09h às 12h30**:

- 09h00
- 10h00
- 11h00
- 12h30

### Rotina de fim de semana

Sessões noturnas iniciadas aos sábados e domingos, dentro da janela de **20h às 02h30**:

- 20h00
- 21h00
- 22h00
- 23h00
- 00h00
- 01h00
- 02h30

A faixa após a meia-noite é tratada como continuação da sessão iniciada na noite anterior.

## 🎯 Objetivos da trilha

Ao longo dos dois meses, a trilha deve demonstrar não apenas conhecimento sintático, mas também evolução de raciocínio, legibilidade, modelagem e maturidade de engenharia.

Os exercícios devem progressivamente desenvolver:

- lógica de programação;
- domínio da sintaxe idiomática de Kotlin;
- decomposição de problemas;
- orientação a objetos e modelagem de domínio;
- programação funcional;
- null safety;
- manipulação eficiente de coleções;
- tratamento de erros;
- concorrência estruturada com coroutines;
- testes automatizados;
- princípios SOLID;
- padrões de projeto;
- organização de código e arquitetura;
- integração dos conceitos em pequenos sistemas.

## 📈 Trilha de aprendizagem

### Etapa 1 — Fundamentos de Kotlin

- `fun main` e estrutura básica;
- `val` e `var`;
- tipos básicos e inferência de tipos;
- entrada e saída;
- operadores aritméticos, relacionais e lógicos;
- condicionais com `if` e `when`;
- ranges;
- laços `for` e `while`;
- primeiros problemas de lógica.

### Etapa 2 — Funções e estruturas da linguagem

- funções;
- parâmetros nomeados e valores padrão;
- funções de expressão única;
- null safety;
- safe call (`?.`);
- operador Elvis (`?:`);
- arrays;
- strings;
- destructuring;
- extension functions;
- escopo e organização do código;
- decomposição de problemas em funções menores.

### Etapa 3 — Orientação a Objetos

- classes e objetos;
- construtores primários e secundários;
- propriedades;
- encapsulamento;
- `data class`;
- `enum class`;
- `sealed class` e `sealed interface`;
- composição;
- herança;
- polimorfismo;
- classes abstratas;
- interfaces;
- modelagem de entidades e regras de domínio.

### Etapa 4 — Collections e programação funcional

- `List`, `Set` e `Map`;
- coleções mutáveis e imutáveis;
- lambdas;
- funções de ordem superior;
- `map`, `filter`, `associate`, `groupBy`, `reduce` e `fold`;
- sequences;
- comparadores;
- transformação e agregação de dados;
- pipelines de processamento.

### Etapa 5 — Kotlin intermediário e avançado

- generics;
- variance;
- tratamento de exceções;
- leitura e escrita de arquivos;
- delegação;
- `lazy`;
- object declarations;
- companion objects;
- inline functions;
- funções reified quando pertinentes;
- DSLs introdutórias;
- reflection somente quando agregar valor ao exercício.

### Etapa 6 — Concorrência e assincronismo

- fundamentos de concorrência;
- coroutines;
- `suspend`;
- coroutine scopes;
- dispatchers;
- jobs;
- cancelamento;
- tratamento de erros em coroutines;
- structured concurrency;
- Flow;
- processamento concorrente de dados;
- sincronização e segurança de estado quando necessárias.

### Etapa 7 — Qualidade e engenharia de software

- Clean Code;
- princípios SOLID;
- testes automatizados;
- separação de responsabilidades;
- refatoração;
- modelagem de domínio;
- tratamento explícito de regras de negócio;
- padrões de projeto aplicáveis;
- organização em pacotes e camadas quando o problema justificar;
- Gradle e estruturação de projetos.

### Etapa 8 — Desafios integradores

Nos estágios finais, os exercícios passam a combinar múltiplos conceitos em pequenos sistemas Kotlin, incluindo:

- múltiplas classes e pacotes;
- persistência simples;
- processamento de dados;
- validações;
- coroutines e Flow;
- testes;
- padrões de projeto;
- decisões de arquitetura;
- pequenos projetos de console ou backend quando apropriado;
- documentação de trade-offs e decisões técnicas.

## 📂 Organização dos exercícios

Os exercícios progressivos são organizados em:

```text
Exercicios-Progressivos/
├── 001-nome-do-exercicio/
│   ├── README.md
│   └── src/
│       └── Main.kt
├── 002-nome-do-exercicio/
│   ├── README.md
│   └── src/
│       └── Main.kt
└── ...
```

Quando necessário, um exercício pode evoluir para uma estrutura como:

```text
exercicio/
├── README.md
├── build.gradle.kts
├── settings.gradle.kts
└── src/
    ├── main/kotlin/
    └── test/kotlin/
```

A complexidade estrutural só deve aumentar quando for útil para o conteúdo estudado.

## 📝 Documentação de cada exercício

Cada exercício deve conter, sempre que aplicável:

1. **Enunciado** — descrição clara do problema.
2. **Objetivo** — competência principal desenvolvida.
3. **Requisitos** — regras da implementação.
4. **Entrada e saída esperadas** — exemplos de execução.
5. **Conceitos praticados** — recursos de Kotlin trabalhados.
6. **Abordagem da solução** — explicação objetiva do raciocínio.
7. **Implementação** — código Kotlin completo e executável.
8. **Validação** — casos de teste ou cenários utilizados para conferir a solução.
9. **Complexidade/decisões técnicas** — quando pertinente, registrar escolhas relevantes e possíveis alternativas.

## 🧭 Princípios da trilha

- começar no nível mais iniciante;
- não repetir problemas já existentes;
- aumentar a dificuldade continuamente;
- privilegiar código idiomático em Kotlin;
- utilizar null safety corretamente;
- preferir imutabilidade quando fizer sentido;
- evitar complexidade acidental;
- utilizar nomes claros para funções, classes e propriedades;
- introduzir abstrações apenas quando agregarem valor;
- manter cada exercício compreensível de forma independente;
- aplicar boas práticas compatíveis com o nível atual da trilha;
- evitar simplesmente transportar padrões de Java para Kotlin quando a linguagem oferecer uma solução mais idiomática;
- documentar decisões importantes nos desafios mais avançados.

## 🔀 Padrão de commits

A trilha utiliza **Conventional Commits** e commits atômicos.

Exemplos:

```text
feat(exercises): add basic input challenge
feat(exercises): add when expression challenge
feat(exercises): add collections transformation challenge
feat(exercises): add coroutine processing challenge
test(exercises): add validation scenarios
refactor(exercises): improve domain responsibilities
docs: update Kotlin learning roadmap
```

Como regra, cada exercício novo deve ser entregue em **um commit próprio**, contendo apenas os arquivos relacionados àquele desafio.

## 📚 Referências de estudo

A trilha é autoral, mas utiliza materiais técnicos reconhecidos como apoio conceitual. Os exercícios não devem copiar exemplos literalmente; as referências servem para estudar conceitos e orientar boas práticas.

### Livro principal

**AIGNER, Sebastian; ELIZAROV, Roman; ISAKOVA, Svetlana; JEMEROV, Dmitry. _Kotlin in Action_. 2. ed. Manning Publications, 2024. ISBN 9781617299605.**

O livro acompanha a progressão proposta para o repositório: fundamentos da linguagem, sistema de tipos, programação funcional, interoperabilidade com Java, generics, DSLs, coroutines, Flow e concorrência estruturada.

- Manning: https://www.manning.com/books/kotlin-in-action-second-edition

### Playlist em inglês

**Philipp Lackner — KOTLIN NEWBIE TO PRO**

Playlist prática em inglês que apresenta Kotlin progressivamente e complementa o estudo escrito com demonstrações de implementação.

- YouTube: https://www.youtube.com/playlist?list=PLQkwcJG4YTCRSQikwhtoApYs9ij_Hc5Z9

Como material complementar mais recente do mesmo autor, o curso _Full 2025 Kotlin Crash Course For Beginners_ revisita fundamentos, nullability, `when`, arrays, loops, funções, extension functions, lambdas, classes, interfaces, sealed classes e generics.

- YouTube: https://www.youtube.com/watch?v=dzUc9vrsldM

### Documentação oficial

A documentação oficial deve ser utilizada como fonte primária para confirmar comportamento da linguagem, APIs e recursos atuais:

- Kotlin Documentation: https://kotlinlang.org/docs/home.html
- Kotlin Coroutines Guide: https://kotlinlang.org/docs/coroutines-guide.html

## 🛠️ Tecnologias e conceitos

- Kotlin
- JVM
- Programação Orientada a Objetos
- Programação Funcional
- Collections
- Null Safety
- Generics
- Coroutines
- Flow
- Gradle
- Testes automatizados
- SOLID
- Design Patterns
- Modelagem e Arquitetura de Software

## ▶️ Executando os exercícios

Clone o repositório:

```bash
git clone https://github.com/LindembergueFrank/Kotlin.git
cd Kotlin
```

Para exercícios simples com `Main.kt`, utilize o compilador Kotlin ou um ambiente compatível e siga as instruções do `README.md` do próprio exercício.

Exercícios com Gradle, testes, coroutines ou dependências adicionais terão comandos específicos documentados no respectivo diretório.

## 👤 Autor

**Lindembergue Frank**

[LinkedIn](https://www.linkedin.com/in/lindembergue-frank-b991202b7/)

---

`Kotlin` `Algorithms` `OOP` `Functional Programming` `Coroutines` `Flow` `SOLID` `Design Patterns` `Software Engineering`