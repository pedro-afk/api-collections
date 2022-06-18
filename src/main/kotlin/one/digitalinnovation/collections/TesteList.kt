package one.digitalinnovation.collections

fun main() {
    val pedro = Funcionario("Pedro", 2100.0, "PJ")
    val iasmim = Funcionario("Iasmim", 2200.0, "CLT")
    val maria = Funcionario("Maria", 1500.0, "CLT")

    val funcionarios = listOf<Funcionario>(pedro, iasmim, maria)

    for (funcionario:Funcionario in funcionarios) {
        println(funcionario)
    }

    println("----------------------------------------")
    // buscando so um funcionario
    println(funcionarios.find { it.nome == "Iasmim" })

    println("----------------------------------------")
    // sortedBy, ordenando os funcionarios pelo salario, srotedBy pelo salario
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("----------------------------------------")
    // groupBy, agrupando os funcionarios por tipo de contratacao
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
}

data class Funcionario(val nome:String, val salario:Double, val tipoContratacao: String) {
    override fun toString(): String {
        return """
            Nome: $nome 
            Salario: $salario
            """.trimIndent()
    }
}