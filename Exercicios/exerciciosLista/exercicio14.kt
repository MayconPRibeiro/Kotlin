package exerciciosLista

fun main(){
    print("Valor do Salario atual: ")
    val salario = readln().toDouble()

    val salarioAumento = salario * 1.15

    println("o salario de valor $salario com aumento de 15% será $salarioAumento")
}