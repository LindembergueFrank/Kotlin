# Kotlin — Estudos, Exercícios e Desafios

Repositório dedicado ao estudo contínuo de **Kotlin**, com uma trilha autoral de exercícios progressivos, soluções documentadas e desafios práticos organizados para registrar a evolução técnica ao longo do tempo.

O objetivo é avançar dos fundamentos da linguagem até tópicos de orientação a objetos, programação funcional, coleções, coroutines, testes, arquitetura e pequenos projetos, mantendo um histórico de commits claro e rastreável.

## 🚀 Desafio Kotlin — 2 meses de evolução

A partir de **29 de agosto de 2026**, este repositório recebe uma trilha contínua de exercícios por aproximadamente **2 meses**, com encerramento previsto em **29 de outubro de 2026**.

A dificuldade é cumulativa: um novo dia nunca reinicia a trilha. Cada exercício considera os anteriores e aumenta gradualmente a complexidade.

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

A madrugada é tratada como continuação da sessão iniciada na noite anterior.

## 📈 Trilha de aprendizagem

A progressão é adaptativa e deve acompanhar o conteúdo já presente no repositório.

### Etapa 1 — Fundamentos de Kotlin

- `fun main` e estrutura básica;
- `val` e `var`;
- tipos básicos;
- inferência de tipos;
- entrada e saída;
- operadores;
- condicionais com `if` e `when`;
- ranges;
- laços `for` e `while`.

### Etapa 2 — Funções e estruturas da linguagem

- funções;
- parâmetros nomeados e valores padrão;
- expressões;
- null safety;
- operadores Elvis e safe call;
- arrays;
- strings;
- destructuring;
- extension functions;
- escopo e organização do código.

### Etapa 3 — Orientação a Objetos

- classes e objetos;
- construtores;
- propriedades;
- encapsulamento;
- `data class`;
- `enum class`;
- `sealed class` e `sealed interface`;
- composição;
- herança;
- polimorfismo;
- interfaces.

### Etapa 4 — Collections e programação funcional

- `List`, `Set` e `Map`;
- coleções mutáveis e imutáveis;
- lambdas;
- funções de ordem superior;
- `map`, `filter`, `reduce`, `fold` e operações relacionadas;
- sequences;
- comparadores;
- transformação e agregação de dados.

### Etapa 5 — Kotlin intermediário e avançado

- generics;
- variance;
- tratamento de exceções;
- arquivos;
- delegação;
- lazy initialization;
- object declarations;
- companion objects;
- DSLs introdutórias;
- reflection quando pertinente.

### Etapa 6 — Concorrência e assincronismo

- fundamentos de concorrência;
- coroutines;
- `suspend`;
- scopes;
- dispatchers;
- jobs;
- tratamento de erros em coroutines;
- Flow;
- processamento concorrente de dados.

### Etapa 7 — Qualidade e engenharia de software

- Clean Code;
- princípios SOLID;
- testes automatizados;
- separação de responsabilidades;
- refatoração;
- modelagem de domínio;
- padrões de projeto aplicáveis;
- organização em camadas quando o problema justificar.

### Etapa 8 — Desafios integradores

Nos estágios finais, os exercícios passam a combinar múltiplos conceitos em pequenos sistemas Kotlin, incluindo:

- múltiplas classes e pacotes;
- persistência simples;
- processamento de dados;
- validações;
- coroutines;
- testes;
- padrões de projeto;
- decisões de arquitetura;
- pequenos projetos de console ou backend quando apropriado.

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

Quando necessário, um exercício pode utilizar uma estrutura Gradle, múltiplos arquivos, pacotes e testes.

## 📝 Documentação de cada exercício

Cada exercício deve conter, sempre que aplicável:

1. **Enunciado** — descrição clara do problema.
2. **Requisitos** — regras da implementação.
3. **Entrada e saída esperadas** — exemplos de execução.
4. **Conceitos praticados** — recursos de Kotlin trabalhados.
5. **Abordagem da solução** — explicação objetiva do raciocínio.
6. **Implementação** — código Kotlin completo e executável.
7. **Validação** — casos de teste ou cenários utilizados para conferir a solução.

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
- aplicar boas práticas compatíveis com o nível atual da trilha.

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

Como regra, cada exercício novo deve ser entregue em um commit próprio contendo apenas os arquivos relacionados àquele desafio.

## 🛠️ Tecnologias e conceitos

- Kotlin
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

Para exercícios simples com `Main.kt`, utilize um ambiente Kotlin compatível ou siga as instruções do `README.md` do próprio exercício.

Exercícios com Gradle, testes, coroutines ou dependências adicionais terão comandos específicos documentados no respectivo diretório.

## 👤 Autor

**Lindembergue Frank**

[LinkedIn](https://www.linkedin.com/in/lindembergue-frank-b991202b7/)

---

`Kotlin` `Algorithms` `OOP` `Functional Programming` `Coroutines` `SOLID` `Design Patterns` `Software Engineering`