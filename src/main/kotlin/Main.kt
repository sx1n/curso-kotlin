fun main() {
    var str: String? = null

    // t
    if (str != null) {
        str.lowercase()
        str.length
    }

    // `.let {}` só será executado se `str` for `null`
    // dentro desse escopo o `str` pode ser referenciado como `it`
    // Lembrando que o escopo aqui dentro é de função
    str?.let {
        str = "AAA"
        it.lowercase()
        it.length
    }

    println(str)
}
