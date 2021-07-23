package com.teste.br.testes

import com.teste.br.Analista
import com.teste.br.Funcionario
import com.teste.br.Pessoa
import java.math.BigDecimal

fun main(){

    val joao = Analista(nome = "Joao", cpf = "564615165165", 2000.00)
    ImprimeRelatorioFuncionario.imprime(joao)
}
