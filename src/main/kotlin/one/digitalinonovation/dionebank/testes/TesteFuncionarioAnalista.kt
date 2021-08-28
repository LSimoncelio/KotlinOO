package one.digitalinonovation.dionebank.testes

import one.digitalinonovation.dionebank.Analista

fun main() {
    val joao = Analista("João Carlos", "321654987", 2000.00)

    imprimeRelatorioFuncionario.imprime(joao)
}

