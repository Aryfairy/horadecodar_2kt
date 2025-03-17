//Escreva um programa em que o usuário informe dois números. Então escreva em tela o maior deles.

fun main() {
    println("Digite o primeiro valor: ")
    val n1 = readln().toDouble()
    println("Digite o segundo valor: ")
    val n2 = readln().toDouble()
    val resul = if (n1 > n2) println("$n1 é maior q $n2") else println("$n2 é maior que $n1")
}