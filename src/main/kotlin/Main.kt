fun main() {
    try {
        var s: String? = null // o ? permite o uso de nulos
        println(s!!.length) // !! não protege de valores nulos
    } catch (e: NullPointerException) {
        println("Variável nula")
    } catch (e: Exception) {
        println("Capturando qualquer tipo de exceção")
    } finally {
        // ... codigo
        // Esse bloco de codigo sempre vai ser executado, independente de qualquer erro ou sucesso
        // Bloco Opcional
    }
}
