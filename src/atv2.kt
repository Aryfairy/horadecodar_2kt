//Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

fun main() {
    println("Digite um valor: ")
    val num = readln().toInt()

    if (num == 0) {
        println("O valor digitado é Zero!")
    } else if (num < 0) {
        println("O valor digitado é Negativo!")
    } else {
        println("O valor digitado é Positivo!")
    }
}
