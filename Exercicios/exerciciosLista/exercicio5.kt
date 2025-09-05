package exerciciosLista

fun main(){
    print("Nota 1: ")
    val nota1 = readLine()!!.toDouble()
    print("Nota 2: ")
    val nota2 = readLine()!!.toDouble()

    val nota_media = ((nota1 + nota2)/2)

    println("A média entre $nota1 e $nota2 é $nota_media")
}