package one.digitalinonovation.dionebank

class Pessoa {
    var nome: String = "Lucas"
    var cpf: String = "123.123.123-12"
}

fun main() {
    val lucas = Pessoa()

    println(lucas.nome)
    println(lucas.cpf)
}