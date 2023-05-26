fun main() {
    exercise1()
    println()

    exercise2()
    println()

    exercise3()
    println()

    exercise4()
    println()

    exercise5()
}

fun exercise1() {
    for (number in 1..50) {
        print("$number ")
    }
}

fun exercise2() {
    for (number in 50 downTo 1) {
        print("$number ")
    }
}

fun exercise3() {
    for (number in 1..50) {
        if (number % 5 == 0) {
            continue
        }

        print("$number ")

    }
}

fun exercise4() {
    var x = 0
    for (i in 0..500) {
        x += i
        println("Numero: $i, Soma Total: $x")
    }
}

fun exercise5() {
    print("Digite o numero do tamanho da escada: ")
    val x = readln().toInt()

    var s = ""
    for (i in 1..x) {
        s += "#"
        println(s)
    }
}
