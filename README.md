# Kotlin — Estudos e Exercícios

Repositório dedicado ao estudo contínuo de **Kotlin** por meio de exercícios progressivos, soluções documentadas e exemplos executáveis.

O objetivo é acompanhar a evolução técnica desde os fundamentos da linguagem até orientação a objetos, programação funcional, Collections, coroutines, testes, princípios de engenharia de software e arquitetura, sempre com foco em código idiomático e legível.

## 📈 Progressão dos exercícios

Os exercícios são organizados com dificuldade crescente. Cada novo problema deve considerar os conceitos já praticados, evitar repetições e introduzir novos recursos de forma gradual.

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

### Etapa 8 — Exercícios integradores

Nos estágios mais avançados, os exercícios combinam múltiplos conceitos, incluindo:

- múltiplas classes e pacotes;
- persistência simples;
- processamento de dados;
- validações;
- coroutines e Flow;
- testes;
- padrões de projeto;
- decisões de arquitetura;
- aplicações de console ou backend quando apropriado;
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

Quando necessário, um exercício pode utilizar uma estrutura Gradle:

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
5. **Conceitos praticados** — recursos de Kotlin utilizados.
6. **Abordagem da solução** — explicação objetiva do raciocínio.
7. **Implementação** — código Kotlin completo e executável.
8. **Validação** — casos de teste ou cenários utilizados para conferir a solução.
9. **Complexidade/decisões técnicas** — quando pertinente, registrar escolhas relevantes e possíveis alternativas.

## 🧭 Princípios dos exercícios

- não repetir problemas já existentes;
- aumentar a dificuldade continuamente;
- privilegiar código idiomático em Kotlin;
- utilizar null safety corretamente;
- preferir imutabilidade quando fizer sentido;
- evitar complexidade acidental;
- utilizar nomes claros para funções, classes e propriedades;
- introduzir abstrações apenas quando agregarem valor;
- manter cada exercício compreensível de forma independente;
- aplicar boas práticas compatíveis com o nível do exercício;
- evitar transportar padrões de Java mecanicamente quando Kotlin oferecer uma solução mais idiomática;
- documentar decisões importantes nos exercícios mais avançados.

## 🔀 Padrão de commits

Os exercícios utilizam **Conventional Commits** e commits atômicos.

Exemplos:

```text
feat(exercises): add basic input exercise
feat(exercises): add when expression exercise
feat(exercises): add collections transformation exercise
feat(exercises): add coroutine processing exercise
test(exercises): add validation scenarios
refactor(exercises): improve domain responsibilities
docs: update Kotlin exercise roadmap
```

Como regra, cada exercício novo deve ser entregue em **um commit próprio**, contendo apenas os arquivos relacionados àquele exercício.

## 📚 Referências de estudo

Os exercícios são autorais, mas utilizam materiais técnicos reconhecidos como apoio conceitual. As referências servem para estudar conceitos e orientar boas práticas, sem copiar exemplos literalmente.

### Livro principal

**AIGNER, Sebastian; ELIZAROV, Roman; ISAKOVA, Svetlana; JEMEROV, Dmitry. _Kotlin in Action_. 2. ed. Manning Publications, 2024. ISBN 9781617299605.**

O livro cobre fundamentos da linguagem, sistema de tipos, programação funcional, interoperabilidade com Java, generics, DSLs, coroutines, Flow e concorrência estruturada.

- Manning: https://www.manning.com/books/kotlin-in-action-second-edition

### Playlist em inglês

**Philipp Lackner — KOTLIN NEWBIE TO PRO**

Playlist prática em inglês com demonstrações progressivas de implementação em Kotlin.

- YouTube: https://www.youtube.com/playlist?list=PLQkwcJG4YTCRSQikwhtoApYs9ij_Hc5Z9

Material complementar do mesmo autor:

**Full 2025 Kotlin Crash Course For Beginners**

- YouTube: https://www.youtube.com/watch?v=dzUc9vrsldM

### Documentação oficial

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
