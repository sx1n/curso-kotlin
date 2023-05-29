fun main() {
    val f1: Forma = Forma(10, 8)
    val f2: Forma = Forma(10, 8)

    // f2 = f1 // aponta o f2 para o mesmo endereço de memoria pra f1

    println(f1.equals(f2))
    println()
    println(f1.toString())
    println(f1.hashCode())
    println("-------------")
    println(f2.toString())
    println(f2.hashCode())

    var f3: FormaData = FormaData(11, 9)
    val f4: FormaData = FormaData(11, 9)
    println()
    println(f3.equals(f4))
    println(f3.toString())
    println(f3.hashCode())
    println("----------")
    println(f4.toString())
    println(f4.hashCode())

    f3 = f4.copy() // faz um copia das propriedades de f4 para f3, sem apontar na memoria

}

class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        return if(other is Forma) {
            (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return "$a + $b"
    }
}
data class FormaData(val a: Int, val b: Int)
