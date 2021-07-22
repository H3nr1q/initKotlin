package com.teste.br
/*
classe que espera dados
precisa de informacoes para seguir na aplicação

*/


data class Banco(
    val nome : String,
    val numero : Int
){
    fun info() = "$nome - $numero"
}







