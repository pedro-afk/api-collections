package one.digitalinnovation.collections

fun main() {
    val pedro = Funcionario("Pedro", 2100.0, "PJ")
    val iasmim = Funcionario("Iasmim", 2200.0, "CLT")
    val maria = Funcionario("Maria", 1500.0, "CLT")

    val funcionarios1 = setOf<Funcionario>(iasmim, pedro)
    val funcionarios2 = setOf<Funcionario>(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    for (result:Funcionario in resultUnion) {
        println(result)
    }

    println("-------------------------------------------")
    val funcionarios3 = setOf<Funcionario>(iasmim, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    for (result:Funcionario in resultSubtract) {
        println(result)
    }

    println("-------------------------------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    for (result:Funcionario in resultIntersect) {
        println(result)
    }

}