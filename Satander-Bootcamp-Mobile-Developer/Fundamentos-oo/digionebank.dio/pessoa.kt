package digionebank.dio

class Pessoa {
  var nome: String = "Yan"
  var cpf: String = "123.123.123-11"
  private set


  constructor ()

  fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
  val yan = Pessoa()

    println(yan.pessoaInfo())

}

test git

