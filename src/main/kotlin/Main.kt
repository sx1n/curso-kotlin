fun main() {
    println(bonus("Gerente", 2))
}

fun bonus(cargo: String, experiencia: Int): Float {
    var bonus = 0f

    when (cargo) {
        "Gerente" -> {
            if (experiencia < 2) {
                bonus = 2000f
            } else {
                bonus = 3000f
            }
        }
        "Coordenador" -> {
            if (experiencia < 1) {
                bonus = 1500f
            } else {
                bonus = 1800f
            }
        }
        "Engenheiro de software" -> {
            bonus = 1000f
        }
        "Estágiario" -> {
            bonus = 500f
        }
    }

    return bonus
}
