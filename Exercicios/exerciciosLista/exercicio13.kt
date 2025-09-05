package exerciciosLista

fun main(){
    print("Valor do porduto: ")
    val valor = readln().toDouble()

    val valorPromocional = valor * 0.95

    println("o produto de valor $valor com desconto de 5% sairá por $valorPromocional")
}