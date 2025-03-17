//8. Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"


fun main() {

    var soma = 0.0
    var i = 0
    while (i < 4) {
        println("Digite um valor entre 0 e 10: ")
        val nota = readln().toDouble()

        if (nota > 0 && nota < 10) {
            soma += nota
            i++
        }
    }
    //fazendo a média  dos valores digitados
    var media = soma / 4

    //apresentando o resultado
    println("Sua média foi: $media")

    if (media >= 5) {
        println("Você passou no teste!")
    } else {
        println("tente novamente")
    }
}