package one.digitalinnovation.collections

fun main() {
    // forma mais verbosa
    // como ja inicializei o array com uma string, a IDE deixa explicito que não precisa tipa-lo
    // val nomes = Array<String>(3) {""}
    val nomes = Array(3) {""}

    // inserindo valores no vetor
    nomes[0] = "Pedro"
    nomes[1] = "Iasmim"
    nomes[2] = "Teste"

    // iterando
    for (nome:String in nomes) {
        println(nome)
    }

    println("----------------Vetor ordenado----------------")
    // ordenando o vetor
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    // outra forma de declarar vetor de Strings
    val nomes2 = arrayOf("Pedro", "Iasmim", "Teste")

    // iterando
    for (nome:String in nomes2) {
        println(nome)
    }

    println("----------------Vetor ordenado----------------")
    // ordenando o vetor
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }

}