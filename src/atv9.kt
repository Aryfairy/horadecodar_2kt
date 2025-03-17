//9. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).


fun main() {

    println("Digite o seu ano de nascimento para saber se poderá votar esse ano:")
    var ano = readln().toInt()

    var idade = 2025 - ano

    if (idade >= 16) {
        println("Você poderá votar esse ano!")
    } else {
        println("Você não poderá votar esse ano!")
    }

}
