# 002 — Analisador de número inteiro

## Enunciado

Crie um programa em Kotlin que leia um número inteiro e apresente uma análise básica sobre ele.

O programa deve informar:

- se o número é **positivo**, **negativo** ou **zero**;
- se é **par** ou **ímpar**;
- se é divisível por `3`;
- se é divisível por `5`.

## Objetivo

Praticar decisões encadeadas, operadores aritméticos e lógicos e reutilização de resultados intermediários sem aumentar desnecessariamente a complexidade do código.

## Requisitos

1. Ler um valor inteiro pela entrada padrão.
2. Classificar o sinal usando `when`.
3. Determinar paridade com o operador `%`.
4. Verificar divisibilidade por `3` e por `5`.
5. Exibir os resultados de forma clara.

## Exemplo de entrada

```text
15
```

## Exemplo de saída

```text
Número: 15
Sinal: POSITIVO
Paridade: ÍMPAR
Divisível por 3: SIM
Divisível por 5: SIM
```

## Conceitos praticados

- `Int`;
- `readln()`;
- `toInt()`;
- expressão `when`;
- operador módulo `%`;
- operadores relacionais;
- expressões booleanas;
- interpolação de strings.

## Abordagem da solução

O número é lido uma única vez. O sinal é classificado por uma expressão `when`, enquanto as demais propriedades são calculadas com expressões booleanas e o operador módulo. Cada resultado intermediário recebe um nome descritivo para manter a leitura simples.

## Validação

| Entrada | Sinal | Paridade | /3 | /5 |
| ---: | --- | --- | --- | --- |
| 15 | POSITIVO | ÍMPAR | SIM | SIM |
| -8 | NEGATIVO | PAR | NÃO | NÃO |
| 0 | ZERO | PAR | SIM | SIM |
| 9 | POSITIVO | ÍMPAR | SIM | NÃO |
| 20 | POSITIVO | PAR | NÃO | SIM |

> Em matemática inteira, `0` é par e é divisível por qualquer inteiro não nulo; por isso as verificações por `3` e `5` resultam em `SIM`.

## Executando

```bash
kotlinc src/Main.kt -include-runtime -d exercicio.jar
java -jar exercicio.jar
```
