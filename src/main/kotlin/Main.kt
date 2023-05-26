fun main() {
    var s: String? = null // o ? permite o uso de nulos
    println(s?.length) // o ? protege de valores nulos
    println(s!!.length) // !! não protege de valores nulos
}
