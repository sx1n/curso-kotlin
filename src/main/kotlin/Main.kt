abstract class Mamifero(val nome: String) {
    fun acordar() {
        println("Acordei.")
    }
    fun dormir() {
        println("dormi")
    }

    abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome) {
    override fun falar() {

    }
}
fun main() {
    val m = Cachorro("Joao")
}
