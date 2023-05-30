fun main() {
    // Map é uma lista chave-valor com chaves únicas

    val map1: Map<String, String> = mapOf(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))
    var map2: MutableMap<String, String> = mutableMapOf() // map mútavel

    map2.putAll(map1)
    map2.remove("Alemanha")
    println(map2) // {França=Paris} PRA CIMAAAAA

}
