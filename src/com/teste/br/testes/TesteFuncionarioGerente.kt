package com.teste.br.testes

import com.teste.br.Analista
import com.teste.br.Funcionario
import com.teste.br.Gerente
import com.teste.br.Pessoa
import java.math.BigDecimal

fun main(){

    val Maria = Gerente(nome = "Maria do bairro", cpf = "564615165165", 6000.00, senha = "123456")

    ImprimeRelatorioFuncionario.imprime(Maria)

    TesteAutenticacao().autentica(Maria)
}

