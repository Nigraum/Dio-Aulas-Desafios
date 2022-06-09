fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Jorge"
    nomes[1] = "Douglas"
    nomes[2] = "Fabin"

    for (nome in nomes) {
        println(nome)
    }

    println("-------------------")
    nomes.sort()
    nomes.forEach {println(it)}

    val nomes2 = arrayOf("Jorge", "Douglas", "Fabin")

    println("-------------------")
    nomes2.sort()
    nomes2.forEach { println(it) }
}
