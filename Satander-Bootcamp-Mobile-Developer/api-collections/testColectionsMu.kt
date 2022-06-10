fun main() {
    val joao = Funcionario ("Joao", 2000.0)
    val pedro = Funcionario ( "Pedro", 1500.0 )
    val maria = Funcionario ("Maria", 4000.0)

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach {println(it)}

    println("------------------")
    funcionarios.add(pedro)
    funcionarios.forEach {println(it)}

    println("------------------")
    funcionarios.remove(joao)
    funcionarios.forEach {println(it)}
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
