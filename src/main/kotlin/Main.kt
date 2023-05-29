open class Eletronico(var marca: String) {
    fun ligar() {}
    fun desligar() {}
}

class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {}
}
fun main() {
    val c = Computador("a")

    c.ligar()
    c.instalarSoftware()
    c.processar()
}
