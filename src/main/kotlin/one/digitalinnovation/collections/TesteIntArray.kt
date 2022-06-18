package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5);

    values[0] = 5
    values[1] = 4
    values[2] = 3
    values[3] = 2
    values[4] = 1

    for (valor in values) {
        println(valor)
    }

    println("--------------------------------------")
    values.forEach {
        println(it)
    }

    println("--------------------------------------")
    values.forEach { valor ->
        println(valor)
    }

    println("--------------------------------------")
    for (index in values.indices) {
        println(values[index])
    }


    println("--------------------------------------")
    values.sort()
    for (valor in values) {
        println(valor)
    }

}