import kotlin.reflect.typeOf

fun main() {
    println(media(1f, 2f, 3f, 44.5f, 8f))
}

fun media(vararg notas: Float): Float {
    var soma = 0f

    // println("$notas \ntipo de notas: ${notas::class.java.simpleName}")

    // notas virá como um Float[]
    for (nota in notas) {
        soma += nota
    }

    return soma / notas.size
}
