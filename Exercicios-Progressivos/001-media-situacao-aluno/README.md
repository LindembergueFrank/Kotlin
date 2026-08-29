# 001 — Média e situação do aluno

## Enunciado

Crie um programa em Kotlin que leia o nome de um aluno e duas notas, calcule a média aritmética e informe sua situação acadêmica.

A classificação deve obedecer às seguintes regras:

- média maior ou igual a `7.0`: **APROVADO**;
- média maior ou igual a `5.0` e menor que `7.0`: **RECUPERAÇÃO**;
- média menor que `5.0`: **REPROVADO**.

## Objetivo

Praticar os primeiros elementos de um programa Kotlin: declaração de valores, entrada e saída, operações aritméticas e tomada de decisão.

## Requisitos

1. Ler o nome do aluno.
2. Ler duas notas do tipo `Double`.
3. Calcular a média aritmética das notas.
4. Classificar o resultado com uma expressão `when`.
5. Exibir nome, média com duas casas decimais e situação final.

## Exemplo de entrada

```text
Marina
8.0
6.5
```

## Exemplo de saída

```text
Aluno: Marina
Média: 7.25
Situação: APROVADO
```

## Conceitos praticados

- `fun main()`;
- `val` e inferência de tipos;
- `readln()`;
- conversão com `toDouble()`;
- operadores aritméticos;
- expressão `when`;
- interpolação de strings;
- formatação numérica.

## Abordagem da solução

O programa recebe os valores pela entrada padrão e converte as notas para `Double`. A média é calculada pela soma das duas notas dividida por dois. Em seguida, um `when` sem argumento testa as faixas da média em ordem decrescente e retorna a situação correspondente.

Neste primeiro exercício, a solução permanece propositalmente simples. Validação robusta de entrada e tratamento de valores inválidos serão introduzidos em exercícios posteriores para que a complexidade cresça gradualmente.

## Validação

| Nota 1 | Nota 2 | Média | Resultado esperado |
| ---: | ---: | ---: | --- |
| 8.0 | 6.0 | 7.0 | APROVADO |
| 6.0 | 5.0 | 5.5 | RECUPERAÇÃO |
| 4.0 | 5.0 | 4.5 | REPROVADO |
| 10.0 | 10.0 | 10.0 | APROVADO |

## Executando

Com o compilador Kotlin instalado:

```bash
kotlinc src/Main.kt -include-runtime -d exercicio.jar
java -jar exercicio.jar
```
