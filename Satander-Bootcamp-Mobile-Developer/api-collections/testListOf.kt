fun main() {
 val douglas = Funcionario("Douglas", 2000.0, "CLT")
 val pedro = Funcionario("Pedro", 1500.0, "PJ")
 val alisu = Funcionario("Alisu", 4000.0, "PJ")

 val funcionarios = listOf(douglas, pedro, alisu)

 funcionarios.forEach { println(it) }

 println("-----------------")
 println(funcionarios.find { it.nome == "Alisu" })

 println("------------------")
 funcionarios.sortedBy {it.salario}.forEach { println(it) }

 println("------------------")
 funcionarios
    .groupBy { it.tipoContrato }
    .forEach { println(it) }
}

data class Funcionario(
    val nome:String,
    val salario: Double,
    val tipoContrato: String
) {
    override fun toString(): String =
    """
    Nome: $nome
    Salario: $salario
    """.trimIndent()
}
