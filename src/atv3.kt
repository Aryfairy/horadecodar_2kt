//Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles

fun main() {
    println("Digite o primeiro valor: ")
    val n1 = readln().toDouble()
    println("Digite o segundo valor: ")
    val n2 = readln().toDouble()
    println("Digite o terceiro valor: ")
    val n3 = readln().toDouble()

    if (n1 > n2 && n1 > n3) {
        println("O primeiro valor: $n1 é o maior valor digitado!")
    } else if (n2 > n1 && n2 > n3) {
        println("O segundo valor: $n2 é o maior valor digitado!")
    } else if (n3 > n1 && n3 > n2) {
        println("O terceiro valor: $n3 é o maior valor digitado!")
    } else {
        println("Não foi possível fazer a comparação. Tente novamente.")
        return
    }
}