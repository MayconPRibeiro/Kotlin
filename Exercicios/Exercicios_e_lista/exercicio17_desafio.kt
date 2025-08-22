package Exercicios_e_lista

fun main(){
    print("Quantos cigarros fuma por dia? ")
    val cigarros_por_dia = readLine()!!.toInt()
    print("Fuma a quantos anos? ")
    val qtd_anos = readLine()!!.toInt()

    val anos_em_dias = qtd_anos * 365
    val total_por_anos = anos_em_dias * cigarros_por_dia
    val total = (((total_por_anos * 10) / 60) / 24)

    print("Você perdeu aproximadamente $total dias")
}