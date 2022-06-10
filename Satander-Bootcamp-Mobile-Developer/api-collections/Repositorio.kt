class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun creat(id: String, value:T) {
        map[id] = value
    }

    fun findById(id: String) = map[id]

}

fun main() {
    val douglas = funcionario("Douglas", 2000.0, "CLT")
    val pedro = funcionario("Pedro", 1500.0, "PJ")
    val alisu = funcionario("Alisu", 4000.0, "PJ")

    val repositorio = Repositorio<funcionario>()
    repositorio.create(douglas.nome,douglas)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(alisu.nome, alisu)

    println(repositorio.findById(douglas.nome))
}
