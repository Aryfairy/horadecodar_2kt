//Faça um programa que leia 3 valores informados pelo usuário (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
fun main() {
    println("Digite o primeiro valor: ")
    val n1 = readln().toDouble()
    println("Digite o segundo valor: ")
    val n2 = readln().toDouble()
    println("Digite o terceiro valor: ")
    val n3 = readln().toDouble()

    if (n1 > n3 && n2 > n3) {
        println("A soma dos dois maiores $n1 e $n2 é: ${n1 + n2}")
    }
    if (n1 > n2 && n3 > n2) {
        println("A soma dos dois maiores $n1 e $n3 é: ${n1 + n3}")
    }
    if (n2 > n1 && n3 > n1) {
        println("A soma dos dois maiores $n3 e $n2 é: ${n3 + n2}")
    } else {
        println("Algum valor inválido. Tente novamente.")
        return
    }
}