
/*

1- Criamos a fun MAIN que é uma função principal para o nosso sistema
2- Criamos fun FORMULA que recebe as variaveis M do tipo Int e A do tipo Int
3- Colocamos dois pontos ":" após as variaveis e definimos o tipo de dado que retornaremos na função, que no caso será Int de inteiro
4- Abrimos as chaves "{}" para delimitar o que a função irá fazer
5- No caso da função FORMULA, returnamos usando o RETURN a multiplicação das variaveis "M" e "A"
6- Voltamos a função MAIN onde definimos a função "PRINTLN" que escreve na tela, para ele escrever a função "FORMULA" que criamos, e dentro de parenteses passamos os argumentos da nossa função para serem multiplicados

*/


fun main(){

    println(formula(2, 3))
    println(formula(11, 15))

}

fun formula(m: Int, a: Int): Int {
    return m * a
}