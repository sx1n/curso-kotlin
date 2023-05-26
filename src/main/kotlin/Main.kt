fun main() {
    var str: String? = null

    // Operador Elvis
    // OBS: NÃO É UM OPERADOR TERNARIO
    str?: println("String nula") // a função built-in só será executada se str for nulo

    // Kotlin não possui operador ternario, but
    val idade = 18
    val str2 = if (idade <= 18) "Maior de idade" else "Menor de idade"
    println(str2)
}
