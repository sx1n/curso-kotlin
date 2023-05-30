private class X

// para habilitar a herança a classe pai deve ser `open`
open class Eletronico(private var marca: String) {
    private fun ativarCorrente() {} // public, protected e private são a mesma coisa do Java
    fun ligar() {
        ativarCorrente()
    }
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
    c.desligar()
}
