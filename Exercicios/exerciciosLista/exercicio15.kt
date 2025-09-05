package exerciciosLista

fun main(){
    print("Dias alugado: ")
    val dias = readln().toInt()
    print("Kilometros percorrido: ")
    val km = readln().toDouble()

    val diasCalculado = dias*90
    val kmCalculado = km*0.20
    val valorTotal = kmCalculado + diasCalculado

    println("Pelos Dias: $diasCalculado reais")
    println("Pelos Kms: $kmCalculado reais")
    println("Total: $valorTotal reais")
}