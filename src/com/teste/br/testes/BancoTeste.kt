package com.teste.br.testes

import com.teste.br.Banco

fun main(){
    val digiOneBank = Banco("Digione", 12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy("Banco2")

    println(banco2.nome)
    println(banco2.numero)

    println(banco2.info())
}