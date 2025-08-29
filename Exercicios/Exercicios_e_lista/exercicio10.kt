package Exercicios_e_lista

fun main(){
    print("Quantos reais possui? ")
    val reais = readLine()!!.toDouble()

    val dolares = reais*5.43
    val dolares_formatado = String.format("%.2f", dolares)

    println("R$$reais reais equivale a $$dolares_formatado dolares")
}