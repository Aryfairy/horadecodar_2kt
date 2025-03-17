//Faça um programa que leia 6 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
fun main() {
    println("Digite o 1º número:")
    var n1 = readln().toDouble()

    println("Digite o 2º número:")
    var n2 = readln().toDouble()

    println("Digite o 3º número:")
    var n3 = readln().toDouble()

    println("Digite o 4º número:")
    var n4 = readln().toDouble()

    println("Digite o 5º número:")
    var n5 = readln().toDouble()

    println("Digite o 6º número:")
    var n6 = readln().toDouble()

    var media = (n1 + n2 + n3 + n4 + n5 + n6) / 6
    var soma = n1 + n2 + n3 + n4 + n5 + n6
    var sub = n1 - n2 - n3 - n4 - n5 - n6
    var div = n1 / n2 / n3 / n4 / n5 / n6
    var mult = n1 * n2 * n3 * n4 * n5 * n6

    println("-------------------------------------------------------------")
    println("O resultado do cáculo de adição é: $soma")
    println("O resultado do cáculo de subtração é: $sub")
    println("O resultado do cáculo de divisão é:$div")
    println("O resultado do cáculo de multiplicação é:$mult")
    println("-------------------------------------------------------------")

    println("-------------------------------------------------------------")
    println("Os números informados foram: $n1, $n2, $n3, $n4, $n5, $n6")
    println("E a média desses números é: $media")
    println("-------------------------------------------------------------")
}
