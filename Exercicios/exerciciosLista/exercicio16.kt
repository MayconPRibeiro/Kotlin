package exerciciosLista

fun main(){
    val valorPorDia = 8 * 25
    print("Dias trabalhados: ")
    val diasTrabalhados = readln().toInt()

    val salario = diasTrabalhados * valorPorDia

    println("Salario: $salario reais")
}