fun main() {
    print("Nome do aluno: ")
    val nome = readln()

    print("Primeira nota: ")
    val nota1 = readln().toDouble()

    print("Segunda nota: ")
    val nota2 = readln().toDouble()

    val media = (nota1 + nota2) / 2

    val situacao = when {
        media >= 7.0 -> "APROVADO"
        media >= 5.0 -> "RECUPERAÇÃO"
        else -> "REPROVADO"
    }

    println()
    println("Aluno: $nome")
    println("Média: %.2f".format(media))
    println("Situação: $situacao")
}
