import kotlin.math.PI

fun main() {
   var nome = "Samuel Laurindo de Lima"

   parseYear(2)
   println(stringLength(nome))
   println(parseMiles(1.50))
   println(calculateCube(3))
   replaceAForX(nome)

}

fun parseYear(years: Int) {
   val monthsInAYear: Byte = 12
   val daysInAYear: Short = 365
   val hoursInAYear: Short = 8_760
   val minutesInAYear = 525_960
   val secondsInAYear = 31_536_000

   println("$years equivalem a:")
   println("${years * monthsInAYear} meses")
   println("${years * daysInAYear} dias")
   println("${years * hoursInAYear} horas")
   println("${years * minutesInAYear} minutos")
   println("${years * secondsInAYear} segundos")
}

fun stringLength(str: String): Int = str.length

fun calculateCube (n: Int): Int = (n * n * n)

fun parseMiles(miles: Double): Double = (miles * 1.609)

fun replaceAForX(str: String) {
   val newStr = str.replace("a", "x", true).uppercase()
   println(newStr)
}
