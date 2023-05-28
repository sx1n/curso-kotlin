class Animal(var especie: String) {
    // Cada Atributo terá seu getter e setter
    var fala: String = "eii"
        get() {
            println("Sou o getter de $field")
            return field // field está referenciando o atributo `fala`
        }
        set(value) {
            println("Sou setter de $field")
            field = value
        }
}
fun main() {
    val animal = Animal("cachorro")

    /*
    * Toda vez que ´fala´ é acessado, o get() de fala é chamado
    * Por isso é usado `field` dentro da classe para se referenciar ao atributo
    * Sem isso teria recursividade infinita
    */
    println(animal.fala)

    animal.fala = "auau"
}
