fun main() {
    print("Digite um número inteiro: ")
    val numero = readln().toInt()

    val sinal = when {
        numero > 0 -> "POSITIVO"
        numero < 0 -> "NEGATIVO"
        else -> "ZERO"
    }

    val paridade = if (numero % 2 == 0) "PAR" else "ÍMPAR"
    val divisivelPor3 = numero % 3 == 0
    val divisivelPor5 = numero % 5 == 0

    println()
    println("Número: $numero")
    println("Sinal: $sinal")
    println("Paridade: $paridade")
    println("Divisível por 3: ${if (divisivelPor3) "SIM" else "NÃO"}")
    println("Divisível por 5: ${if (divisivelPor5) "SIM" else "NÃO"}")
}
