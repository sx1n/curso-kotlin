fun main() {
    val name = "Samuel"

    println("==== Estrutura de Repetição for: Iterando uma String ($name) ====")
    for (char in name) {
        print(char)
    }

    println("\n\n==== Estrutura de Repetição for: Contando de 1 a 20 de 2 em 2 ====")
    for (i in 1..20 step 2) {
        print("$i ")
    }

    println("\n\n==== Estrutura de Repetição for: Contando ao contrario, de 20 até 0 ====")
    for (i in 20 downTo 0) {
        print("$i ")
    }


}
