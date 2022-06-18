package one.digitalinnovation.collections

fun main() {
    // atraves da mutable lists conseguimos fazer alteracoes nas mesmas
    // os filtros são os mesmos

    val pedro = Funcionario("Pedro", 2100.0, "PJ")
    val iasmim = Funcionario("Iasmim", 2200.0, "CLT")
    val maria = Funcionario("Maria", 1500.0, "CLT")

    println("--------------- Mutable List ---------------")
    val funcionarios = mutableListOf<Funcionario>(pedro, iasmim)
    funcionarios.forEach { println(it) }

    println("--------------------------------------")
    funcionarios.add(maria)
    funcionarios.forEach { println(it) }

    println("--------------------------------------")
    funcionarios.remove(pedro)
    funcionarios.forEach { println(it) }

    println("--------------- Mutable Set ---------------")
    val funcionarioSet = mutableSetOf<Funcionario>(maria)
    funcionarioSet.forEach { println(it) }

    println("--------------------------------------")
    funcionarioSet.add(iasmim)
    funcionarioSet.add(pedro)
    funcionarioSet.forEach { println(it) }

    println("--------------------------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}