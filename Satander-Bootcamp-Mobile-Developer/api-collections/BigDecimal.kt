import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()


    fun main() {
        val salarios = arrayOf(
            "2000.0".toBigDecimal(),
            "1500.0".toBigDecimal(),
            "4000.0".toBigDecimal()
    )

    println(salarios.somatoria())
    println("-----------------")
    println(salarios.media())
}
