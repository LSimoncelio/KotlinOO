package one.digitalinonovation.dionebank.testes

import one.digitalinonovation.dionebank.Banco

fun main () {
    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")

    println(banco2.info())
}