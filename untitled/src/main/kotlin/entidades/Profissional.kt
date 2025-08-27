package org.example.entidades

import org.example.enumeradores.Funcao
import org.example.enumeradores.Setor
import org.example.enumeradores.Sexo
import java.math.BigDecimal
import kotlin.collections.subtract

class Profissional (
    cpf: String,
    nome : String,
    idade : Int,
    sexo : String,
    val funcao : Funcao,
    val salario : BigDecimal,
    val experiencia : Int,
    val habilidade : String,
    val setor : Setor,
    val equipamento : List<String>
) : Pessoa(
    cpf = cpf,
    idade = idade,
    nome = nome,
    sexo = sexo
){
    //Comportamento
    fun instalarCaixaDaAgua() : Boolean{
        return this.funcao == Funcao.OPERADOR
    }

    fun instalacaoCompleta() : String{
        return if (this.funcao == Funcao.OPERADOR){
            "Instalação concluída"
        } else {
            "Instalação mal sucedida"
        }
    }
    //O Polimorfismo nada mais é do que fazer uma SOBREESCRITA do
    //método que está na superclasse
    override fun receberConta(conta : Conta, aPagar : BigDecimal){
        conta.saldo = conta.saldo.subtract(aPagar)
    }
}