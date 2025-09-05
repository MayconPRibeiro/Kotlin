package exerciciosLista

fun main(){
    print("Valor: ")
    val valor = readLine()!!.toInt()

    println("Antecessor de $valor: " + (valor - 1))
    println("Sucessor de $valor: " + (valor + 1))
}