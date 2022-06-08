package digionebank.dio.testes

import digionebank.dio.banco

fun main() {
    val digiOneBank = Banco( nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

}
