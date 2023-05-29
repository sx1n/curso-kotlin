enum class Prioridade(val value: Int) {
    Baixa(1) {
        override fun toString(): String {
            return "Prioridade baixa: $value"
        }
    },
    Media(5), Alta(10)
}

fun main() {
    for (prioridade in Prioridade.values()) {
        println("${prioridade}:${prioridade.value}")
    }
}
