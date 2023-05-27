class Pessoa(var nome: String, var anoDeNascimento: Int) {

    var doc: String? = null

    // Construtor Secundario que chama o Primario
    constructor(nome: String, anoDeNascimento: Int, doc: String): this(nome, anoDeNascimento) {
        this.doc = doc
    }

    fun comer() {}

    fun falar() {}
}

fun main() {
    val pessoa: Pessoa = Pessoa("Samuel", 2004, "cpf")

    println(pessoa.toString()) // igual Java
}
