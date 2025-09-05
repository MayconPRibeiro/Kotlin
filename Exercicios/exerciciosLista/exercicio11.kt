package exerciciosLista

fun main(){
    print("Digite a base: ")
    val base = readln().toDouble()
    print("Digite altura: ")
    val altura = readln().toDouble()

    val area = base * altura
    val qtdTinta = area / 2

    println("Voce irá pintar uma area de $area m²")
    println("Voce usará $qtdTinta litros de tinta")
}