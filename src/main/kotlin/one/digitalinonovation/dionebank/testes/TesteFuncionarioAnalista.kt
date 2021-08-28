package one.digitalinonovation.dionebank.testes

import one.digitalinonovation.dionebank.Analista
import one.digitalinonovation.dionebank.Funcionario
import one.digitalinonovation.dionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val joao = Analista("João Carlos", "321654987", 2000.00)
    imprimeRelatorioFuncionario.imprime(joao)
}

