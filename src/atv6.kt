//6. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números informados serão diferentes)

fun main() {


    println("Digite o 1º número:")
    var n1 = readln().toDouble()
    println("Digite o 2º número:")
    var n2 = readln().toDouble()
    println("Digite o 3º número:")
    var n3 = readln().toDouble()
    println("Digite o 4º número:")
    var n4 = readln().toDouble()

    if (n1 == n2 || n1 == n3 || n1 == n4 || n2 == n3 || n2 == n4 || n3 == n4) {
        println("valores iguais não são validos")
    } else if (n1 > n2 && n1 > n3 && n1 > n4) {
        println("O primeiro número foi: $n1")
        println("O último número foi: $n4")
        println("O maior número foi: $n1")
    } else if (n2 > n1 && n2 > n3 && n2 > n4) {
        println("O primeiro número foi: $n1")
        println("O último número foi: $n4")
        println("O maior número foi: $n2")
    } else if (n3 > n1 && n3 > n2 && n3 > n4) {
        println("O primeiro número foi: $n1")
        println("O último número foi: $n4")
        println("O maior número foi: $n3")
    } else if (n4 > n2 && n4 > n3 && n4 > n1) {
        println("O primeiro número foi: $n1")
        println("O último número foi: $n4")
        println("O maior número foi: $n4")
    } else {
        println("ALgo deu errado. Tente novamente")
        return
    }
}
