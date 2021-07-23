package com.teste.br.testes

import com.teste.br.Funcionario

class ImprimeRelatorioFuncionario{
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}