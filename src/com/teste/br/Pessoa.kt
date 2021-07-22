package com.teste.br

class Pessoa {

    

    var nome: String = "Henrique"
    var cpf: String = "123.123.123-00"
    private set


    constructor()

    fun pessoaInfo() = "$nome e $cpf"



}


fun main(){
    val henrique = Pessoa()

    println(henrique.pessoaInfo())

}