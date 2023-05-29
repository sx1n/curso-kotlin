class Receita {
    lateinit var instrucoes: String // só será alocada na memoria quando for inicializada

    fun gerarReceita() {
        instrucoes = "Lave as mãos."
    }

    fun imprimeReceita() {
        if(!this::instrucoes.isInitialized) {
            instrucoes = "Lave as mãos."
        }
    }
}
fun main() {
    val r = Receita()

    r.imprimeReceita()
    println(r.instrucoes)
}
