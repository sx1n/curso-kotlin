fun main() {
    println(media(1f, 2f, 3f, 44.5f, 8f, "", false))
}

fun <T, J> media(abc: J, vararg notas: T): Float {
    var soma = 0f

    for (nota in notas) {
        if (nota is Float) {
            soma += nota
        }
    }

    // A média retornada não é real, pois tem valores que não são numeros de fato
    return soma / notas.size
}
