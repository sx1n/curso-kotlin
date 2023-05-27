import org.junit.jupiter.api.*
import java.lang.NullPointerException

class MainTest {

    @Test
    fun testeIfElse() {
        Assertions.assertTrue(maiorDeIdade(29))
    }

    @Test
    @DisplayName("Teste método xxoo")
    fun testCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertTrue(countXO("xxxooo")) }
        )
    }

    @Test
    @Disabled // teste desabilitado
    fun naoImplementado() {}

    @Test
    fun vaiFalhar() {
        fail("Não posso terminar sem esse metodo") // sempre irá falhar
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxooo")) // Código de cima

        // Se o código de cima não for executado com sucesso, o teste será ignorado
        // Os códigos abaixo só serão executados se o código de cima for executado com sucesso
        Assertions.assertTrue(abc())
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc() }
    }
}