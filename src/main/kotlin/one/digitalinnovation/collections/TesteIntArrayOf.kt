package one.digitalinnovation.collections

fun main() {
    // recurso intArrayOf que inicializa um array, sem precisar definir um tamanho
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    // values.forEach {
    //     println(it)
    // }
    for (value in values) {
        println(value)
    }

    // ordenando vetor
    values.sort()
    println("Vetor ordenado utilizando a funcao sort")
    for(value in values) {
        println(value)
    }

}