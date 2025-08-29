package Exercicios_e_lista

fun main(){
    print("Número: ")
    val numero = readLine()!!.toDouble()

    println("Dobro de $numero = " + (numero*2))
    println("Terça parte de $numero = " + (numero/3))
}