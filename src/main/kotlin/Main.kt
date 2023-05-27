class Pessoa(var nome: String, var anoDeNascimento: Int) {
    fun comer() {}

    fun falar() {}
}

fun main() {
    val pessoa: Pessoa = Pessoa("Samuel", 2004)

    println(pessoa.toString()) // igual Java
}
