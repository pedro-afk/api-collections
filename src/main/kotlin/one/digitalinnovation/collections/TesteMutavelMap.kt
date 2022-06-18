package one.digitalinnovation.collections

fun main() {
    val pedro = Funcionario("Pedro", 2100.0, "PJ")
    val iasmim = Funcionario("Iasmim", 2200.0, "CLT")
    val maria = Funcionario("Maria", 1500.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(iasmim.nome, iasmim)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(pedro.nome))

    println("-------------------------------------")
    repositorio.findAll().forEach { println(it) }

    println("-------------------------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }

}