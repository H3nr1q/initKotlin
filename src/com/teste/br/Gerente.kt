package com.teste.br

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Login{
    override fun calculaAuxilio(): Double = salario * 0.4
    override fun login(): Boolean = "123456" == senha
}