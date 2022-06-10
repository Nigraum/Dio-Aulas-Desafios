fun main() {
 val douglas = Funcionario("Douglas", 1000.0)
 val pedro = Funcionario("Pedro", 2000.0)
 val alisu = Funcionario("Alisu", 4000.0)

 val funcionarios = listOf(douglas, pedro, alisu)

 funcionarios.forEach { println(it) }

 println("-----------------")
 println(funcionarios.find { it.nome == "Alisu" })
}

data class Funcionario(
    val nome:String,
    val salario: Double
) {
    override fun toString(): String =
    """
    Nome: $nome
    Salario: $salario
    """.trimIndent()
}
