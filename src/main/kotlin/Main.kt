fun main() {
    // List

    val lst1: List<Int> = listOf(1, 2, 3, 4, 5) // Não pode ser alterada
    val lst2: MutableList<Int> = mutableListOf(1,2,3,4,5) // Pode ser alterada

    println(lst1[0])
    println(lst2.size)

    lst2.add(8)
    lst2.add(10)

    lst2.remove(8)
    lst2.removeAt(0)

    println(lst2)
    lst2.clear()
    println(lst2)

}
