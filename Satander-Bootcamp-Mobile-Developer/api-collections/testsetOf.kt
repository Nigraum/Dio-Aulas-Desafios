fun main() {
    val joao = Funcionario("Joao", 2000.0, "PJ")
    val maicon = Funcionario("Maicon", 1500.0, "CLT")
    val ana = Funcionario("Ana", 4000.0, "PJ")

    val funcionarios1 = setOf(joao, maicon)
    val funcionarios2 = setOf (ana)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }
}



data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContrato: String
) {
    override fun toString(): String =
    """
    Nome: $nome
    Salario: $salario
    """.trimIndent()
}


