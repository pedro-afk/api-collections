package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 2500.32
    salarios[1] = 2032.4
    salarios[2] = 584.12

    for (salario:Double in salarios) {
        println(salario)
    }

    // outra forma da iteração
    salarios.forEachIndexed {index, salario ->
        // multiplicando o valor de cada salario em seu indice específico
        salarios[index] = salario * 1.2
    }

    println("------------Aumento salario------------")
    for (salario:Double in salarios) {
        println(salario)
    }

    // declarando com doubleArrayOf
    val salarios2 = doubleArrayOf(2500.32, 2032.4, 584.12)

    println("------------Salarios ordenados------------")
    salarios2.sort()
    for (salario:Double in salarios2) {
        println(salario)
    }

}