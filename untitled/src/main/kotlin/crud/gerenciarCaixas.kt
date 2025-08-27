package org.example.crud

import org.example.entidades.CaixaDAgua
import org.example.enumeradores.Material

fun cadastrarCaixa(){
    /*
    val material: String,
    val capacidade: Double?,
    val altura: Double,
    val largura: Double,
    val profundidade: Double,
    val blablablabla: String,
    PLASTICO, PVC, METAL, ARGAMASSA

    */
    println("Escolha o material do qual a caixa é composta: ")
    println("1 - Plástico")
    println("2 - PVC")
    println("3 - Metal")
    println("4 - Argamassa")
    val opcao = readln().toInt()
    var material : Material
    when(opcao){
        1-> material = Material.PLASTICO
        2-> material = Material.PVC
        3-> material = Material.METAL
        4-> material = Material.ARGAMASSA
        else -> material = Material.PLASTICO
    }

    println("Capacidade da Caixa em litros: ")
    val litros = readln().toDouble()

    println("Largura da Caixa: ")
    val larg = readln().toDouble()

    println("Profundidade da Caixa: ")
    val prof = readln().toDouble()

    println("Altura da Caixa: ")
    val altura = readln().toDouble()

    println("blablablabla da Caixa: ")
    val blabla = readln().toString()

    println("Material da Caixa: ")
    val materialCaixa = readln().toString()

    CaixaDAgua(
        material = materialCaixa,
        litros = litros,
        profundidade = prof,
        largura = larg,
        blablablabla = blabla,
        altura = altura,
    )
}

fun editarCaixa(){

}

fun listarCaixas(){

}

fun excluirCaixa(){

}