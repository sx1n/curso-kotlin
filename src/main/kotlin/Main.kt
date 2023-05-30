interface Funcionario {
    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

fun mostraBonus(funcionario: Funcionario) {
    println(funcionario.bonus())
}

fun main() {
    mostraBonus(Gerente(10000f))
    mostraBonus(Analista(10000f))
}
