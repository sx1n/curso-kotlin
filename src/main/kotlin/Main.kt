open class Eletronico(private var marca: String) {
    private fun corrente(ativo: Boolean) {}
    fun ligar() {
        corrente(true)
    }
    // ´open` também permite que a função da classe pai seja sobrescrita na classe filha, override
    open fun desligar() {
        corrente(false)
    }
}

class Computador(marca: String) : Eletronico(marca) {
    fun save() {}

    override fun desligar() {
        save()
        super.desligar() // chama o desligar da classe pai
    }


    // sobrecarga, Overload
    fun save(a: String) {}
    fun save(a: Int) {}
    fun save(a: Double) {}
    fun save(a: Float) {}

}
fun main() {
    val c = Computador("a")

    c.ligar()
    c.desligar()
}
