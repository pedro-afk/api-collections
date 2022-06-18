package one.digitalinnovation.collections

fun main() {
    val pair:Pair<String, Double> = Pair("Pedro", 2100.0)
    val map1 = mapOf(pair)

    for (p in map1) {
        println("{Key: ${p.key} - Value: ${p.value}}")
    }

    // recurso in fix, a gente consegue com que tenha esse tipo de sintaxe
    val map2 = mapOf(
        "Maria" to 1500.00,
        "Iasmim" to 2200.00
    )

    for (p in map2) {
        println("{Key: ${p.key} - Value: ${p.value}}")
    }

}