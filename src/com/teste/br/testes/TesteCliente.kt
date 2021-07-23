package com.teste.br.testes

import com.teste.br.Cliente
import com.teste.br.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose da silva",
        cpf = "37931345800",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)

}
