package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario:Double in salarios) {
        println(salario)
    }

    println("-----------------------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    print("Media salarios: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500 }
    println("-----------------------------------")
    for (salario:Double in salariosMaiorQue2500) {
        println(salario)
    }

    println("-----------------------------------")
    // contando salarios que estão dentro do range
    println(salarios.count{it in 2000.0..5000.0})

    println("-----------------------------------")
    // buscando exatamente um valor
    println(salarios.find { it == 2250.0 })

    println("-----------------------------------")
    // buscando um valor que não tenha
    println(salarios.find { it == 221350.0 })

    println("-----------------------------------")
    // buscando qualquer valor que esteje na condição
    println(salarios.any { it == 1000.0 })

    println("-----------------------------------")
    // buscando qualquer valor que não esteje na condição
    println(salarios.any { it == 1.0 })
}

