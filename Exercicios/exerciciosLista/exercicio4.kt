package exerciciosLista

fun main(){
    print("Digite um número: ")
    val num1 = readLine()!!.toInt()
    print("Digite outro número: ")
    val num2 = readLine()!!.toInt()

    println("Soma: ${num1 + num2}")
}