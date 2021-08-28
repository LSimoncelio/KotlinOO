package one.digitalinonovation.dionebank.testes

import one.digitalinonovation.dionebank.Funcionario

class imprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario : Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}