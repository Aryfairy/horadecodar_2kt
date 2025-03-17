//7. Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada e também todos valores que o usuário informou.


fun main() {

    var listNum = mutableListOf<Double>()
    var soma = 0.0

    var i = 0
    while (i < 6) {
        println("Digite um número:")
        var num = readln().toDouble()
        listNum.add(num)

        if (num < 72) {
            soma += num
        }
        i++
    }

    println("Os números informados foram: $listNum")

    println("A soma dos números menores que 72 é: $soma")
}