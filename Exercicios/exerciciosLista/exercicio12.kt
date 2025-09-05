package exerciciosLista

fun main(){
    print("Valor de A: ")
    val valorA = readln().toDouble()
    print("Valor de B: ")
    val valorB = readln().toDouble()
    print("Valor de C: ")
    val valorC = readln().toDouble()

    val delta = (valorB*valorB)-(4*valorA*valorC)

    println("Delta = $delta")
    println("$delta = ($valorB²)-(4*$valorA*$valorC)")
}