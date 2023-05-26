fun main() {

    var i = 0
    println("==== break ====")
    while(i < 10000) {

        println("$i")

        if(i == 8) {
            break
        }

        i++
    }

    val name = "Ana Banana"
    println("\n==== continue ====")
    for(char in name) {
        if (char.lowercase() == "a") {
            continue
        }

        print(char)
    }
}
