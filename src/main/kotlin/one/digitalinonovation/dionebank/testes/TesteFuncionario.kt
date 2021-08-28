package one.digitalinonovation.dionebank.testes

import one.digitalinonovation.dionebank.Funcionario
import one.digitalinonovation.dionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val lucas = Pessoa(nome = "Lucas Okabe", cpf = "12345678")

    println(lucas)
    println(lucas.nome)
    println(lucas.cpf)

    val joao = Funcionario("Lucas Simoncelio", "321654987", BigDecimal.valueOf(2000.00))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}
