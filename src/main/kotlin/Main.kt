interface Selvagem {
    fun atacar() {
        println("ataque")
    }
}
abstract class Mamifero(val nome: String) {
    fun acordar() {
        println("Acordei.")
    }
    fun dormir() {
        println("dormi")
    }

    abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome), Selvagem {
    override fun falar() {

    }

    override fun atacar() {
        println("ataque de cachorro auau")
    }
}



fun main() {
    val m = Cachorro("Joao").atacar()
}
