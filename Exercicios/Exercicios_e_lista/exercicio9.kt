package Exercicios_e_lista

fun main(){
    print("Digite uma distancia em metros: ")
    val metros = readLine()!!.toInt()
    val centimetros = metros*100
    println("$metros Metros equivale a $centimetros Centimetros")
}