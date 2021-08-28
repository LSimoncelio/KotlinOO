package one.digitalinonovation.dionebank.testes

import one.digitalinonovation.dionebank.Cliente
import one.digitalinonovation.dionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da Silva",
        cpf = "123.123.123-12",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}