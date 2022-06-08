package digionebank.dio

class Pessoa {
  var nome: String = "Yan"
  var cpf: String = "123.123.123-11"
  private set

  inner class Endereco {
    var rua: String = "Rua santo"
  }
}

fun main() {
  val yan = Pessoa()

  println(yan.nome)
  println(yan.cpf)

  println(yan.Endereco().rua)
}

