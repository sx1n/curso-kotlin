fun main() {
    valores(false)

    update()
}

// Any pode ser qualquer tipo do Kotlin, tem o mesmo comportamento de um Generic
// Unit é semelhante ao void do Java e funções sem retorno são inferidas como Unit
fun valores(arg: Any): Unit {

}

// Dificil de explicar, mas é quase a mesma ideia de interface
fun update(): Nothing {
    TODO("Não foi implementado")
}
