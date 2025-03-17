//11. Uma micro calculadora. Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem executadas (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação). O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos. Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações
fun main() {
    println("=============================")
    println("        CALCULADORA")
    println("=============================")

    print("Digite o primeiro valor: ")
    val n1 = readln().toDoubleOrNull()

    print("Digite o segundo valor: ")
    val n2 = readln().toDoubleOrNull()

    if (n1 == null || n2 == null) {
        println("Algo deu errado. Insira apenas números válidos.")
        return
    }

    println("Escolha uma operação: \n1 - Adição\n2 - Subtração\n3 - Divisão\n4 - Multiplicação")
    val calc = readln().toIntOrNull()

    val resul = when (calc) {
        1 -> n1 + n2
        2 -> n1 - n2
        3 -> if (n2 != 0.0) n1 / n2 else "Valor inválido. Tente novamente"
        4 -> n1 * n2
        else -> "Ops, operação inválida!"
    }
    println("O resultado da operação é: $resul")
}