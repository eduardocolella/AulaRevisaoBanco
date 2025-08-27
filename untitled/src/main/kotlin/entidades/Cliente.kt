package org.example.entidades

class Cliente(
    nome: String,
    idade: Int,
    sexo: String,
    cpf: String,
    val endereco: String,
    val situacao: String
) : Pessoa(
    nome = nome,
    idade = idade,
    sexo = sexo,
    cpf = cpf
){

}