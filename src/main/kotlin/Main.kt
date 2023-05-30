fun main() {
    // Set é uma lista desordenada e não permite valores duplicados

    var set1: Set<String> = setOf("Paris", "Berlim", "Madrid", "Madrid")
    val set2: MutableSet<String> = mutableSetOf() // Set mútavel

    set2.addAll(set1)
    set2.remove("Madrid")
    println(set2)

}
