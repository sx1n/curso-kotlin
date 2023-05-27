import org.junit.jupiter.api.*

class MainTest {

    @Test
    fun testPortaria() {
        Assertions.assertEquals(portaria(17, "", ""), "Negado.")
        Assertions.assertEquals(portaria(18, "", ""), "Negado.")
        Assertions.assertEquals(portaria(19, "aaaaa", ""), "Negado.")
        Assertions.assertEquals(portaria(18, "comum", ""), "Negado.")
        Assertions.assertEquals(portaria(18, "comum", "xt"), "Welcome.")
        Assertions.assertEquals(portaria(18, "comum", "xl"), "Negado.")
        Assertions.assertEquals(portaria(18, "premium", "xl"), "Welcome.")
    }
}