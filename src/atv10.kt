//10. Tendo como entrada a altura e o gênero designado ao nascer (codificado da seguinte forma: 1: feminino - 2: masculino - ) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas.

fun main() {


    println("-------Calcule seu peso ideal-------")

    println("De acordo com o seu gênero designado ao nascer digite:  1-Feminino ou 2- Masculino")
    var gen = readln().toIntOrNull()
    if (gen == 1 || gen == 2) {

        when (gen) {
            1 -> {
                println("Digite a sua altura em metros(não esqueça do ponto): ")
                var alt = readln().toDoubleOrNull()
                if (alt != null) {
                    var resul = (62.1 * alt) - 44.7
                    println("\nSeu peso ideal é: $resul kg")
                } else {
                    println("Algo deu errado. Tente novamente")
                }
            }

            2 -> {
                println("Digite a sua altura em metros: ")
                var alt = readln().toDoubleOrNull()
                if (alt != null) {
                    var resul = (72.7 * alt) - 58
                    println("\nSeu peso ideal é: $resul kg")
                } else {
                    println("Algo deu errado. Tente novamente")
                }
            }
        }
    } else {
        println("Opção inválida")
    }
}
