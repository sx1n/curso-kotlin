class Pessoa(var nome: String, var anoDeNascimento: Int) {
    fun comer() {}

    fun falar() {}

    fun dormir() {}

    fun correr() {}
}
fun main() {
    val p = Pessoa("samuel", 1985)

    p.comer()
    p.falar()
    p.dormir()
    p.correr()

    // Os dois são equivalentes
    with(p) {
        comer()
        falar()
        dormir()
        correr()
        println(this.nome) // "samuel"
    }
}
