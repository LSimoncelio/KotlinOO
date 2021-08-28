package one.digitalinonovation.dionebank.testes

import one.digitalinonovation.dionebank.Funcionario
import one.digitalinonovation.dionebank.Gerente

fun main() {
    val maria = Gerente("Maria Carlos", "321654987", 5000.00)

    imprimeRelatorioFuncionario.imprime(maria)
}