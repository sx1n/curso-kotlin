fun geraDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(
    val nome: String,
    val calorias: Int,
    val ingredientes: List<Ingrediente> = listOf()
)

data class Ingrediente(val nome: String, val quantidade: Int)

fun main() {
    val data = geraDados()

    val lst = listOf(1, 2, 3, 4, 4, 4, 5, 8, 8, 9)

    println(lst)
    println(lst.distinct()) // Não repete os valores
    println(lst.sorted()) // ordena
    println(lst.sortedDescending()) // ordena de forma decrescente
    println(lst.reversed()) // inverte o Array

}
