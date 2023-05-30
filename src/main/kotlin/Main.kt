class Matematica {

    // Todas as estruturas abaixo de comportam como `static`
    // companion object pode, mas não precisa de nome
    // Só pode haver 1 companion object na classe
    // é possível acessar seus valores sem passar o nome definido na estrutura
    companion object Valores {
        val PI = 3.1415
        fun teste() {}

        init {
            println("Serei chamado apenas 1 vez")
        }
    }

    // Bom para agrupar valores estaticos
    // Tem que referenciar o nome do object para acessar os seus valores
    object obj1 {
        val PI = 3.1415
        fun teste() {}

        init {
            println("Fui acessado no obj1")
        }
    }
    object obj2 {
        val PI = 3.1415
        fun teste() {}

        init {
            println("Fui acessado no obj2")
        }
    }
}
fun main() {
    Matematica.PI
    Matematica.Valores.PI // também é possível acessar metodos e atributos estaticos através do nome do companion object

    Matematica.teste()
    Matematica.Valores.teste()

    Matematica.obj1.PI
    Matematica.obj1.teste()

    Matematica.obj2.PI
    Matematica.obj2.teste()
}
