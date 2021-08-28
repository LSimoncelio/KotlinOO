package one.digitalinonovation.dionebank.testes

import one.digitalinonovation.dionebank.Gerente

fun main() {
    val maria = Gerente("Maria Carlos", "321654987", 5000.00, "senha23")

    imprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}