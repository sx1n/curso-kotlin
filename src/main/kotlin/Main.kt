fun main() {
    exercise1()
    println()

    exercise2()
    println()

    exercise3()
    println()

    println(exercise4("xyyyyyyy"))
    println()
}

fun exercise1() {
    val waterTankLimit = 2_000

    var amountOfWaterInTank = 7
    var counter = 0

    while (waterTankLimit > amountOfWaterInTank) {
        amountOfWaterInTank = 7 * counter
        counter++
    }

    println("The maximum amount of water balloons that the Water Box can hold is ${(amountOfWaterInTank / 7) - 1}")

}

fun exercise2() {
    for (number in 1 until 50) {
        if (number % 5 == 0 && number % 3 == 0) {
            println("FizzBuzz: $number")
        } else if (number % 3 == 0) {
            println("Buzz: $number")
        } else if (number % 5 == 0) {
            println("Fizz: $number")
        }
    }
}

fun exercise3() {
    var str: String = ""

    while (str.isEmpty()) {
        print("Digite uma frase: ")
        str = readln()
    }

    println("Frase invertida: ${str.reversed()}")
}

fun exercise4(str: String): Boolean {
    var quantityOfX = 0
    var quantityOfY = 0

    var i = 0
    while (i < str.length) {

        if (str[i] == 'x') {
            quantityOfX += 1
        } else if (str[i] == 'y') {
            quantityOfY += 1
        }

        i++
    }

    return quantityOfX == quantityOfY
}
