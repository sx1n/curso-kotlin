fun main() {
    endereco("street", "city", "rj", "5000")

    // Também é possível trocar a ordem dos argumentos, mas terá que nomear todos eles
    endereco(cidade = "city", rua = "street", estado = "rj", cep = "5000")
}

// `numero` será 0 se não for passado como argumento
fun endereco(rua: String, cidade: String, estado: String, cep: String, numero: Int = 0) {

}
